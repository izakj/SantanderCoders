package br.com.digitalhouse.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.digitalhouse.model.Estado;
import br.com.digitalhouse.repository.EstadoRepository;

@RestController
@RequestMapping("/estado")
public class EstadoController {
	@Autowired
	private EstadoRepository repository;
	
	@PostMapping
	public void salvar(@RequestBody Estado estado) {
		repository.save(estado);
	}
	
	@GetMapping
	public List<Estado>listar(){
		return repository.findAll();
	}
}