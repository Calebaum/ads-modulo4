package br.com.mxti.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mxti.backend.entidade.Turma;

public interface TurmaDao extends JpaRepository<Turma, Long> {

}
