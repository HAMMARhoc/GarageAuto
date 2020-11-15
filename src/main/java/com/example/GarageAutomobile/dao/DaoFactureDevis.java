package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.FactureDevis;
import com.example.GarageAutomobile.beans.Fiche;


public interface DaoFactureDevis extends JpaRepository<FactureDevis, Integer> {
	@Query("select f from FactureDevis f where f.desactiver = false")
	public List<FactureDevis> listActive();
}
