package br.com.mxti.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mxti.backend.dao.CursoDao;
import br.com.mxti.backend.dao.DisciplinaDao;
import br.com.mxti.backend.dao.MatriculaDisciplinaPessoaDao;
import br.com.mxti.backend.dao.PessoaDao;
import br.com.mxti.backend.dao.TurmaDao;
import br.com.mxti.backend.entidade.Curso;
import br.com.mxti.backend.entidade.Disciplina;
import br.com.mxti.backend.entidade.MatriculaDisciplinaPessoa;
import br.com.mxti.backend.entidade.Pessoa;
import br.com.mxti.backend.entidade.Turma;

@Service
public class CargaBd {
	@Autowired
    private CursoDao cursoDao;
    @Autowired
    private DisciplinaDao disciplinaDao;
    @Autowired
    private MatriculaDisciplinaPessoaDao matriculaDisciplinaPessoaDao;
    @Autowired
    private PessoaDao pessoaDao;
    @Autowired
    private TurmaDao turmaDao;

    public void instanciaBaseDeDados() {

        Curso c1 = new Curso(null, "ADS");
        Curso c2 = new Curso(null, "ANALISTA DE DADOS");
        Curso c3 = new Curso(null, "ADVOGADO");

        Turma t1 = new Turma(null, "Turma 1", c1);
        Turma t2 = new Turma(null, "Turma 2", c2);
        Turma t3 = new Turma(null, "Turma 3", c3);

        Disciplina d1 = new Disciplina(null, "Criação de sites", t1);
        Disciplina d2 = new Disciplina(null, "Analise e criação de dados", t2);
        Disciplina d3 = new Disciplina(null, "Como processar pessoas ricas", t3);

        Pessoa p1 = new Pessoa(null, "Calebe");
        Pessoa p2 = new Pessoa(null, "Geber");
        Pessoa p3 = new Pessoa(null, "Maria");

        MatriculaDisciplinaPessoa mdp1 = new MatriculaDisciplinaPessoa(null, p1, d1);
        MatriculaDisciplinaPessoa mdp2 = new MatriculaDisciplinaPessoa(null, p2, d2);
        MatriculaDisciplinaPessoa mdp3 = new MatriculaDisciplinaPessoa(null, p3, d3);

        cursoDao.save(c1);
        cursoDao.save(c2);
        cursoDao.save(c3);

        turmaDao.save(t1);
        turmaDao.save(t2);
        turmaDao.save(t3);

        disciplinaDao.save(d1);
        disciplinaDao.save(d2);
        disciplinaDao.save(d3);

        pessoaDao.save(p1);
        pessoaDao.save(p2);
        pessoaDao.save(p3);

        matriculaDisciplinaPessoaDao.save(mdp1);
        matriculaDisciplinaPessoaDao.save(mdp2);
        matriculaDisciplinaPessoaDao.save(mdp3);

    }

}

