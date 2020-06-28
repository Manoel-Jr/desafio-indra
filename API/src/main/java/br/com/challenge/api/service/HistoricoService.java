package br.com.challenge.api.service;

import java.util.List;

import br.com.challenge.api.model.Historico;

public interface HistoricoService {

	List<Historico> buscarTodoHistorico();
	Historico buscarPorId(Long id);
	void deletarPorId(Long id);
	Historico salvarHistorico(Historico historico);
	Historico atualizarHistorico(Long id, Historico historico);
}
