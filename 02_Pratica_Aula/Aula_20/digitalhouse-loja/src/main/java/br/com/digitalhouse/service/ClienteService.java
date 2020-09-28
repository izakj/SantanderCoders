package br.com.digitalhouse.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.digitalhouse.model.Cliente;
import br.com.digitalhouse.model.Telefone;
import br.com.digitalhouse.repository.CidadeRepository;
import br.com.digitalhouse.repository.ClienteRepository;
import br.com.digitalhouse.repository.EstadoRepository;

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Transactional
	public void salvar (Cliente cliente) {
		//cliente.getTelefone().stream().forEach(telefone -> telefonesetCliente(cliente));
		
		estadoRepository.save(cliente.getEndereco().getCidade().getEstado());
		cidadeRepository.save(cliente.getEndereco().getCidade());
		
		for (Telefone t: cliente.getTelefone()) {
			t.setCliente(cliente);
		}
		
		repository.save(cliente);
	}
	
//	@Transactional
//	public void salvar(Cliente cliente) {
//		repository.save(cliente);
//	}
	

	public List<Cliente> listar() {
		return repository.findAll();
	}

	public Cliente buscar(Long id) {
		return repository.findById(id).get();
	}

	@Transactional
	public void excluir(Long id) {
		repository.deleteById(id);
		
	}
	
	@Transactional
	public void atualizar(Long id, Cliente cliente) {
		
		Cliente cli = repository.findById(id).get();
		
		cli.setNome(cli.getNome());
		cli.setSobrenome(cli.getSobrenome());
		cli.setTelefone(cli.getTelefone());
		cli.setDataNasc(cli.getDataNasc());
		cli.setCpf(cli.getCpf());
		cli.setRg(cli.getRg());
		cli.setEmail(cli.getEmail());
		
		repository.save(cli);
	}

	public List<Telefone> buscarTelefones(Long id) {
		return repository.buscarTelefonesPorId(id);
	}

	public List<Cliente> buscarPeloSobrenome(String sobrenome) {
		return repository.buscarPeloSobrenome(sobrenome);
	}




}
