package es.deusto.pfg;

public class Main 
{
    public static void main( String[] args )
    {
    	MyResource mr = new MyResource();
    	String productos = mr.getProductos();
    	System.out.println(productos.toString());
    }
}
