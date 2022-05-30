package es.deusto.pfg;

import java.util.ArrayList;

public class Main 
{
    public static void main( String[] args )
    {
    	MyResource mr = new MyResource();
    	ArrayList<Producto> productos = mr.getProductos();
    	System.out.println(productos);
    }
}
