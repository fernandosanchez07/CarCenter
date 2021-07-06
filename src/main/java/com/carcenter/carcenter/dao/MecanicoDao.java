package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.MecanicoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MecanicoDao extends JpaRepository<MecanicoEntity, Integer> {

    List<MecanicoEntity> findByEstado(String estado);

}
