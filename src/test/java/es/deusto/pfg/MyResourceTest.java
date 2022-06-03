package es.deusto.pfg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class MyResourceTest {
	
	private MyResource mr;
	
	@Before
	public void crearMyResource() {
		mr = new MyResource();
	}
	
	@Test
	public void testGetProductos() {
		String expected = "[Producto [nombre=Leche, marca=Kaiku, fechacad=06/06/2022, fechacompr=30/05/2022, fechacons=31/05/2022]]";
		assertEquals(expected, mr.getProductos("TEST").toString());
	}

}
