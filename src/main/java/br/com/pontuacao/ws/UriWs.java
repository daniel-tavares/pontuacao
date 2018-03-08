package br.com.pontuacao.ws;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:uri-ws.properties")
public class UriWs {
	
	@Value("${baseUrlCidades}")
	public String baseUrlCidades; 
	
	@Value("${baseUrlPontos}")
	public String baseUrlPontos; 
}
