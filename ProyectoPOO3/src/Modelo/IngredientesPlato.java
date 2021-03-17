package Modelo;

import java.io.Serializable;

public class IngredientesPlato  implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 5553862438359401876L;
	//Atributos
	private int cantidad;
	private Ingredientes ingre;
	//Constructor
	public IngredientesPlato(int c) {
		cantidad=c;
	}
	//Métodos getters y setters
	public int darCantidad() {
		return cantidad;
	}

	public void CambiarCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public Ingredientes darIngrediente() {
		return ingre;
	}

	public void AgregarIngrediente(Ingredientes agregar) {
		ingre = agregar;
	}

	public int restarCantidad() {
		return ingre.darCodigo();
	}

}
