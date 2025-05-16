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

import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model.FormaPagamento;
import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.repository.FormaPagamentoRepository;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/formapagamento")

public class FormaPagamentoResource {

	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;

	 @GetMapping
	    public List<FormaPagamento> listar() {
	        return formaPagamentoRepository.findAll();
	    }
	 
	 @PostMapping
	    public ResponseEntity<FormaPagamento> criar(@Valid @RequestBody FormaPagamento formapagamento, HttpServletResponse response) {
	        FormaPagamento formapagamentoSalvo = formaPagamentoRepository.save(formapagamento);
	        return ResponseEntity.ok(formapagamentoSalvo);
	    }
	 
	 @GetMapping("/{codigo}")
	    public ResponseEntity<FormaPagamento> buscarPorCodigo(@PathVariable Long codigo) {
	        return formaPagamentoRepository.findById(codigo)
	            .map(ResponseEntity::ok)
	            .orElse(ResponseEntity.notFound().build());
	 }
}
