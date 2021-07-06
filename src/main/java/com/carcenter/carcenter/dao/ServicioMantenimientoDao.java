package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.ServicioMantenimientoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ServicioMantenimientoDao extends JpaRepository<ServicioMantenimientoEntity, Integer> {

    List<ServicioMantenimientoEntity> findByCodigoMantenimiento(Integer integer);
}
