package Modelo;

public class PlatoCarta extends Plato {

	protected EnumDia dia;

	//Constructor
	public PlatoCarta(int c, String n, int p, EnumDia dia) {
		super(c, n, p);
		this.dia = dia;

	}
	private static final long serialVersionUID = 1995120759785381959L;

	/**
	 * M�todo que sirve para mostrar el d�a de venta
	 * @return
	 */
	public EnumDia darDia() {
		return dia;
	}
	/**
	 * M�todo que cambia el d�a de venta del plato
	 * @param dia
	 */

	public void cambiarDia(EnumDia dia) {
		this.dia = dia;
	}

	public int CalcularValor() {

		int valor = 0;
		double valoresImpuestos = 0;

		for(int i = 0; i < Ingredientes_plato.size(); i++) {
			valor += (Ingredientes_plato.get(i).darIngrediente().darPrecioUnitario())*(Ingredientes_plato.get(i).darCantidad());
		}

		valoresImpuestos = (double)valor;
		valoresImpuestos= valoresImpuestos * 0.10;

		valor = valor + (int)valoresImpuestos;

		valoresImpuestos = (double)valor;
		valoresImpuestos = valoresImpuestos * 0.16;

		valor = valor + (int)valoresImpuestos;

		return valor;
	}

}
