package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.RepuestoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RepuestoDao extends JpaRepository<RepuestoEntity, Integer> {

    Optional<RepuestoEntity> getFindByCodigo(Integer Cogidigo);

}
