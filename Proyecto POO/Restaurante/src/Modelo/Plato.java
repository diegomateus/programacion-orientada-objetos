package Modelo;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public abstract class Plato implements Serializable{

	private static final long serialVersionUID = -1535933597231125789L;

	private int codigo;
	private String nombre;
	private int precio;
	public List<IngredientesPlato>Ingredientes_plato = new ArrayList<IngredientesPlato>();
	private OrdenesPlato op = new OrdenesPlato(); 
	/**
	 * Constructor de plato
	 * @param c
	 * @param n
	 * @param p
	 */
	public Plato( int c, String n, int p) {
		codigo = c;
		nombre = n;
		precio = p;
	}
	/**
	 * M�todo que retorna el valor del plato
	 * @return
	 */
	public int retornarValorplato()
	{
		return op.darCantidad();
	}
	/**
	 * M�todo que retorna el codigo del plato
	 * @return
	 */
	public int darCodigo() {
		return codigo;
	}
	/**
	 * M�todo que sirve para cambiar el c�digo del plato
	 * @param codigo
	 */
	public void CambiarCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * M�todo que retorna el nombre del plato
	 * @return
	 */
	public String darNombre() {
		return nombre;
	}

	/**
	 * M�todo que sirve para cambiar el nombre del plato
	 * @param nombre
	 */
	public void CambiarNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * M�todo que retorna el precio del plato
	 * @return
	 */
	public int darPrecio() {
		return precio;
	}

	/**
	 * M�todo que sirve para cambiar el precio del plato
	 * @param precio
	 */
	public void CambiarPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * M�todo que sirve para agregar una cierta cantidad de ingredientes
	 * @param cantidad cantidad del ingrediente
	 * @param ingre ingrediente
	 */
	public void agregarCantidadIngredientes(int cantidad,Ingredientes ingre) {

		IngredientesPlato ingrediPlato = new IngredientesPlato(cantidad);
		ingrediPlato.AgregarIngrediente(ingre);
		Ingredientes_plato.add(ingrediPlato);
	}

	/**M�todo que retorna una lista con la cantidad de ingredientes del plato
	 * @return lista de ingredientes
	 */
	public List<Integer> cantIngre()
	{
		List <Integer> cantidadIngre = new ArrayList <Integer>();	
		for (int i = 0; i < Ingredientes_plato.size(); i++) 
			{
				cantidadIngre.add(Ingredientes_plato.get(i).darCantidad());
			}
		return cantidadIngre;
	}

	/**
	 * M�todo que calcula el valor del plato usando los precios de los ingredientes
	 * @return valor
	 */
	public abstract int CalcularValor();

	/**
	 * M�todo que retorna la lista de c�digos de los ingredientes
	 * @return
	 */
	public List<Integer> restarCantidad() {

		List<Integer> codigos = new ArrayList<Integer>();

		for(int i = 0; i < Ingredientes_plato.size(); i++) {
			int codigo = Ingredientes_plato.get(i).restarCantidad();
			codigos.add(codigo);
		}

		return codigos;
	}

	/**
	 * 
	 * @param c
	 * @return
	 */
	public List<Integer> restarCantidadDos(int c) {

		List<Integer>cantidades = new ArrayList<Integer>();

		for(int i = 0; i < Ingredientes_plato.size(); i++) {
			int codigo = Ingredientes_plato.get(i).darCantidad();
			cantidades.add(codigo*c);
		}

		return cantidades;
	}
	/**
	 * M�todo que retorna la cantidad de ordenes
	 * @return
	 */
	public int ObtenerCantidadOrdenes()
	{
		return op.darCantidad();
	}
	/**
	 * Constructor de plato carta 
	 * @param c codigo
	 * @param n nombre
	 * @param p precio
	 * @param dia dia de venta
	 * @return
	 */
	public Plato AgregarTipoPlatoCarta(int c, String n, int p,String dia)
	{
		PlatoCarta pc = new PlatoCarta(c,n,p,dia);
		return pc;
	}
	
	
}