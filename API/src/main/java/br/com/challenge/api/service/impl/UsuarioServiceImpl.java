package br.com.challenge.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.challenge.api.model.Usuario;
import br.com.challenge.api.repository.UsuarioRepository;
import br.com.challenge.api.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public List<Usuario> listaTodosUsuarios() {
		return repository.findAll();
	}

	@Override
	public Usuario buscarPorId(Long id) {
		Optional<Usuario> usuario = repository.findById(id);
		return usuario.get();
	}

	@Override
	public void deletar(Long id) {
		Usuario usuario = repository.getOne(id);
		repository.delete(usuario);

	}

	@Override
	public Usuario salvar(Usuario usuario) {
		return repository.save(usuario);
	}

	@Override
	public Usuario atualizar(Long id, Usuario usuario) {
	   usuario.setId(id);
	   Usuario usuarioAtualiza = repository.save(usuario);
	   return usuarioAtualiza;
	   
	}

}
