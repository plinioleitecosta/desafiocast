package br.com.cast.Repository.Documento;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.cast.Enum.TipoArquivoEnum;
import br.com.cast.Model.Documento;
import br.com.cast.Model.Documento_;

public class DocumentoRepositoryImpl implements DocumentoRepositoryQuery{

	@PersistenceContext
	private EntityManager manager;
	
	
	@Override
	public Documento documentoDireita() {
		
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		CriteriaQuery<Documento> criteriaQuery = criteriaBuilder.createQuery(Documento.class);
		Root<Documento> root = criteriaQuery.from(Documento.class);
		criteriaQuery.where(
		criteriaBuilder.equal(root.get(Documento_.tipo), TipoArquivoEnum.RIGHT.getValor()));
		TypedQuery<Documento> qry = manager.createQuery(criteriaQuery);
		return qry.getSingleResult();		
	}

	@Override
	public Documento documentoEsquerda() {
		CriteriaBuilder criteriaBuilder = manager.getCriteriaBuilder();
		CriteriaQuery<Documento> criteriaQuery = criteriaBuilder.createQuery(Documento.class);
		Root<Documento> root = criteriaQuery.from(Documento.class);
		criteriaQuery.where(
		criteriaBuilder.equal(root.get(Documento_.tipo), TipoArquivoEnum.LEFT.getValor()));
		TypedQuery<Documento> qry = manager.createQuery(criteriaQuery);
		return qry.getSingleResult();		
	}

}
