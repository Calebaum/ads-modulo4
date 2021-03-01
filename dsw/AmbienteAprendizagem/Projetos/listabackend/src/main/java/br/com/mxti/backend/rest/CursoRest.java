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

import br.com.mxti.backend.dao.CursoDao;
import br.com.mxti.backend.entidade.Curso;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/curso") // configura a url do webservice
public class CursoRest {

	@Autowired // injeta uma instancia de pessoaoDao aqui
	private CursoDao cursoDao;

	@GetMapping // expoe o metodo GET
	public List<Curso> get() {
		return cursoDao.findAll();
	}

	@PostMapping // expoe o metodo POST
	public void post(@RequestBody Curso curso) { // @RequestBody - marca o objeto como corpo da mensagem POST
		cursoDao.save(curso);
	}
	@PutMapping 
	public void put(@RequestBody Curso curso) {
		cursoDao.save(curso);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		cursoDao.deleteById(id);
	}
}
