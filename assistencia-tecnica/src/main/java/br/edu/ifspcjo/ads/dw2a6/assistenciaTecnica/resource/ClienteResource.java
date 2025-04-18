package br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model.Cliente;
import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.repository.ClienteRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;


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
    public ResponseEntity<Cliente> criar(@Valid @RequestBody Cliente cliente, HttpServletResponse response) {
        Cliente clienteSalvo = clienteRepository.save(cliente);
        return ResponseEntity.ok(clienteSalvo);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPorId(@PathVariable Long id) {
        return clienteRepository.findById(id)
            .map(ResponseEntity::ok)
            .orElse(ResponseEntity.notFound().build());
    }
}