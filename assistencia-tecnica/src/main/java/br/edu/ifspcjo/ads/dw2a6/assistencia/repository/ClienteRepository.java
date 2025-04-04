package br.edu.ifspcjo.ads.dw2a6.assistencia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.edu.ifspcjo.ads.dw2a6.assistencia.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}