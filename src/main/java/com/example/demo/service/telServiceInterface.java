package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.models.Telephone;

public interface telServiceInterface {

	List<Telephone> getAllTels();

	// Optional<Telephone> getTelephoneById(long id);

	void saveTel(Telephone tel);

	void deleteTelephone(long id);

	void updateTel(long id, Telephone updatedTel);

}
