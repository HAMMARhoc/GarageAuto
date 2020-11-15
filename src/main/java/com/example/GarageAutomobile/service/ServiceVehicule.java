package com.example.GarageAutomobile.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.GarageAutomobile.beans.Vehicule;
import com.example.GarageAutomobile.dao.DaoVehicule;


@Service
public class ServiceVehicule implements IServiceVehicule {

	
	@Autowired
	DaoVehicule daoVehicule;
	
	
	@Transactional(readOnly = true)
	@Override
	public List<Vehicule> rechercheVehicule() {
		// TODO Auto-generated method stub
		return daoVehicule.findAll();
	}
	
	
	@Transactional(readOnly = true)
	@Override
	public Vehicule rechercheVehiculeId(int id) {
		// TODO Auto-generated method stub
		return daoVehicule.findById(id).get();
	}
	
	
	@Transactional
	@Override
	public void creerVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		daoVehicule.save(vehicule);
		
	}
	
	@Transactional
	@Override
	public void modifierVehicule(Vehicule vehicule) {
		// TODO Auto-generated method stub
		daoVehicule.save(vehicule);

	}
	/**
	 * Permet de désactiver un vehicule, ce qui l'enleve de l'affichage sans le
	 * supprimer de la base de données
	 * @param : le vehicule à désactiver 
	 */
	@Transactional
	@Override
	public void desactiverVehicule(Vehicule vehicule) {
		vehicule.setDesactiver(true);
		daoVehicule.save(vehicule);
		
	}
	/**
	 * Permet de rechercher les véhicules actifs, et n'affiche pas les vehicules
	 * désactivés
	 * @return : la liste des véhicules dont l'attribut desactiver est à false
	 */
	@Transactional
	@Override
	public List<Vehicule> rechercherVehiculeActive() {
		// TODO Auto-generated method stub
		return daoVehicule.listActive();
	}

	
	
}
