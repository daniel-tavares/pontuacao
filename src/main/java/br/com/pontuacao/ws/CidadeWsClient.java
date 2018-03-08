package br.com.pontuacao.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import br.com.pontuacao.domain.Cidade;

@Component
public class CidadeWsClient {

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private UriWs uriWs;

	public List<Cidade> getCidades(){
		ParameterizedTypeReference<List<Cidade>> cidades = new ParameterizedTypeReference<List<Cidade>>() {}; 
		ResponseEntity< List<Cidade>> result= restTemplate.exchange(uriWs.baseUrlCidades,HttpMethod.GET,null,cidades);
		return result.getBody();
		
	}
	
	public String getPontosCidade(Cidade cidade){
		ResponseEntity<String> result= restTemplate.postForEntity(uriWs.baseUrlPontos,cidade, String.class);
		return result.getBody();
	}

}
