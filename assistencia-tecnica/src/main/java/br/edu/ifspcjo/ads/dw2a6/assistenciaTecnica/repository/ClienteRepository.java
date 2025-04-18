package br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}