package com.example.GarageAutomobile.service;

import java.util.List;

import com.example.GarageAutomobile.beans.Piece;



public interface iServicePiece {
	public List<Piece> recherchePiece();
	public Piece recherchePieceId(final int id);
	public void creerPiece(final Piece piece);
	public void modifierPiece(final Piece piece);
	public void desactiverPiece(final Piece piece);
	public List<Piece> recherchePieceActive();
}
