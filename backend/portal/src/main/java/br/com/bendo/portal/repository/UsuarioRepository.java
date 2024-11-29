package br.com.bendo.portal.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.bendo.portal.model.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>{

}
