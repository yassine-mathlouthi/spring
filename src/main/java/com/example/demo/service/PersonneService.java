package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.PersonneRep;
import com.example.demo.Repository.TelephoneRepositry;
import com.example.demo.models.Personne;
import com.example.demo.models.Telephone;

import jakarta.transaction.Transactional;
@Service
public class PersonneService {
	private final PersonneRep PR;

    @Autowired
    public PersonneService(PersonneRep telR) {
        this.PR = telR;
    }

    public List<Personne> getAllPersonne() {
        return PR.findAll();
    }
	public Optional<Personne> getPerById(long id) {
		// TODO Auto-generated method stub
		return PR.findById(id);
	}

   
    @Transactional
    public void savePer(Personne p) {
    	System.out.println("Saving Personne: " + p);
        PR.save(p);
    }
    
    public Personne getPerByNom(String nom) {
        return PR.findByNom(nom);
    }
    public Personne getPerByNumTel(int age) {
        return PR.findByAge(age);
    }

   
    public void deleteP(long id) {
        PR.deleteById(id);
    }
    
   
    

}
