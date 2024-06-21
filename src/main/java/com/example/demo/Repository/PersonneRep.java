package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Personne;
import com.example.demo.models.Telephone;

@Repository
public interface PersonneRep extends JpaRepository<Personne, Long>{
	  Personne findByNom(String nom);
	  Personne findByAge(int x);


}




