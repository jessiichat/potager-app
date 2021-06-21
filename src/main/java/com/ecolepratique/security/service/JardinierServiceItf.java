package com.ecolepratique.security.service;

import java.util.List;

import com.ecolepratique.security.entite.Jardinier;


public interface JardinierServiceItf {
	Jardinier findJardinierById(Long id);
	Jardinier createJardinier(Jardinier Jardinier);
	List<Jardinier> listJardinier();
	Jardinier updateJardinierByid(Long id, Jardinier Jardinier);
	Jardinier deleteJardinierById(Long id);
}
