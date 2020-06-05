package web.server;

import javax.xml.ws.Endpoint;

import server.publique.Publish;

public class RunServer {

	public static void main(String[] args) {
		Publish web = new Publish();
		String url= "http://localhost:80/PrimeiroWebService";
		Endpoint.publish(url,web);
	}

}
