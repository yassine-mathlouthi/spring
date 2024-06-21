package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class Personne {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long idPerssone;
	String nom;
	String prenom;
	int num_tel;
	int age;

	public long getIdPerssone() {
		return idPerssone;
	}

	public void setIdPerssone(long idPerssone) {
		this.idPerssone = idPerssone;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getNum_tel() {
		return num_tel;
	}

	public void setNum_tel(int num_tel) {
		this.num_tel = num_tel;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Personne(long idPerssone, String nom, String prenom, int num_tel, int age) {
		super();
		this.idPerssone = idPerssone;
		this.nom = nom;
		this.prenom = prenom;
		this.num_tel = num_tel;
		this.age = age;
	}

	public Personne() {

	}
}