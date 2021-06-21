package com.ecolepratique.security.entite;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cucurbitacee")
public class Cucurbitacee extends Legume{
	private Double poids;
	
	public Cucurbitacee() {
		super();
	}

	public Cucurbitacee(String nom, String saison, Double poids) {
		super(nom, saison);
		this.poids = poids;
	}

	@Override
	public String toString() {
		return "Cucurbitacee [poids=" + poids + "]" + super.toString();
	}

	public Double getPoids() {
		return poids;
	}

	public void setPoids(Double poids) {
		this.poids = poids;
	}
	
}
