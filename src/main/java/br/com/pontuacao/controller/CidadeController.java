package br.com.pontuacao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import br.com.pontuacao.domain.Cidade;
import br.com.pontuacao.service.CidadeService;

@Controller
@RequestMapping("/cidade")
public class CidadeController {

	@Autowired
	CidadeService cidadeService;
	
	
	@PostMapping(value="/pesquisar")
	public ModelAndView pesquisar(@RequestBody Cidade cidade){
		ModelAndView model=new ModelAndView("cidade/pesquisa/result");
		List<Cidade> list=cidadeService.getCidades(cidade);
		model.addObject("cidades", list);
		return model;
	}
	
	@PostMapping(value="/pontos")
	public @ResponseBody String pontos(@RequestBody Cidade cidade){
		System.out.println(cidade.toString());
		return cidadeService.getPontos(cidade);
	}
	
}
