package Modelo;

public class PlatoCarta extends Plato {
	
	protected String dia;

	//Constructor
	public PlatoCarta(int c, String n, int p,String dia) {
		super(c, n, p);
		this.dia = dia;

	}
	private static final long serialVersionUID = 1995120759785381959L;

	/**
	 * Método que sirve para mostrar el día de venta
	 * @return
	 */
	public String darDia() {
		return dia;
	}
	/**
	 * Método que cambia el día de venta del plato
	 * @param dia
	 */

	public void cambiarDia(String dia) {
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
