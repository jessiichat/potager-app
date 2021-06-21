package com.ecolepratique.security.entite;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_LEGUME")
public abstract class Legume {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String nom;
	private String saison;
	
	public Legume() {}

	public Legume(String nom, String saison) {
		super();
		this.nom = nom;
		this.saison = saison;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getSaison() {
		return saison;
	}

	public void setSaison(String saison) {
		this.saison = saison;
	}

	@Override
	public String toString() {
		return "Legume [id=" + id + ", nom=" + nom + ", saison=" + saison + "]";
	}
	
}


