package Modelo;

import java.io.Serializable;

public class OrdenesPlato  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6868655384964982725L;
	//Atributos
	private int cantidad;
	//Relaciones
	private Plato plato;
	//Constructores
	public OrdenesPlato(int cant,Plato p)
	{
		cantidad = cant;
		plato = p;
	}
	public OrdenesPlato()
	{

	}
	//Métodos getters y setters
	public int darCantidad() {
		return cantidad;
	}

	public void CambiarCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public int darCodigoPlato() {
		return plato.darCodigo();
	}

}
