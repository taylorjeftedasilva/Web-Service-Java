package server.publique;


import javax.jws.WebService;

import web.server.primeiroWebService;

@WebService
public class Publish {
	primeiroWebService n=new primeiroWebService();
	
	public int  idade(){		
		return n.getIdade() ;
	}

	public String nome(String nm) {
		n.setNome(nm);
		return n.getNome();
	}
	
}
