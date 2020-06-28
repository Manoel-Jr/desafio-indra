package br.com.challenge.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.challenge.api.model.Historico;

public interface HistoricoRepository extends JpaRepository<Historico, Long>{

}
