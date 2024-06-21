package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Telephone {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	String marque;
	String date;
	float prix ;
	int etat_battery ; 
	@ManyToOne
	@JoinColumn(name="idPerssone", nullable=true)
	Personne personne;
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public float getPrix() {
		return prix;
	}
	public void setPrix(float prix) {
		this.prix = prix;
	}
	public int getEtat_battery() {
		return etat_battery;
	}
	public void setEtat_battery(int etat_battery) {
		this.etat_battery = etat_battery;
	}
	public Personne getPersonne() {
		return personne;
	}
	public void setPersonne(Personne personne) {
		this.personne = personne;
	}
	public Telephone(String marque, String date, float prix, int etat_battery, Personne personne) {
		super();
		this.marque = marque;
		this.date = date;
		this.prix = prix;
		this.etat_battery = etat_battery;
		this.personne = personne;
	}
	public Telephone() {
		super();
	}
	

}
