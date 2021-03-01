package br.com.mxti.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mxti.backend.entidade.MatriculaDisciplinaPessoa;

public interface MatriculaDisciplinaPessoaDao extends JpaRepository<MatriculaDisciplinaPessoa, Long> {

}
