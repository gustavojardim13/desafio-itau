package br.com.gustavo.jardim.projeto.desafio.integracao.desafio.controller;

import java.util.List;

import javax.validation.Valid;
import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.entity.ClienteEntity;
import br.com.gustavo.jardim.projeto.desafio.integracao.desafio.service.ClienteService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(path = "/v1")
public class ClienteApi {

	@Autowired
	ClienteService service;

	/**
	 * Retorna 1 cliente
	 * 
	 * @param cpf
	 * @return
	 */
	@ApiOperation(value = "consulta cliente")
	@GetMapping("/consulta/cliente")
	public ResponseEntity<ClienteEntity> retornaCliente(@PathParam(value = "cpf") String cpf) {

		return ResponseEntity.ok(service.consultaCliente(cpf));
	}

	/**
	 * 
	 * @return Response dos Clientes na base
	 */
	@ApiOperation(value = "consulta clientes")
	@GetMapping("/consulta/clientes")
	public ResponseEntity<List<ClienteEntity>> retornaCliente() {

		return ResponseEntity.ok(service.consultaClientes());
	}

	@ApiOperation(value = "salva cliente")
	@PostMapping(path="/salva/cliente", consumes= "application/json")
	public ResponseEntity<ClienteEntity> salvaCliente(@RequestBody @Valid ClienteEntity cliente) {

		return ResponseEntity.ok(service.salvaCliente(cliente));
	}

}
