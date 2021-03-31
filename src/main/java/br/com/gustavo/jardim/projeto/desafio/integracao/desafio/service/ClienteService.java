package br.com.gustavo.jardim.projeto.desafio.integracao.desafio.service;

import java.util.List;

import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.entity.ClienteEntity;

public interface ClienteService {

	ClienteEntity consultaCliente(String cpf);
	
	List<ClienteEntity> consultaClientes();
	
	ClienteEntity salvaCliente( ClienteEntity cliente );
	
	ClienteEntity atualizaCliente(ClienteEntity cliente );
	
	ClienteEntity deletaCliente(Integer cpf );
	
}
