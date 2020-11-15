package com.example.GarageAutomobile.service;

import java.util.List;

import com.example.GarageAutomobile.beans.Client;

public interface IServiceClient {
	public List<Client> rechercheClient();
	public Client rechercheClientId(final int id);
	public void creerClient(final Client pclient);
	public void modifierClient(final Client pclient);
	public void desactiverClient(final Client pclient);
	List<Client> rechercheClientActive();
}
