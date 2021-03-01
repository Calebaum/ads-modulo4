package br.com.mxti.backend.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import br.com.mxti.backend.dao.DisciplinaDao;
import br.com.mxti.backend.entidade.Disciplina;

@RestController
@RequestMapping("disciplina")
public class DisciplinaRest {

	
	@Autowired // injeta uma instancia de pessoaoDao aqui
	private DisciplinaDao disciplinaDao;

	@GetMapping // expoe o metodo GET
	public List<Disciplina> get() {
		return disciplinaDao.findAll();
	}

	@PostMapping // expoe o metodo POST
	public void post(@RequestBody Disciplina disciplina) { // @RequestBody - marca o objeto como corpo da mensagem POST
		disciplinaDao.save(disciplina);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		disciplinaDao.deleteById(id);
	}
	
	@PutMapping 
	public void put(@RequestBody Disciplina disciplina) {
		disciplinaDao.save(disciplina);
	}
}

