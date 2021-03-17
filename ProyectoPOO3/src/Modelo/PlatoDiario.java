package Modelo;

public class PlatoDiario extends Plato{

	public PlatoDiario(int c, String n, int p) {
		super(c, n, p);

	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 3737249404226447442L;

	public int CalcularValor() {

		int valor = 0;
		double valorIva = 0;

		for(int i = 0; i < Ingredientes_plato.size(); i++) {
			valor += (Ingredientes_plato.get(i).darIngrediente().darPrecioUnitario())*(Ingredientes_plato.get(i).darCantidad());
		}

		valorIva = (double)valor;
		valorIva = valorIva * 0.16;

		valor = valor + (int)valorIva;

		return valor;
	}

}
