package modelo;

import java.awt.Color;

public class Animal 
{
	protected int peso;
	
	protected Color color;
	
	protected int tama�o;
	
	protected int altura;
	
	protected String tipo;

	/**
	 * @param peso
	 * @param color
	 * @param tama�o
	 * @param altura
	 * @param tipo
	 */
	public Animal(int peso, Color color, int tama�o, int altura, String tipo) {
		this.peso = peso;
		this.color = color;
		this.tama�o = tama�o;
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
	 * @return the tama�o
	 */
	public int getTama�o() {
		return tama�o;
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
	 * @param tama�o the tama�o to set
	 */
	public void setTama�o(int tama�o) {
		this.tama�o = tama�o;
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
