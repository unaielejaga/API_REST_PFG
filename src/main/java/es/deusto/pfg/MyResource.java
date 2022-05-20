package es.deusto.pfg;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import org.json.JSONObject;

public class MyResource {
	
	static Client client = ClientBuilder.newClient();

	final static WebTarget appTarget = client.target("https://my-app-20856-default-rtdb.europe-west1.firebasedatabase.app/distribuidores/EROS.json");

	public static String getProductos() {
		
		String productos = appTarget.request(MediaType.APPLICATION_JSON).get(String.class);
		return productos;
	}

}
