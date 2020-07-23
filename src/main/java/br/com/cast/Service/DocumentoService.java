package br.com.cast.Service;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cast.Model.Documento;
import br.com.cast.Repository.DocumentoRepository;

@Service
public class DocumentoService {
	
	@Autowired
	private DocumentoRepository documentoRepository;
	
	public Collection<Documento> listarTodos(){
		return documentoRepository.findAll();
	}
	
	public Documento porId(long id) {
		return documentoRepository.findById(id).get();
	}
	
	public Documento salvar(Documento documento) {
		return documentoRepository.save(documento);
	}
	
	public void excluir(Documento documento) {
		documentoRepository.delete(documento);
	}
	
	public Documento documentoRight() {
		return documentoRepository.documentoDireita();
	}
	
	public Documento documentoLeft() {
		return documentoRepository.documentoEsquerda();
	}
	
	

}
