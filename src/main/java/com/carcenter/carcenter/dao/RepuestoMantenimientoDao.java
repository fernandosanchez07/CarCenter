package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.RepuestoMantenimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RepuestoMantenimientoDao extends
        JpaRepository<RepuestoMantenimientoEntity, Integer> {

    List<RepuestoMantenimientoEntity> getAllByCodigoMantenimiento(Integer codigo);
}
