package Controlador;

import java.util.Scanner;

public class TestTeclado {
	//Atributos
	Scanner leer = new Scanner(System.in);
	//Constructor
	/**
	 * 
	 */
	public TestTeclado()
	{
		
	}
	//M�todos
	/**
	 * @return
	 */
	public int ingresoDatos()
	{
		//M�todo que sirve para ingresar alg�n dato por consola
		//(enteros) y retorna ese valor ingresado.
		System.out.println(" > ");
		int opcion = leer.nextInt();
		return opcion;
	}
	/**
	 * @return
	 */
	public String retornarString() 
	{
		//M�todo que sirve para ingresar alg�n dato por consola
		//(Cadenas) y retorna ese valor ingresado.
		System.out.print(" > ");
		String lectura = leer.nextLine();
		lectura = leer.nextLine();
		return lectura;
	}
}
