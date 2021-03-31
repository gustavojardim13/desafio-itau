package br.com.gustavo.jardim.projeto.desafio.integracao.desafio.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Table(name = "TB_CLIENTE")
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClienteEntity implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 945503920773743183L;

	@Id
	@Column(name = "id_Cliente")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GEN_CLIENTE")
	@SequenceGenerator(sequenceName = "SQ_CLIENTE", name = "GEN_CLIENTE", allocationSize = 1)
	private Long idCliente;	
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "email")
	private String email;

}
