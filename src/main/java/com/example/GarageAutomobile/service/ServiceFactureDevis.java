package com.example.GarageAutomobile.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.GarageAutomobile.beans.FactureDevis;
import com.example.GarageAutomobile.dao.DaoFactureDevis;
@Service
public class ServiceFactureDevis implements IServiceFactureDevis {
	
	@Autowired
	DaoFactureDevis daoFactureDevis;
	
	
	@Override
	public List<FactureDevis> rechercheFactureDevis() {
		// TODO Auto-generated method stub
		return daoFactureDevis.findAll();
	}

	@Override
	public FactureDevis rechercheFactureDevisId(int id) {
		// TODO Auto-generated method stub
		return daoFactureDevis.findById(id).get();
	}

	@Override
	public void creerFactureDevis(FactureDevis factureDevis) {
		// TODO Auto-generated method stub
		daoFactureDevis.save(factureDevis);
	}

	@Override
	public void modifierFactureDevis(FactureDevis factureDevis) {
		// TODO Auto-generated method stub
		daoFactureDevis.save(factureDevis);

	}

	@Override
	public void desactiverFactureDevis(FactureDevis factureDevis) {
		// TODO Auto-generated method stub
		daoFactureDevis.save(factureDevis);

	}

	@Override
	public List<FactureDevis> rechercherFactureDevisActive() {
		// TODO Auto-generated method stub
		return daoFactureDevis.listActive();

	}

}
