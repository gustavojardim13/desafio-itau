package br.com.gustavo.jardim.projeto.desafio.integracao.desafio.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.dao.ClienteDAO;
import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.entity.ClienteEntity;
import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {
	@Autowired
	ClienteDAO clienteDao;

	@Override
	public ClienteEntity consultaCliente(String cpf) {
		return clienteDao.findByCpf(cpf);
	}

	@Override
	public List<ClienteEntity>	 consultaClientes() {
		// TODO Auto-generated method stub
		return clienteDao.findAll();
	}

	@Override
	public ClienteEntity salvaCliente(ClienteEntity cliente) {
		return clienteDao.saveAndFlush(cliente);
	}

	@Override
	public ClienteEntity atualizaCliente(ClienteEntity cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ClienteEntity deletaCliente(Integer cpf) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
