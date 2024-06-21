package com.example.demo.controler;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Personne;
import com.example.demo.service.PersonneService;

@RestController
@RequestMapping("/Personne")
public class PerControler {
	@Autowired
	private PersonneService PS;

	@GetMapping
	public List<Personne> getAllP() {
		return PS.getAllPersonne();
	}
	@GetMapping("find")
	 public Optional<Personne> getPById(@RequestParam long id) {
	 return PS.getPerById(id);
	}

	@RequestMapping("/add")
	@PostMapping
	public ResponseEntity<Void> saveP(@RequestBody Personne tel) {
		PS.savePer(tel);
		return ResponseEntity.ok().build();
	}
	
	 @GetMapping("findByName")
	    public ResponseEntity<Personne> getPerByNom(@RequestParam String nom) {
	        Personne personne = PS.getPerByNom(nom);
	        return ResponseEntity.ok(personne);
	    }
	 @GetMapping("age")
	    public ResponseEntity<Personne> getPerage(@RequestParam int nom) {
	        Personne personne = PS.getPerByNumTel(nom);
	        return ResponseEntity.ok(personne);
	    }
	

	@DeleteMapping("delete/{id}")
	public void deleteP(@PathVariable long id) {
		PS.deleteP(id);
	}

}
