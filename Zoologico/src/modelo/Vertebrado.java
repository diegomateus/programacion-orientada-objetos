package modelo;

import java.awt.Color;

public class Vertebrado extends Animal 
{
	protected int numHuesos;
	
	public Vertebrado(int peso, Color color, int tamaño, int altura, String tipo, int pNumHuesos) 
	{
		super(peso, color, tamaño, altura, tipo);
		numHuesos = pNumHuesos;
	}

	/**
	 * @return the numHuesos
	 */
	public int getNumHuesos() 
	{
		return numHuesos;
	}

	/**
	 * @param numHuesos the numHuesos to set
	 */
	public void setNumHuesos(int numHuesos) {
		this.numHuesos = numHuesos;
	}

	
}
