package br.com.mxti.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.mxti.backend.entidade.Curso;


public interface CursoDao extends JpaRepository<Curso, Long> {

}
