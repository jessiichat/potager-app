package com.ecolepratique.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.security.entite.User;

public interface UserDaoItf extends JpaRepository<User, String>{

}
