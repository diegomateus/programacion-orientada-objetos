package modelo;

import java.awt.Color;

public class Mam�fero extends Vertebrado 
{

	protected int semanasEmbarazo;
	
	public Mam�fero(int peso, Color color, int tama�o, int altura, String tipo,
			int pNumHuesos, int pSemanasEmbarazo)
	{
		super(peso, color, tama�o, altura, tipo, pNumHuesos);
		
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
