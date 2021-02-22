package br.com.mxti.backend;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // faz a classe se comportar como entidade (tabela no banco)
public class Pessoa {

	@Id  //informa que este campo é o ID
	@GeneratedValue(strategy = GenerationType.IDENTITY) // define a estratégia de geracao de ID
	private Long id;
	private String nome;
	private String email;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
