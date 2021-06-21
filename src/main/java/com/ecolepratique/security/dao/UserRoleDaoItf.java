package com.ecolepratique.security.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecolepratique.security.entite.UserRole;

public interface UserRoleDaoItf extends JpaRepository<UserRole, String>{

}
