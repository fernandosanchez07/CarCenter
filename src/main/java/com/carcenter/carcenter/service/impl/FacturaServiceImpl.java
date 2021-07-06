package com.carcenter.carcenter.service.impl;

import com.carcenter.carcenter.dao.FacturaDao;
import com.carcenter.carcenter.dto.FacturaDto;
import com.carcenter.carcenter.dto.MensajeResponseDto;
import com.carcenter.carcenter.dto.ResponseCalculosDto;
import com.carcenter.carcenter.entity.FacturaEntity;
import com.carcenter.carcenter.entity.MantenimientoEntity;
import com.carcenter.carcenter.entity.MecanicoEntity;
import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;
import com.carcenter.carcenter.service.FacturaService;
import com.carcenter.carcenter.service.MantenimientoService;
import com.carcenter.carcenter.service.MecanicoService;
import com.carcenter.carcenter.service.RepuestoMantenimientoService;
import com.carcenter.carcenter.service.ServicioMantenimientoService;
import com.carcenter.carcenter.type.EstadoMantenimiento;
import com.carcenter.carcenter.type.EstadoMecanico;
import com.carcenter.carcenter.validator.LimiteMantenimientoValidator;
import javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    private FacturaDao facturaDao;

    @Autowired
    private MantenimientoService mantenimientoService;

    @Autowired
    private RepuestoMantenimientoService repuestoMantenimientoService;

    @Autowired
    private ServicioMantenimientoService servicioMantenimientoService;

    @Autowired
    private MecanicoService mecanicoService;

    @Autowired
    private LimiteMantenimientoValidator limiteMantenimientoValidator;

    @Override
    public List<FacturaEntity> getAll() {
        return facturaDao.findAll();
    }

    @Override
    public MensajeResponseDto save(Integer codigo) throws NotFoundException {
        FacturaEntity facturaEntity = new FacturaEntity();
        FacturaDto facturaDto = new FacturaDto();
        ResponseCalculosDto responseCalculosDto = new ResponseCalculosDto();

        Optional<MantenimientoEntity> mantenimiento = mantenimientoService.getFindById(codigo);
        if (!mantenimiento.isPresent()) {
            throw new NotFoundException("No se encontro el mantenimiento.");
        }

        responseCalculosDto = calcularValorRepuestos(codigo, responseCalculosDto);
        facturaDto.setTotalRepuestos(responseCalculosDto.getValor());
        facturaDto.setRespuestoMantenimiento(responseCalculosDto.getRepuestosMantenimiento());
        facturaEntity.setTotalRepuestos(responseCalculosDto.getValor());
        int valorRepuestos = responseCalculosDto.getValor();

        responseCalculosDto = calcularValorServicios(codigo, responseCalculosDto);
        facturaDto.setTotalRepuestos(responseCalculosDto.getValor());
        facturaDto.setServicioMantenimientoEntity(responseCalculosDto.getServiciosMantenimiento());
        facturaEntity.setTotalRepuestos(responseCalculosDto.getValor());
        int valorServicios = responseCalculosDto.getValor();

        int valorTotal = valorRepuestos + valorServicios;
        limiteMantenimientoValidator.validarLimite(valorTotal, mantenimiento, facturaEntity);
        facturaEntity.setTotalPagar(valorTotal);
        facturaDto.setTotalPagar(valorTotal);
        facturaDao.save(facturaEntity);

        actualizaEstadoMantenimiento(mantenimiento.get());

        Optional<MecanicoEntity> mecanicoEntity =
                mecanicoService.getFindById(mantenimiento.get().getDatosMecanico().getDocumento());
        actualizaEstadoMecanico(mantenimiento.get(), mecanicoEntity.get());


        return new MensajeResponseDto(true, "Factura generada exitosamente.", facturaDto);
    }

    @Override
    public MensajeResponseDto update(FacturaEntity facturaEntity) {
        return new MensajeResponseDto(true, "Registro actualizado.", facturaDao.save(facturaEntity));
    }

    @Override
    public FacturaEntity delete(FacturaEntity facturaEntity) {
        return null;
    }

    public ResponseCalculosDto calcularValorRepuestos(Integer codigo, ResponseCalculosDto responseCalculosDto) {
        List<RepuestoMantenimientoEntity> repuestosMantenimiento =
                repuestoMantenimientoService.getAllByCodigoMantenimiento(codigo);

        int valorRepuestos = repuestosMantenimiento.stream().mapToInt(
                precioRepuestos -> precioRepuestos.getCodigoRepuesto().getPrecioUnitario()).sum();
        return new ResponseCalculosDto(valorRepuestos, repuestosMantenimiento, null);
    }

    public ResponseCalculosDto calcularValorServicios(Integer codigo, ResponseCalculosDto responseCalculosDto) {
        List<ServicioMantenimientoEntity> serviciosMantenimiento =
                servicioMantenimientoService.getAllByCodigoMantenimiento(codigo);
        int valorServicios = serviciosMantenimiento.stream().mapToInt(
                precioServicios -> precioServicios.getCodgigoServicio().getPrecio()).sum();

        if (valorServicios > 3000000) {
            valorServicios = (int) (valorServicios * 0.5);
            return new ResponseCalculosDto(valorServicios, null, serviciosMantenimiento);
        }
        return new ResponseCalculosDto(valorServicios, null, serviciosMantenimiento);
    }

    private void actualizaEstadoMantenimiento(MantenimientoEntity mantenimiento) {
        mantenimiento.setEstado(EstadoMantenimiento.TERMINADO.getValue());
        mantenimientoService.update(mantenimiento);
    }

    private void actualizaEstadoMecanico(MantenimientoEntity mantenimientoEntity, MecanicoEntity mecanicoEntity) {
        mecanicoEntity.setEstado(EstadoMecanico.LIBRE.getValue());
        mecanicoService.update(mecanicoEntity);
    }

}
