package br.com.challenge.api.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.challenge.api.model.Usuario;

@Repository
public interface UsuarioRepository extends  JpaRepository<Usuario, Long>{

}
