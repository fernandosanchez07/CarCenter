package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.FotoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FotoDao extends JpaRepository<FotoEntity, Integer> {
}
