package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.Client;

public interface DaoClient extends JpaRepository<Client, Integer> {
	@Query("select c from Client c where c.desactiver = false")
	public List<Client> listActive();
}
