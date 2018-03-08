package br.com.pontuacao.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.pontuacao.domain.Cidade;
import br.com.pontuacao.ws.CidadeWsClient;

@Service
public class CidadeService {

	@Autowired
	CidadeWsClient cidadeWsClient;

	public List<Cidade> getCidades(Cidade cidade) {
		return cidadeWsClient.getCidades().stream().filter(c -> c.isPesquisaValida(cidade)).collect(Collectors.toList());
	}
	
	public String getPontos(Cidade cidade){
	  return cidadeWsClient.getPontosCidade(cidade); 	
	}
}
