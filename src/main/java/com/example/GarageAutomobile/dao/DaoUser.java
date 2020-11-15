package com.example.GarageAutomobile.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.GarageAutomobile.beans.User;

public interface DaoUser extends JpaRepository<User, Integer> {
	@Query("select u from User u where u.desactiver = false")
	public List<User> listActive();
}
