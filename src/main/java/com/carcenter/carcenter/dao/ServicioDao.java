package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.ServicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioDao extends JpaRepository<ServicioEntity, Integer> {
}
