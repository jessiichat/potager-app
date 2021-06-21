package com.ecolepratique.security.entite;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;

@Entity
public class Jardinier {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idJardinier;
	private String nom;
	
	@OneToMany(cascade= {CascadeType.PERSIST, CascadeType.REMOVE})
	@OrderBy("saison ASC")
	private List<Legume> legumes = new ArrayList<Legume>();
	
	public Jardinier() {}

	public Jardinier(String nom) {
		super();
		this.nom = nom;
	}
	
	public void addLegume(Legume legume) {
		legumes.add(legume);
	}

	public Long getIdJardinier() {
		return idJardinier;
	}

	public void setIdJardinier(Long idJardinier) {
		this.idJardinier = idJardinier;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Legume> getLegumes() {
		return legumes;
	}

	public void setLegumes(List<Legume> legumes) {
		this.legumes = legumes;
	}
	
	@Override
	public String toString() {
		return "Jardinier [idJardinier=" + idJardinier + ", nom=" + nom + ", legumes=" + legumes + "]";
	}
	
}
