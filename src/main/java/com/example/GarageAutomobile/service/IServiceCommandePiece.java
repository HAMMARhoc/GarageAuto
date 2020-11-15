package com.example.GarageAutomobile.service;

import java.util.List;

import com.example.GarageAutomobile.beans.CommandePiece;

public interface IServiceCommandePiece {
	public List<CommandePiece> rechercherCommandePiece();
	public CommandePiece rechercherCommandePieceId(final int id);
	public void creerCommandePiece(final CommandePiece pcommandepiece);
	public void modifierCommandePiece(final CommandePiece pcommandepiece);
	public void desactiverCommandePiece(final CommandePiece pcommandepiece);
	public List<CommandePiece> rechercherCommandePieceActive();
}
