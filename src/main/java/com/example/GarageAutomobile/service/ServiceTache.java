package com.example.GarageAutomobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.GarageAutomobile.beans.Tache;
import com.example.GarageAutomobile.dao.DaoTache;

@Service
public class ServiceTache implements iServiceTache {

	@Autowired
	DaoTache daotache;

	@Transactional
	@Override
	public List<Tache> rechercheTacheActive() {
		// TODO Auto-generated method stub
		return daotache.listActive();
	}

	@Transactional
	@Override
	public List<Tache> rechercherTache() {
		// TODO Auto-generated method stub
		return daotache.findAll();
	}

	@Transactional
	@Override
	public Tache rechercherTacheId(int id) {
		// TODO Auto-generated method stub
		return daotache.findById(id).get();
	}

	@Transactional
	@Override
	public void creerTache(Tache ptache) {
		// TODO Auto-generated method stub
		daotache.save(ptache);
	}

	@Transactional
	@Override
	public void modifierTache(Tache ptache) {
		// TODO Auto-generated method stub
		daotache.save(ptache);
	}

	@Transactional
	@Override
	public void desactiverTache(Tache tache) {
		daotache.save(tache);

	}

}
