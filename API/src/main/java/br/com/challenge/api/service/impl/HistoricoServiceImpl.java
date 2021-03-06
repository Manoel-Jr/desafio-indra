package br.com.challenge.api.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.challenge.api.model.Historico;
import br.com.challenge.api.repository.HistoricoRepository;
import br.com.challenge.api.service.HistoricoService;


@Service
public class HistoricoServiceImpl implements HistoricoService{

	@Autowired
	private HistoricoRepository repository;
	
	@Override
	public List<Historico> buscarTodoHistorico() {
		return  repository.findAll();
	}

	@Override
	public Historico buscarPorId(Long id) {
		Optional<Historico> historico = repository.findById(id);
		return historico.get();
	}

	@Override
	public void deletarPorId(Long id) {
		Historico historico = repository.getOne(id);
		repository.delete(historico);
		
	}

	@Override
	public Historico salvarHistorico(Historico historico) {
		return repository.save(historico);
	}

	@Override
	public Historico atualizarHistorico(Long id, Historico historico) {
		historico.setId(id);
		Historico historicoAtualizado = repository.save(historico);
		return historicoAtualizado;
	}

}
