package com.example.GarageAutomobile.service;

import java.util.List;

import com.example.GarageAutomobile.beans.Devis;


public interface IServiceDevis {
	public List<Devis> rechercheDevis();
	public Devis rechercheDevisId(final int id);
	public void creerDevis(final Devis devis);
	public void modifierDevis(final Devis devis);
	public void desactiverDevis(final Devis devis);
	List<Devis> rechercherDevisActive();
}
