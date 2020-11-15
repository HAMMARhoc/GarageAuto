package com.example.GarageAutomobile.service;

import java.util.List;

import com.example.GarageAutomobile.beans.User;

public interface iServiceUser {

	public List<User> rechercherUser();
	public User rechercherUserId(final int id);
	public void creerUser(final User puser);
	public void modifierUser(final User puser);
	public void desactiverUser(final User puser);
	public List<User> rechercherUserActive();
}
