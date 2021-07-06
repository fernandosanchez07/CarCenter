package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.MarcaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarcaDao extends JpaRepository<MarcaEntity, Integer> {
}
