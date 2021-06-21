package com.ecolepratique.security;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ecolepratique.security.dao.UserDaoItf;
import com.ecolepratique.security.dao.UserRoleDaoItf;
import com.ecolepratique.security.entite.User;
import com.ecolepratique.security.entite.UserRole;
import com.ecolepratique.security.dao.CucurbitaceeDaoItf;
import com.ecolepratique.security.dao.JardinierDaoItf;
import com.ecolepratique.security.dao.LegumeDaoItf;
import com.ecolepratique.security.dao.OmbellifereDaoItf;
import com.ecolepratique.security.entite.Cucurbitacee;
import com.ecolepratique.security.entite.Jardinier;
import com.ecolepratique.security.entite.Legume;
import com.ecolepratique.security.entite.Ombellifere;

@SpringBootApplication
public class SecurityApplication {
//	private static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(SecurityApplication.class, args);
		
		CucurbitaceeDaoItf cucurbitaceeDao = ctx.getBean(CucurbitaceeDaoItf.class);
		Cucurbitacee cucurbitacee = new Cucurbitacee("Courge Spaghetti","Automne",500.5);
		cucurbitaceeDao.save(cucurbitacee);
		
		OmbellifereDaoItf ombellifereDao = ctx.getBean(OmbellifereDaoItf.class);
		Ombellifere ombellifere = new Ombellifere("Fenouil","Ete","Ombelles");
		ombellifereDao.save(ombellifere);
		
		LegumeDaoItf legumeDao = ctx.getBean(LegumeDaoItf.class);
		Legume legume = new Cucurbitacee("Butternut","Automne",400.0);
		legumeDao.save(legume);	
		
		UserDaoItf userDao = ctx.getBean(UserDaoItf.class);
		userDao.save(new User("uadmin", "padmin"));
		userDao.save(new User("uuser", "puser"));
		
		UserRoleDaoItf userRoleDao = ctx.getBean(UserRoleDaoItf.class);
		userRoleDao.save(new UserRole("uadmin","ADMIN"));
		userRoleDao.save(new UserRole("uadmin","USER"));
		userRoleDao.save(new UserRole("uuser","USER"));
		
		JardinierDaoItf jardinierDao = ctx.getBean(JardinierDaoItf.class);
		jardinierDao.save(new Jardinier("Martin"));
		jardinierDao.save(new Jardinier("Nicole"));
		jardinierDao.save(new Jardinier("Jeanne"));

//		System.out.println("==== création et persistance des films et du réalisateur ====");
		
		List<Legume> legumes = new ArrayList<>();
		legumes.add(ombellifere);
		legumes.add(cucurbitacee);
		legumes.add(legume);
		
		Jardinier jardinier = new Jardinier("Georges");
		jardinierDao.save(jardinier);
		
//		legumes.add(new Legume("Topinambour","Hiver"));
//		legumes.add(new Legume("Tomate","Ete"));
//		legumes.add(new Legume("Fève","Ete"));
//		legumes.add(new Legume("Fève","Printemps"));
		
//		for (Legume legume : legumes) {
//			jardinier.addLegume(legume);
//		}
//		
//		jardinierDao.save(jardinier);
//		
//		System.out.println("==== Fin création et persistance des légumes et du jardinier ====");
//		System.out.println("==== Sélectionner entrée pour Supprimer le jardinier");
//		scan.nextLine();
//		jardinierDao.deleteAll();
//		System.out.println("Fin supprimer le jardinier");
	
	}

}
