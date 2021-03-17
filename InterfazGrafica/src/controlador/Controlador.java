package controlador;

import vista.VentanaPrincipal;

public class Controlador 
{
	private VentanaPrincipal vista;
	
	public Controlador() 
	{
		vista = new VentanaPrincipal();
	}
	
	public static void main(String[] args) 
	{
		new Controlador();

	}

}
