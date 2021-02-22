package br.com.mxti.backend;

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

@RestController // faz a classe se comportar como webservice
@RequestMapping("/pessoa") // configura a url do webservice
public class PessoaRest {

	@Autowired // injeta uma instancia de pessoaoDao aqui
	private PessoaDao pessoaDao;

	@GetMapping // expoe o metodo GET
	public List<Pessoa> get() {
		return pessoaDao.findAll();
	}

	@PostMapping // expoe o metodo POST
	public void post(@RequestBody Pessoa pessoa) { // @RequestBody - marca o objeto como corpo da mensagem POST
		pessoaDao.save(pessoa);
	}
	@PutMapping 
	public void put(@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") Long id) {
		pessoaDao.deleteById(id);
	}
}
