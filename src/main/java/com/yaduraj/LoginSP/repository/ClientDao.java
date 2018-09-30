package com.yaduraj.LoginSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yaduraj.LoginSP.model.ClientModel;

public interface ClientDao extends JpaRepository<ClientModel, Integer> {

}
