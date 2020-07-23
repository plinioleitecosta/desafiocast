package br.com.cast.Validador;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

import br.com.cast.Dto.RetornoDto;
import br.com.cast.Model.Documento;

public class ValidadorDocumento {
	
	
	public static RetornoDto validarDocumento(Documento documentoDireita, Documento documentoEsquerda) throws UnsupportedEncodingException {

		
		RetornoDto retorno = new RetornoDto();
		 
		if(Arrays.equals(documentoDireita.getVlDocumento(), documentoEsquerda.getVlDocumento()) ) {
			retorno.setDescricao("Documentos Idênticos.");
			return retorno;
		} 
		
		if(documentoDireita.getNumeroBytes() != documentoEsquerda.getNumeroBytes()) {
			retorno.setDescricao("Documentos Com Tamanhos Diferentes.");
		}else { 
			// mesmo tamanho !!
			String valor1 = new String(documentoDireita.getVlDocumento());
			String valor2 = new String(documentoEsquerda.getVlDocumento());
			
			for(int i = 0; i < valor1.length(); i++) {
				if(valor1.charAt(i) != valor2.charAt(i)){
					retorno.setDescricao("Posição de divergência: "+String.valueOf(i));
					return retorno;
				}
			}
			
			
			
			retorno.setDescricao(valor1+" = "+valor2);
		}		
		return retorno;
	}

}
