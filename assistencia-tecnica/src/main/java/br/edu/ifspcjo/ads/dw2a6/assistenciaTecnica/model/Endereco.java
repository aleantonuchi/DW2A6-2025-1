package br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

@Embeddable
public class Endereco {

	@NotBlank
	@Size(max = 100)
	private String logradouro;

	@NotBlank
	@Size(max = 10)
	private String numero;

	private String complemento;

	@NotBlank
	@Size(max = 50)
	private String bairro;

	@NotBlank
	@Size(max = 50)
	private String cidade;

	@NotBlank
	@Size(max = 2)
	private String estado;

	@NotBlank
	@Size(max = 12)
	private String cep;

	
	public String getLogradouro() {
		return logradouro;
	}
	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}
	public String getNumero() {
		return numero;
	}
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getCep() {
		return cep;
	}
	public void setCep(String cep) {
		this.cep = cep;
	}
}
