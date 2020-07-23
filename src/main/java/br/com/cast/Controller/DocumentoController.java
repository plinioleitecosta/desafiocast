package br.com.cast.Controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import br.com.cast.Dto.RetornoDto;
import br.com.cast.Enum.TipoArquivoEnum;
import br.com.cast.Model.Documento;
import br.com.cast.Service.DocumentoService;
import br.com.cast.Validador.ValidadorDocumento;

@RestController
@RequestMapping("/documentos")
public class DocumentoController {
	
	@Autowired
	private DocumentoService documentoService;
	
	@GetMapping("/v1/listar")
	public ResponseEntity<Collection<Documento>> listarDocumentos(){
		return ResponseEntity.ok(documentoService.listarTodos());
	}

	@PostMapping("/v1/diff/{ID}/right")
	public ResponseEntity<Documento> salvarDocumentoRight(@PathVariable String ID, @RequestParam("file") MultipartFile file) throws IOException{
	
		Documento documentoRight = new Documento();
		documentoRight.setIdArquivo(ID);
		//documentoRight.setVlDocumento(Base64.getEncoder().encode(file.getBytes()));
		documentoRight.setVlDocumento(file.getBytes());
		documentoRight.setNumeroBytes(file.getSize());
		documentoRight.setTipo(TipoArquivoEnum.RIGHT.getValor());
		try {
			documentoService.salvar(documentoRight);
			return ResponseEntity.ok(documentoRight);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}

	@PostMapping("/v1/diff/{ID}/left")
	public ResponseEntity<Documento> salvarDocumentoLeft(@PathVariable String ID, @RequestParam("file") MultipartFile file) throws IOException{
	
		Documento documentoLeft = new Documento();
		documentoLeft.setIdArquivo(ID);
		//documentoLeft.setVlDocumento(Base64.getEncoder().encode(file.getBytes()));
		documentoLeft.setVlDocumento(file.getBytes());
		documentoLeft.setNumeroBytes(file.getSize());
		documentoLeft.setTipo(TipoArquivoEnum.LEFT.getValor());
		try {
			documentoService.salvar(documentoLeft);
			return ResponseEntity.ok(documentoLeft);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@GetMapping("/v1/diff")
	public ResponseEntity<RetornoDto> compararArquivos() throws UnsupportedEncodingException{
		Documento documentoDireita = documentoService.documentoRight();
		Documento documentoEsquerda = documentoService.documentoLeft();
		RetornoDto retorno = ValidadorDocumento.validarDocumento(documentoDireita, documentoEsquerda);
		return ResponseEntity.ok(retorno);
	}

}
