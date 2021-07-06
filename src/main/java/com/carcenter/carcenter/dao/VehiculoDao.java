package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.VehiculoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VehiculoDao extends JpaRepository<VehiculoEntity, Integer> {
}
