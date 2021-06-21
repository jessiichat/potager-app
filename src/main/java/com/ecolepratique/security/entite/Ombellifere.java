package com.ecolepratique.security.entite;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ombellifere")
public class Ombellifere extends Legume{
	private String fleurs;
	
	public Ombellifere() {
		super();
	}

	public Ombellifere(String nom, String saison, String fleurs) {
		super(nom, saison);
		this.fleurs = fleurs;
	}

	@Override
	public String toString() {
		return "Ombellifere [fleurs=" + fleurs + "]" + super.toString();
	}

	public String getFleurs() {
		return fleurs;
	}

	public void setFleurs(String fleurs) {
		this.fleurs = fleurs;
	}

}
