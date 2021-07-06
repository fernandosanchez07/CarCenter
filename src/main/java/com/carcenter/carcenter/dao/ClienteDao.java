package com.carcenter.carcenter.dao;

import com.carcenter.carcenter.entity.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends JpaRepository<ClienteEntity, Integer> {


}
