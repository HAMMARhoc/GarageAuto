package com.example.GarageAutomobile.service;

import java.util.List;

import com.example.GarageAutomobile.beans.Tache;

public interface iServiceTache {
	
	public List<Tache> rechercherTache();
	public Tache rechercherTacheId(final int id);
	public void creerTache(final Tache ptache);
	public void modifierTache(final Tache ptache);
	public void desactiverTache(final Tache tache);
	public List<Tache> rechercheTacheActive();
	
}
