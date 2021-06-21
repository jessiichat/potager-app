package com.ecolepratique.security.service;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecolepratique.security.dao.JardinierDaoItf;
import com.ecolepratique.security.entite.Jardinier;

@Service
public class JardinierService implements JardinierServiceItf{
	@Autowired
	private JardinierDaoItf JardinierDao;
	
	@Override
	public Jardinier findJardinierById(Long id) {
		return JardinierDao.findById(id).get();
	}
	@RolesAllowed("ROLE_ADMIN")
	@Override
	public Jardinier createJardinier(Jardinier Jardinier) {
		return JardinierDao.save(Jardinier);
	}
	@Override
	public List<Jardinier> listJardinier() {
		return JardinierDao.findAll();
	}
	@RolesAllowed("ROLE_ADMIN")
	@Override
	public Jardinier updateJardinierByid(Long id, Jardinier Jardinier) {
		Jardinier.setIdJardinier(id);
		return JardinierDao.save(Jardinier);
	}
	@RolesAllowed("ROLE_ADMIN")
	@Override
	public Jardinier deleteJardinierById(Long id) {
		Jardinier Jardinier = findJardinierById(id); 
		JardinierDao.deleteById(id);
		return Jardinier;
	}

}
