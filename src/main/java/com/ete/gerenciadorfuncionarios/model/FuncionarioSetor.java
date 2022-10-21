package com.ete.gerenciadorfuncionarios.model;

public enum FuncionarioSetor {
    TECNOLOGIA("tecnologia"), RH("rh"), DIRETORIA("diretoria");

	private String value;

	private FuncionarioSetor(String value) {
		this.value = value;
	}

	public String getSetor() {
		return value;
	}
	
	
}
