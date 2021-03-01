package br.com.mxti.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mxti.backend.entidade.Pessoa;

@Repository // faz a classe se comportar como DAO
public interface PessoaDao extends JpaRepository<Pessoa, Long> {
}
