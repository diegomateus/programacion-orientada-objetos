package Modelo;

import java.io.Serializable;

public class Ingredientes  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7264381387941050639L;
	//Atributos
	private int codigo;
	private String nombre;
	private long precioUnitario;
	private String descripcionUnidad;
	private int inventario;
	private int minimo;
	//Constructor
	/**
	 * @param c
	 * @param n
	 * @param pu
	 * @param d
	 * @param i
	 * @param m
	 */
	public Ingredientes(int c, String n, long pu, String d, int i, int m) 
	{
		codigo = c;
		nombre = n;
		precioUnitario = pu;
		descripcionUnidad = d;
		inventario = i;
		minimo = m;
	}
	//Métodos getters y setters
	/**
	 * @return
	 */
	public int darCodigo() {
		return codigo;
	}
	/**
	 * @param codigo
	 */
	public void CambiarCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return
	 */
	public String darNombre() {
		return nombre;
	}
	/**
	 * @param nombre
	 */
	public void CambiarNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return
	 */
	public long darPrecioUnitario() {
		return precioUnitario;
	}
	/**
	 * @param precioUnitario
	 */
	public void CambiarPrecioUnitario(long precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	/**
	 * @return
	 */
	public String darDescripcionUnidad() {
		return descripcionUnidad;
	}
	/**
	 * @param descripcionUnidad
	 */
	public void CambiarDescripcionUnidad(String descripcionUnidad) {
		this.descripcionUnidad = descripcionUnidad;
	}
	/**
	 * @return
	 */
	public int darInventario() {
		return inventario;
	}
	/**
	 * @param inventario
	 */
	public void CambiarInventario(int inventario) {
		this.inventario = inventario;
	}
	/**
	 * @return
	 */
	public int darMinimo() {
		return minimo;
	}
	/**
	 * @param minimo
	 */
	public void CambiarMinimo(int minimo) {
		this.minimo = minimo;
	}
}