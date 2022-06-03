package es.deusto.pfg;

import java.util.ArrayList;

public class Main 
{
    public static void main( String[] args )
    {
    	MyResource mr = new MyResource();
    	ArrayList<Producto> productos = mr.getProductos("EROS");
    	System.out.println(productos);
    	SwingPanel panel = new SwingPanel(productos);
    	panel.setVisible(true);
    }
}
