package es.deusto.pfg;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class ProductoTest {

	private Producto p;
	
	@Before
	public void createProducto() {
		p = new Producto("Pan", "Bimbo", "15/07/2022", "21/05/2022", "24/07/2022");
		
	}
	
	@Test
	public void testGetNombre() {
		assertEquals("Pan", p.getNombre());
	}
	
	@Test
	public void testGetMarca() {
		assertEquals("Bimbo", p.getMarca());
	}
	
	@Test
	public void testGetFechacad() {
		assertEquals("15/07/2022", p.getFechacad());
	}
	
	@Test
	public void testGetFechacompr() {
		assertEquals("21/05/2022", p.getFechacompr());
	}
	
	@Test
	public void testGetFechacons() {
		assertEquals("24/07/2022", p.getFechacons());
	}
	
	@Test
	public void testSetNombre() {
		p.setNombre("Agua");
		assertEquals("Agua", p.getNombre());
	}
	
	@Test
	public void testSetMarca() {
		p.setMarca("Bezolla");
		assertEquals("Bezolla", p.getMarca());
	}
	
	@Test
	public void testSetFechacad() {
		p.setFechacad("19/12/2028");
		assertEquals("19/12/2028", p.getFechacad());
	}
	
	@Test
	public void testSetFechacompr() {
		p.setFechacompr("23/07/2023");
		assertEquals("23/07/2023", p.getFechacompr());
	}
	
	@Test
	public void testSetFechacons() {
		p.setFechacons("30/07/2023");
		assertEquals("30/07/2023", p.getFechacons());
	}
	
	@Test
	public void testToString() {
		String expected = "Producto [nombre=Pan, marca=Bimbo, fechacad=15/07/2022, fechacompr=21/05/2022, fechacons=24/07/2022]";
		assertEquals(expected, p.toString());
	}
	
}
