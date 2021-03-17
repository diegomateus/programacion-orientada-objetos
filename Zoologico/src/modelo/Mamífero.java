package modelo;

import java.awt.Color;

public class Mamífero extends Vertebrado 
{

	protected int semanasEmbarazo;
	
	public Mamífero(int peso, Color color, int tamaño, int altura, String tipo,
			int pNumHuesos, int pSemanasEmbarazo)
	{
		super(peso, color, tamaño, altura, tipo, pNumHuesos);
		
		semanasEmbarazo = pSemanasEmbarazo;
	}

	/**
	 * @return the semanasEmbarazo
	 */
	public int getSemanasEmbarazo() {
		return semanasEmbarazo;
	}

	/**
	 * @param semanasEmbarazo the semanasEmbarazo to set
	 */
	public void setSemanasEmbarazo(int semanasEmbarazo) {
		this.semanasEmbarazo = semanasEmbarazo;
	}

	
}
