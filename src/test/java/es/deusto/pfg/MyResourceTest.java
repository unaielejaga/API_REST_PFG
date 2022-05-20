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
		String expected = "{\"ingre1\":{\"fechacad\":\"25/05/2022\",\"fechacompr\":\"17/05/2022\",\"fechacons\":\"20/05/2022\",\"marca\":\"Bimbo\",\"nombre\":\"Pan\"}}";
		assertEquals(expected, mr.getProductos());
	}

}
