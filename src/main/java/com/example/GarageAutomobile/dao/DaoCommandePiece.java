package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.CommandePiece;

public interface DaoCommandePiece extends JpaRepository<CommandePiece, Integer> {
	@Query("select c from CommandePiece c where c.desactiver = false")
	public List<CommandePiece> listActive();

}
