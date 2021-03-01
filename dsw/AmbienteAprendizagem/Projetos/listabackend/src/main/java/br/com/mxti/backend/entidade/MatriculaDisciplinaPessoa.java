package br.com.mxti.backend.entidade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class MatriculaDisciplinaPessoa {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private long id;

	@ManyToOne
	private Disciplina disciplina;
	@ManyToOne
	private Pessoa pessoa;

    public MatriculaDisciplinaPessoa() {
    }

    public MatriculaDisciplinaPessoa(Long id, Pessoa pessoa, Disciplina disciplina) {
        this.id = id;
        this.pessoa = pessoa;
        this.disciplina = disciplina;
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
    
    
}
