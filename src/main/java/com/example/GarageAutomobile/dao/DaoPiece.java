package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.Piece;

public interface DaoPiece extends JpaRepository<Piece, Integer> {
	@Query("select p from Piece p where p.desactiver = false")
	public List<Piece> listActive();

}
