package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface FacturaDao extends JpaRepository<FacturaEntity, Integer> {

}
