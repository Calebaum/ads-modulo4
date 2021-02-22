package br.com.mxti.backend;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository // faz a classe se comportar como DAO
public interface PessoaDao extends JpaRepository<Pessoa, Long> {
}
