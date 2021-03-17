package modelo;

import java.awt.Color;
import java.util.List;

public class Perro extends Mamífero implements Omnívoro
{

	public Perro(int peso, Color color, int tamaño, int altura, String tipo,
			int pNumHuesos, int pSemanasEmbarazo) {
		super(peso, color, tamaño, altura, tipo, pNumHuesos, pSemanasEmbarazo);
		// TODO Auto-generated constructor stub
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

	public int darCantidadCarne() {
		// TODO Auto-generated method stub
		return 0;
	}

	public boolean esCarroñero() {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Animal> darListaPresas() {
		// TODO Auto-generated method stub
		return null;
	}

	public int darNumeroDientes() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
