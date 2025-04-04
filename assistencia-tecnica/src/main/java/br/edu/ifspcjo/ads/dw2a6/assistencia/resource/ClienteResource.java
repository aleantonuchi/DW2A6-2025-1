package br.edu.ifspcjo.ads.dw2a6.assistencia.resource;

import br.edu.ifspcjo.ads.dw2a6.assistencia.model.Cliente;
import br.edu.ifspcjo.ads.dw2a6.assistencia.repository.ClienteRepository;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteResource {

	@Autowired
	private ClienteRepository clienteRepository;

	@GetMapping
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	

	@PostMapping
	public Cliente criar(@RequestBody Cliente cliente, HttpServletResponse response) {
		return clienteRepository.save(cliente);
	}

	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		if(cliente.isPresent()) {
			return ResponseEntity.ok(cliente.get());
		}
		return ResponseEntity.notFound().build();
	}


}
