package br.com.gustavo.jardim.projeto.desafio.integracao.desafio.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.entity.ClienteEntity;

@Repository
public interface ClienteDAO extends JpaRepository<ClienteEntity, Long> {
	
	ClienteEntity findByCpf(String cpf);
	
}
