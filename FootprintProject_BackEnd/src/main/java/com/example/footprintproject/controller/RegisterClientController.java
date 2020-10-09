package com.example.footprintproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.footprintproject.model.RegisterClient;
import com.example.footprintproject.repository.RegisterClientRepository;


@CrossOrigin
@RestController
@RequestMapping("/registerclient")
public class RegisterClientController {

	@Autowired
	private RegisterClientRepository repository;
	
	
		//POST - Insert
		//PUT - Update
		//GET - Select
		//DELETE - Delete
		
		@GetMapping
		public List<RegisterClient> list(){
			return repository.findAll();
		}
		
		@GetMapping("/{id}")
		public RegisterClient search(@PathVariable Long id){
			return repository.findById(id).orElse(null);
		}
		
		@PostMapping
		public void save(@RequestBody RegisterClient client) {
			repository.save(client);
		}	
		
		@DeleteMapping("/{id}")
		public void delete(@PathVariable Long id) {
			repository.deleteById(id);
		}	
		
		@PutMapping("/{id}")
		public void update(@PathVariable Long id, @RequestBody RegisterClient client) {
			RegisterClient cl = repository.findById(id).get();
			
			cl.setName(client.getName());
			cl.setSurname(client.getSurname());
			cl.setMail(client.getMail());
			cl.setPassword(client.getPassword());
			
			repository.save(cl);
		}

}
