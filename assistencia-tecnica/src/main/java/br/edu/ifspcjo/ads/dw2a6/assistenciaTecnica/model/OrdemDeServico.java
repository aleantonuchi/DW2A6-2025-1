package br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model;


import java.math.BigDecimal;
import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "ordemservico")
public class OrdemDeServico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	@NotNull
	@Size(min = 3, max = 20)
	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	@OneToOne
	@JoinColumn(name = "formapagamento_id")
	private FormaPagamento formapagamento;
	@NotNull
	private String descricao;
	@NotNull
	@JsonFormat(pattern =  "dd/MM/yyyy")
	@Column(name = "data_emissao")
	private LocalDate dataEmissao;
	@JsonFormat(pattern =  "dd/MM/yyyy")
	@Column(name = "data_finalizacao")
	private LocalDate dataFinalizacao;
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public FormaPagamento getFormapagamento() {
		return formapagamento;
	}
	public void setFormapagamento(FormaPagamento formapagamento) {
		this.formapagamento = formapagamento;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataEmissao() {
		return dataEmissao;
	}
	public void setDataEmissao(LocalDate dataEmissao) {
		this.dataEmissao = dataEmissao;
	}
	public LocalDate getDataFinalizacao() {
		return dataFinalizacao;
	}
	public void setDataFinalizacao(LocalDate dataFinalizacao) {
		this.dataFinalizacao = dataFinalizacao;
	}
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	private BigDecimal valor;
	private String observacao;
	


}
