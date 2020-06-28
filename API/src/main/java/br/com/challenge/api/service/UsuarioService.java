package br.com.challenge.api.service;

import java.util.List;

import br.com.challenge.api.model.Usuario;

public interface UsuarioService {
 
	List<Usuario> listaTodosUsuarios();
	Usuario buscarPorId(Long id);
	void deletar(Long id);
	Usuario salvar(Usuario usuario);
	Usuario atualizar(Long id, Usuario usuario);
}
