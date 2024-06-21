package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

import com.example.demo.Repository.TelephoneRepositry;
import com.example.demo.models.Telephone;

import jakarta.transaction.Transactional;

@Service
public class TelService implements telServiceInterface {

    private final TelephoneRepositry telR;

    @Autowired
    public TelService(TelephoneRepositry telR) {
        this.telR = telR;
    }

    @Override
    public List<Telephone> getAllTels() {
        return telR.findAll();
    }
	public Optional<Telephone> getTelById(long id) {
		// TODO Auto-generated method stub
		return telR.findById(id);
	}

   
    @Transactional
    @Override
    public void saveTel(Telephone tel) {
    	System.out.println("Saving Telephone: " + tel);
        telR.save(tel);
    }

    @Override
    public void deleteTelephone(long id) {
        telR.deleteById(id);
    }
    
    @Transactional
    public void updateTel(long id, Telephone updatedTel) {
        Optional<Telephone> existingTelOptional = telR.findById(id);

        if (existingTelOptional.isPresent()) {
            Telephone existingTel = existingTelOptional.get();

            // Update the fields with the new values
            existingTel.setMarque(updatedTel.getMarque());
            existingTel.setDate(updatedTel.getDate());
            existingTel.setPrix(updatedTel.getPrix());
            existingTel.setEtat_battery(updatedTel.getEtat_battery());
            existingTel.setPersonne(updatedTel.getPersonne()); // If Personne is also being updated

            // Save the updated entity
            telR.save(existingTel);
        } else {
            // Handle the case where the Telephone with the given id is not found
            throw new IllegalArgumentException("Telephone with ID " + id + " not found");
        }
    }
}





