package br.com.bendo.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.bendo.portal.model.Noticia;

public interface NoticiaRepository extends CrudRepository<Noticia, Integer> {

}
