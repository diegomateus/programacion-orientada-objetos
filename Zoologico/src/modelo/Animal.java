package modelo;

import java.awt.Color;

public class Animal 
{
	protected int peso;
	
	protected Color color;
	
	protected int tamaño;
	
	protected int altura;
	
	protected String tipo;

	/**
	 * @param peso
	 * @param color
	 * @param tamaño
	 * @param altura
	 * @param tipo
	 */
	public Animal(int peso, Color color, int tamaño, int altura, String tipo) {
		this.peso = peso;
		this.color = color;
		this.tamaño = tamaño;
		this.altura = altura;
		this.tipo = tipo;
	}

	/**
	 * @return the peso
	 */
	public int getPeso() {
		return peso;
	}

	/**
	 * @return the color
	 */
	public Color getColor() {
		return color;
	}

	/**
	 * @return the tamaño
	 */
	public int getTamaño() {
		return tamaño;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * @param peso the peso to set
	 */
	public void setPeso(int peso) {
		this.peso = peso;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(Color color) {
		this.color = color;
	}

	/**
	 * @param tamaño the tamaño to set
	 */
	public void setTamaño(int tamaño) {
		this.tamaño = tamaño;
	}

	/**
	 * @param altura the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	
}
