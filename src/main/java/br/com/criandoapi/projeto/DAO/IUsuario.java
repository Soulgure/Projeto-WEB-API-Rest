package br.com.criandoapi.projeto.DAO;

import org.springframework.data.repository.CrudRepository;

import br.com.criandoapi.projeto.Usuario;

public interface IUsuario extends CrudRepository<Usuario, Integer>{
}
