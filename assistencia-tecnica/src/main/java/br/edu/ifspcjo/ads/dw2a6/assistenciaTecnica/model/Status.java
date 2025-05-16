package br.edu.ifspcjo.ads.dw2a6.assistenciaTecnica.model;

public enum Status {
	
	EM_APROVACAO("Em aprovação"),
	APROVADO("Aprovado"),
	EM_ANDAMENTO("Em andamento"),
	FINALIZADA("Finalizada");
	
	private String description;
	
	private Status(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	

}
