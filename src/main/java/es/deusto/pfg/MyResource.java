package es.deusto.pfg;


import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;

import java.util.ArrayList;
import java.util.Iterator;

import org.json.JSONObject;

public class MyResource {
	
	static Client client = ClientBuilder.newClient();

	final static WebTarget appTarget = client.target("https://my-app-20856-default-rtdb.europe-west1.firebasedatabase.app/distribuidores/EROS.json");

	public static ArrayList<Producto> getProductos() {
		ArrayList<Producto> array_productos = new ArrayList<>();
		String productos = appTarget.request(MediaType.APPLICATION_JSON).get(String.class);
		JSONObject json = new JSONObject(productos);
		for(Iterator key=json.keys(); key.hasNext();) {
			JSONObject producto = (JSONObject) json.get((String) key.next());
			Producto obj_producto = new Producto(producto.getString("nombre"), producto.getString("marca"), producto.getString("fechacad"), producto.getString("fechacompr"), producto.getString("fechacons"));
			array_productos.add(obj_producto);
		}
		return array_productos;
	}

}
