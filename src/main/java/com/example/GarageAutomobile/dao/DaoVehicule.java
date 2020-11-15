package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.Vehicule;


public interface DaoVehicule extends JpaRepository<Vehicule, Integer> {
	@Query("select v from Vehicule v where v.desactiver = false")
	public List<Vehicule> listActive();
}
