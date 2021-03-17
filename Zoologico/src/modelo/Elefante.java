package modelo;

import java.awt.Color;
import java.util.List;

public class Elefante extends Mamífero implements Herbívoro
{

	public Elefante(int peso, Color color, int tamaño, int altura, String tipo,
			int pNumHuesos, int pSemanasEmbarazo) {
		super(peso, color, tamaño, altura, tipo, pNumHuesos, pSemanasEmbarazo);
		
	}

	public String darPlantaFavorita() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean esRumiante() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Animal> darDepredadores() {
		// TODO Auto-generated method stub
		return null;
	}

}
