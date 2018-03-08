package br.com.pontuacao.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cidade {

	@JsonProperty("Nome")
	private String nome;
	
	@JsonProperty("Estado")
	private String estado;
	
	
	public String getNome() {
		if(this.nome!=null)
			return this.nome.trim();
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean isPesquisaValida(Cidade cidade){
		if(cidade.getNome().equalsIgnoreCase(getNomeCidadeAserComparada(cidade.getNome().length())) &&  cidade.getEstado().equalsIgnoreCase(this.estado))
			return true;
		
		return false;
	}
	
	private String getNomeCidadeAserComparada(int tamanho){
		if(tamanho>this.nome.length())
			return this.nome;
		return this.nome.substring(0,tamanho);
	}
	@Override
	public String toString() {
		return "Cidade [nome=" + nome + ", estado=" + estado + "]";
	}
	
	
}
