package web.server;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class primeiroWebService {
	private String nome="defoult";
	private final int idade=10;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}

}
