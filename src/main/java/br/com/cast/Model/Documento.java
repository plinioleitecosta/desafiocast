package br.com.cast.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "DOCUMENTO")
@Getter
@Setter
public class Documento {
	
	 @Id
	 @Column(name = "IDDOCUMENTO")
	 private String idArquivo; 
	
	 @Column(name = "NMDOCUMENTO")
	 private byte[] vlDocumento;
	 
	 @Column(name="NUBYTES")
	 private long numeroBytes;
	 
	 @Column(name="TPDOCUMENTO")
	 private String tipo;
	 
	 public Documento() {
	 }
	 
	 public Documento(String id, byte[] dados, long tamanho, String tipo) {
		 this.idArquivo = id;
		 this.vlDocumento = dados;
		 this.numeroBytes = tamanho;
		 this.tipo = tipo;
	 }

}
