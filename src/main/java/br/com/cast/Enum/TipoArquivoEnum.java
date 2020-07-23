package br.com.cast.Enum;

import lombok.Getter;

public enum TipoArquivoEnum {
	
	RIGHT("right"),
	LEFT("left");
	
	@Getter
	private String valor;

	TipoArquivoEnum(String valor) {
		this.valor = valor;
	}
	

}
