package com.example.demo.controler;

import java.awt.PageAttributes.MediaType;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.models.Telephone;
import com.example.demo.service.PersonneService;
import com.example.demo.service.TelService;

@RestController
@RequestMapping("/telephone")
public class controler {
	@Autowired
	private TelService telService;

	@GetMapping
	public List<Telephone> getAllTels() {
		return telService.getAllTels();
	}
	@GetMapping("find/{id}")
	 public Optional<Telephone> getTelById(@PathVariable long id) {
	 return telService.getTelById(id);
	}

	@RequestMapping("/add")
	@PostMapping
	public ResponseEntity<Void> saveTel(@RequestBody Telephone tel) {
		telService.saveTel(tel);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping("/update/{id}")
	@PutMapping
	 public ResponseEntity<Object> updateTel(@PathVariable long id, @RequestBody Telephone tel)
	 {
		telService.updateTel(id,tel);
		return ResponseEntity.ok().build();
	}
	
	

	@DeleteMapping("delete/{id}")
	public void deleteTel(@PathVariable long id) {
		telService.deleteTelephone(id);
	}

}
