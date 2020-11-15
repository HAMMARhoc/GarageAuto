package com.example.GarageAutomobile;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.GarageAutomobile.beans.Devis;
import com.example.GarageAutomobile.beans.User;
import com.example.GarageAutomobile.beans.Vehicule;
import com.example.GarageAutomobile.service.IServiceClient;
import com.example.GarageAutomobile.service.IServiceDevis;
import com.example.GarageAutomobile.service.IServiceVehicule;
import com.example.GarageAutomobile.service.iServiceProfil;
import com.example.GarageAutomobile.service.iServiceUser;
@SpringBootTest
class TestServiceDevis {

	@Autowired 
	private IServiceDevis serviceDevis;
	
	@Autowired 
	private IServiceClient serviceClient;

	@Autowired 
	private iServiceUser serviceUser;

	@Autowired 
	private IServiceVehicule serviceVehicule;

	
	@BeforeEach
	void setUp() throws Exception {
		System.out.println("----------------");
	}
	
	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testRechercheDevis() {
		serviceDevis.rechercheDevis();
		assertNotNull(serviceDevis.rechercheDevis());
	
	}

	@Test
	void testRechercheDevisId() {
		assertNotNull(serviceDevis.rechercheDevisId(2));
	}
	@Test
	void testCreerDevis() {
		Devis devis = new Devis();
		devis.setId(1);
		devis.setClient(serviceClient.rechercheClientId(1));
		devis.setUser(serviceUser.rechercherUserId(1));
		devis.setVehicule(serviceVehicule.rechercheVehiculeId(1));
		devis.setDatecreation(new Date());
		devis.setEtatdevis(false);
		devis.setDesactiver(false);
	}

	@Test
	void testModifierDevis() {
		Devis devis = serviceDevis.rechercheDevisId(1);
		assertEquals("test", serviceClient.rechercheClientId(1).getFirstname());
		devis.setClient(serviceClient.rechercheClientId(2));
		assertEquals("Abraham", devis.getClient().getFirstname());
		assertEquals("208",serviceVehicule.rechercheVehiculeId(4).getModele());
		
	}
	

	@Test
	void testDesactiverDevis() {
		Devis devis = serviceDevis.rechercheDevisId(1);
		devis.setDesactiver(true);
		serviceDevis.desactiverDevis(devis);
		assertTrue(serviceDevis.rechercheDevisId(1).getDesactiver());	}


}
