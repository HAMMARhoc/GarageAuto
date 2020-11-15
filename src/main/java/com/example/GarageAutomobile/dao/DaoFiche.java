package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.Fiche;

public interface DaoFiche extends JpaRepository<Fiche, Integer> {
	@Query("select c from Fiche c where c.desactiver = false")
	public List<Fiche> listActive();
}
