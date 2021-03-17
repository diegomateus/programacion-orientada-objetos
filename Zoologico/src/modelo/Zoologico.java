package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Zoologico
{
	private List<Animal> listaAnimales;
	
	public Zoologico() 
	{
		listaAnimales = new Vector();
		
		Animal a = new Elefante(peso, color, tamaño, altura, tipo, pNumHuesos, pSemanasEmbarazo);
		
		Elefante e = (Elefante)a;
		
		Vertebrado v2 = (Vertebrado)e;
	
		
		Elefante e2 = new Elefante(peso, color, tamaño, altura, tipo, pNumHuesos, pSemanasEmbarazo);
		
		
		Vaca v = null;
		
		listaAnimales.add(e);
		listaAnimales.add(e2);
		
		boolean es = false;
		
		es = e instanceof Elefante;
		es = e instanceof Mamífero;
		es = e instanceof Animal;
		es = e instanceof Invertebrado;
		
		
		
	}
	
	public List<Elefante> darElefantes()
	{
		List<Elefante> respuesta = new ArrayList<Elefante>();
		
		for (Animal animalActual : listaAnimales)
		{
			if( animalActual instanceof Elefante)
			{
				respuesta.add((Elefante)animalActual);
			}
		}
		
		return respuesta;
	}
}
















