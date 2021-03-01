package br.com.mxti.backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import br.com.mxti.backend.entidade.Disciplina;

public interface DisciplinaDao extends JpaRepository<Disciplina, Long>{

}
