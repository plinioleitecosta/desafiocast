package br.com.cast.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.cast.Model.Documento;
import br.com.cast.Repository.Documento.DocumentoRepositoryQuery;

public interface DocumentoRepository extends JpaRepository<Documento, Long>, DocumentoRepositoryQuery {

}
