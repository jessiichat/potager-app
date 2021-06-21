package com.ecolepratique.security.api;

import java.util.List;

import javax.annotation.security.RolesAllowed;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecolepratique.security.entite.Jardinier;
import com.ecolepratique.security.service.JardinierService;


@RestController
@RequestMapping("/jardinier")
public class JardinierApi {

	@Autowired
	private JardinierService JardinierService;
	 
	@GetMapping("/{id}")
	public Jardinier getJardinierById(@PathVariable("id")Long id) {
		System.out.println("JardinierRestApi - getJardinierById id=" + id);
		return JardinierService.findJardinierById(id);
	}
	@GetMapping("")
	public List<Jardinier> listJardinier() {
		System.out.println("JardinierRestApi - listJardinier");
		List<Jardinier> jardiniers = JardinierService.listJardinier();
		return jardiniers;
	}
	@PostMapping("")
	public Jardinier createJardinier(@RequestBody Jardinier Jardinier) {
		System.out.println("JardinierRestApi - create Jardinier=" + Jardinier);
        return JardinierService.createJardinier(Jardinier);
	}
	@PutMapping("/{id}")
	public Jardinier updateJardinier(@PathVariable("id") Long id, @RequestBody Jardinier Jardinier) {
		return JardinierService.updateJardinierByid(id, Jardinier);
	}
	@DeleteMapping("/{id}")
	public Jardinier deleteJardinier(@PathVariable("id") Long id) {
		System.out.println("JardiniertRestApi - deleteJardinier");
		return JardinierService.deleteJardinierById(id);
	}
}
