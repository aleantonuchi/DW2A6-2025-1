package br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model.OrdemDeServico;
import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.repository.OrdemServicoRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/ordemservico")

public class OrdemDeServicoResource {

	@Autowired
	private OrdemServicoRepository ordemDeServicoRepository;

	 @GetMapping
	    public List<OrdemDeServico> listar() {
	        return ordemDeServicoRepository.findAll();
	    }
	 
	 @PostMapping
	    public ResponseEntity<OrdemDeServico> criar(@Valid @RequestBody OrdemDeServico ordemservico, HttpServletResponse response) {
		 OrdemDeServico ordemservicoSalvo = ordemDeServicoRepository.save(ordemservico);
	        return ResponseEntity.ok(ordemservicoSalvo);
	    }
	 
	 @GetMapping("/{codigo}")
	    public ResponseEntity<OrdemDeServico> buscarPorCodigo(@PathVariable Long codigo) {
	        return ordemDeServicoRepository.findById(codigo)
	            .map(ResponseEntity::ok)
	            .orElse(ResponseEntity.notFound().build());
	 }
}
