package Modelo;
import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.util.*;


public class Restaurante implements Serializable //Atributo que define que la clase es serializable.
{
	
	private static final long serialVersionUID = -259056076943480032L;
	//Relaciones
	private List<Plato>platos = new ArrayList<Plato>();
	private List<Ingredientes>ingredientes = new ArrayList<Ingredientes>();
	private List<Orden>ordenes = new ArrayList<Orden>();

	//M�todos
	/**
	 * M�todo que sirve para agregar ingredientes
	 * Este m�todo ingresa los par�metros recibidos al constructor
	 * del ingrediente y se a�ade a la lista contenida en la clase Restaurante.
	 * @param codigo
	 * @param nombre
	 * @param precioUnitario
	 * @param descripcionIngrediente
	 * @param inventario
	 * @param minimo
	 */
	public void agregarIngrediente( int codigo,String nombre, long precioUnitario, String descripcionIngrediente, int inventario, int minimo){
		Ingredientes ingr = new Ingredientes(codigo,nombre, precioUnitario, descripcionIngrediente, inventario, minimo);
		ingredientes.add(ingr);

	}

	/**
	 * Este m�todo recibe como par�metro el c�digo del ingrediente
	 * cuando este es encontrado retorna el objeto.
	 * @param codigo
	 * @return
	 */
	public Ingredientes buscarIngrediente(int codigo) {
		Ingredientes actual = null;

		for(int i = 0; i < ingredientes.size() ;i++) {
			if(ingredientes.get(i).darCodigo() == codigo) {
				actual = ingredientes.get(i);
			}
		}	
		return actual;
	}
	
	/**
	 * @param codigo
	 * @param inventario
	 */
	public void agregarInventario(int codigo,int inventario){
		
		int nuevo = 0;
		
		for(int i = 0; i < ingredientes.size(); i++) {
			if(ingredientes.get(i).darCodigo() == codigo) {
				nuevo = ingredientes.get(i).darInventario();
				ingredientes.get(i).CambiarInventario(nuevo + inventario);
			}
		}
	}
	/**
	 * Este m�todo usa los par�metros para guardarlos en el constructor de platos
	 * cuando estos par�metros son a�adidos, el nuevo plato se agrega a la lista
	 * @param codigo
	 * @param nombre
	 */
	public void agregarPlato(int codigo,String nombre) {
		Plato plat = new PlatoDiario(codigo,nombre,0);
		platos.add(plat);
	}

	/**
	 * Este m�todo recibe como par�metro el c�digo del plato
	 *  cuando este es encontrado retorna el objeto.
	 * @param codigo
	 * @return
	 */
	public Plato buscarPlato(int codigo) {
		Plato actual = null;

		for(int i = 0; i < platos.size(); i++) {
			if(platos.get(i).darCodigo() == codigo) {
				actual = platos.get(i);
			}
		}
		return actual;
	}

	/**
	 * M�todo que calcula el valor de la orden con su IVA
	 */
	public void calcularValor() {
		

		for(int i = 0; i < platos.size(); i++) {
			platos.get(i).CambiarPrecio(platos.get(i).CalcularValor());	
		}
	}
	/**
	 * M�todo que retorna la lista de c�digos de los platos
	 * @return
	 */
	public List<Integer> menuInt()
	{
		List<Integer>codigos = new ArrayList<Integer>();
		
		for (int i = 0; i < platos.size(); i++) {
			codigos.add(platos.get(i).darCodigo());
		}
		
		return codigos;
		
	}
	/**
	 * M�todo que retorna la lista de nombres de los platos
	 * @return
	 */
	public List<String> menuNom()
	{
		List<String>nombres = new ArrayList<String>();
		
		for (int i = 0; i < platos.size(); i++) {
			nombres.add(platos.get(i).darNombre());
		}
		
		return nombres;
		
	}
	/**
	 * M�todo que retorna la lista de tipos de platos
	 * @return
	 */
	public List<String> menuTipo(){
		
		List<String>tipos = new ArrayList<String>();
		
			for (int i = 0; i < platos.size(); i++) {
				if(platos.get(i)instanceof PlatoCarta) {
					tipos.add("carta");
				}
				else {
					tipos.add("diario");
				}
			}
		
			return tipos;
	}
	/**
	 * M�todo que retorna el d�a de una orden en un plato carta
	 * @return
	 */
	public List<String> menuDia(){
		
		List<String>dias = new ArrayList<String>();
		
			for (int i = 0; i < platos.size(); i++) {
				if(platos.get(i)instanceof PlatoCarta) {
					PlatoCarta pc = (PlatoCarta)platos.get(i);
					dias.add(pc.dia);
				}
				else {
					dias.add("Todos");
				}
			}
		
			return dias;
	}
	/**
	 * M�todo que retorna una lista con los precios de los platos
	 * @return
	 */
	public List<Integer> menuValor(){
		List<Integer>valor = new ArrayList<Integer>();
		
		for (int i = 0; i < platos.size(); i++) {
			valor.add(platos.get(i).darPrecio());
		}
		
		return valor;
	}
	
	/**
	 * M�todo que verifica la existencia de un plato mediante su c�digo
	 * @param codigo
	 * @return
	 */
	public boolean verificar (int codigo)
	{
		for (int i = 0; i < platos.size(); i++) 
		{
			if(codigo == platos.get(i).darCodigo() )
			{
				return true;
			}
		}
		return false;
	}

	/**
	 * M�todo que recibe como par�metros el codigo del plato
	 * para as� restar la cantidad de ingredientes disponibles en el inventario
	 * @param codigo
	 * @param cantidad
	 * @return
	 */
	public boolean restarCantidad(int codigo,int cantidad) {

		boolean encontrado = false;
		boolean poder = false;
		int i = 0;

		List <Integer>codigos = new ArrayList<Integer>();
		List <Integer>cantidades = new ArrayList<Integer>();

		while(encontrado == false && i < platos.size()) {
			if(platos.get(i).darCodigo() == codigo) {

				codigos = platos.get(i).restarCantidad();
				cantidades = platos.get(i).restarCantidadDos(cantidad);

				encontrado = true;

			}
			else {
				i++;
			}
		}
		
		for(int j = 0; j < ingredientes.size(); j++) {
			for(int k = 0; k <codigos.size(); k++) {
				if(ingredientes.get(j).darCodigo() == codigos.get(k)) {
					int cant = (ingredientes.get(j).darInventario()) - (cantidades.get(k));
					
					if(cant >= 0) {
						ingredientes.get(j).CambiarInventario(cant);
						poder = true;
					}
					else {
						poder = false;
					}
				}
			}
		}
		
		return poder;

	}

	/**
	 * M�todo que recibe como par�metros el codigo de un plato y una cantidad de platos
	 * y retorna el precio del plato multiplicado por la cantidad de platos solicitados
	 * @param codigo
	 * @param cantidadPlatos
	 * @return
	 */
	public int totalOrden(int codigo,int cantidadPlatos) {
		int total = 0;
		for (int i = 0; i < platos.size(); i++) {
			if(codigo == platos.get(i).darCodigo()) {
				total = platos.get(i).darPrecio()*cantidadPlatos;
				break;
			}
		}

		return total;	
	}

	/**
	 * M�todo que crea una orden para retornarla
	 * @return
	 */
	public Orden crearOrden() {

		Orden orden = new Orden();
		ordenes.add(orden);
		return orden;
	}

	/**
	 * M�todo que m�difica el precio de una orden
	 * @param valor
	 */
	public void modificarPrecioOrden(int valor) {
		ordenes.get(ordenes.size() - 1).cambiarValor(valor);
	}

	/**
	 * M�todo que agrega la cantidad de pedidos de un plato
	 * @param codigo
	 * @param codigoIngrediente
	 * @param cant
	 */
	public void agregarCantidadPlato(int codigo,int codigoIngrediente,int cant) {

		int i = 0;
		int j = 0;
		boolean encontrado = false;
		boolean encontrado1 = false;

		while (i < platos.size() && encontrado == false) {

			if(platos.get(i).darCodigo() == codigo) {
				encontrado = true;
			}
			else {
				i++;	
			}
		}
		while( j < ingredientes.size() && encontrado1 == false) {
			if(ingredientes.get(j).darCodigo() == codigoIngrediente) {
				encontrado1 = true;
			}
			else {
				j++;
			}
		}
		if (encontrado == true && encontrado1 == true)
		{
			platos.get(i).agregarCantidadIngredientes(cant, ingredientes.get(j));
		}
		else 
		{
			System.out.println("Error");
		}
	}

	/**
	 * M�todo que agrega una orden
	 * @param I_D
	 * @param codigo
	 * @param cantidadPlatos
	 */
	public void agregarPlatosOrdenes(int I_D,int codigo, int cantidadPlatos) {

		int i = 0;
		int j = 0;
		boolean encontrado = false;
		boolean encontrado2 = false;

		while(i < ordenes.size() && encontrado == false) {
			if(ordenes.get(i).darCodigo() == I_D) {
				encontrado = true;
			}
			else {
				i++;
			}
		}
		while(j<platos.size()&&encontrado2 == false) {
			if(platos.get(j).darCodigo() == codigo) {
				encontrado2 = true;
			}
			else {
				j++;
			}
		}
		if(encontrado == true && encontrado2 == true) {
			ordenes.get(i).agregarPlatosOrdenes(cantidadPlatos,platos.get(j));
		}
	}
	
	/**
	 * M�todo que retorna una lista de ordenes hechas en un dia, mes y a�o espec�fico
	 * @param anio
	 * @param mes
	 * @param dia
	 * @return
	 */
	public List<Orden> ventasDia(int anio,int mes,int dia) 
	{
		List<Orden> respuesta = new ArrayList<Orden>();
		for(int i = 0; i < ordenes.size(); i++) 
		{
			if((ordenes.get(i).darFecha().getDayOfMonth() == dia) && (ordenes.get(i).darFecha().getMonthValue() == mes) && (ordenes.get(i).darFecha().getYear() == anio)) {
				respuesta.add(ordenes.get(i));
			}
		}
		return respuesta;	
	}
		
	/**
	 * M�todo que retorna una lista ordenada de la cantidad de ordenes de menor a mayor
	 * @return
	 */
	public List<Integer> calcularPlatosMasSolicitados(){
		
		Comparator<Integer> comparador = Collections.reverseOrder();
		List<Integer>solicitados = new ArrayList<Integer>();
		List<Integer>cantidad = new ArrayList<Integer>();
		
		int cod = 0;
		int cant = 0;
		
		for (int i = 0; i < platos.size(); i++) {
			cod = platos.get(i).darCodigo();
			for (int j = 0; j < ordenes.size(); j++) {
				cant = ordenes.get(j).darCantidadDePlatos(cod);
			}
			cantidad.add(cant);
			cant = 0;
		}
		
		Collections.sort(cantidad,comparador);		
		for (int i = 0; i < cantidad.size(); i++) {
			
			for (int j = 0; j < platos.size(); j++) {
				
				cod = platos.get(j).darCodigo();
				for (int j2 = 0; j2 < ordenes.size(); j2++) {
					if (ordenes.get(j2).darCantidadDePlatos(cod) == cantidad.get(i)){
						solicitados.add(platos.get(j).darCodigo());
						solicitados.add(cantidad.get(i));
					}
				}
			}
		}
		return solicitados;
	} 
	/**
	 * M�todo que retorna el nombre del plato recibiendo como par�metro el c�digo
	 * @param cod
	 * @return
	 */
	public String buscarNombre(int cod)
	{
		String nombre = "";
		for (int i = 0; i < platos.size(); i++) {
			if(cod == platos.get(i).darCodigo())
			{
				nombre = platos.get(i).darNombre();
			}
		}
		return nombre;
	}
	public String retornarDia(int cod)
	{
		String dia = "";
		for (int i = 0; i < platos.size(); i++) 
		{
			if( cod == platos.get(i).darCodigo())
			{
				if(platos.get(i) instanceof PlatoCarta)
				{
					PlatoCarta pc = (PlatoCarta)platos.get(i);
					dia = pc.dia;
				}
			}
		}
		return dia;
	}
	/**
	 * M�todo que retorna una lista ordenada de los valores de los platos m�s rentables
	 * @return
	 */
public List<Integer> calcularPlatosMasRentables(){
		
		Comparator<Integer> comparador = Collections.reverseOrder();
		List<Integer>rentables = new ArrayList<Integer>();
		List<Integer>cantidad = new ArrayList<Integer>();
		
		int cod = 0;
		int cant = 0;
		
		for (int i = 0; i < platos.size(); i++) {
			cod = platos.get(i).darCodigo();
			for (int j = 0; j < ordenes.size(); j++) {
				cant = ordenes.get(j).darCantidadDePlatos(cod)*platos.get(i).darPrecio();
			}
			cantidad.add(cant);
			cant = 0;
		}
		
		Collections.sort(cantidad,comparador);	
		
		for (int i = 0; i < cantidad.size(); i++) {
			
			for (int j = 0; j < platos.size(); j++) {
				
				cod = platos.get(j).darCodigo();
				for (int j2 = 0; j2 < ordenes.size(); j2++) {
					int rentab = ordenes.get(j2).darCantidadDePlatos(cod) * platos.get(j).darPrecio();
					if ( rentab == cantidad.get(i)){
						rentables.add(platos.get(j).darCodigo());
						rentables.add(cantidad.get(i));
					}
				}
			}
		}
		return rentables;
	} 

	/**
	 * 
	 * @param c
	 * @param n
	 * @param dia
	 */

	public void agregarPlatoCarta(int c, String n,String dia) {
		
		Plato plat = new PlatoCarta(c, n, 0, dia);
		platos.add(plat);
	}
	/**
	 * Este m�todo elimina una orden seg�n su I_D
	 * @param I_D 
	 */
	public void eliminarOrden(int I_D) {
		
		for (int i = 0; i < ordenes.size(); i++) {
			if(ordenes.get(i).darCodigo() == I_D) {
				I_D = I_D-1;
				ordenes.remove(i);
			}
		}
	}
	/**
	 * Este m�todo nos retorna la lista de ingredientes que necesitan hacer un pedidio al provedor
	 * @return
	 */
	public List<String> verificarInventario() {
		
		List<String> respuesta = new ArrayList<String>();
		String nombre;
		
		for (int i = 0; i < ingredientes.size(); i++) {
			if( ingredientes.get(i).darInventario() <= ingredientes.get(i).darMinimo()) {
				nombre = ingredientes.get(i).darNombre();
				respuesta.add(nombre);			
			}
		}
		
		return respuesta;
	}
	
	public List<Integer> verificarCantidadInventario(){
		
		List<Integer>respuesta = new ArrayList<Integer>();
		int cant = 0;
		
		for (int i = 0; i < ingredientes.size(); i++) {
			if(ingredientes.get(i).darInventario() <= ingredientes.get(i).darMinimo()) {
				cant = ingredientes.get(i).darMinimo()-ingredientes.get(i).darInventario();
				respuesta.add(cant);
			}
		}
		
		return respuesta;
	}
	
	public int darCodigoUltimaOrden() {
		
		int respuesta = 0;
		int posicion = 0;
		
		posicion = ordenes.size()-1;
		respuesta = ordenes.get(posicion).darCodigo();
		
		if(posicion  == 0) {
			respuesta = 999;
		}
		
		
		return respuesta + 1;
	}
	
	public boolean verificarDia(int cod) {
		
		boolean respuesta = false;
		DayOfWeek diaActual;
		LocalDateTime hoy;
		int numeroDia = 0;
		String palabra = " ";
		
		hoy = LocalDateTime.now();
		
		diaActual = hoy.getDayOfWeek();
		numeroDia = diaActual.getValue();
		
		if(numeroDia == 1) {
			palabra = "lu";
		}
		
		if(numeroDia == 2) {
			palabra = "ma";
		}
		
		if(numeroDia == 3) {
			palabra = "mi";
		}
		
		if(numeroDia == 4) {
			palabra = "ju";
		}
		
		if(numeroDia == 5) {
			palabra = "vi";
		}
		
		if(numeroDia == 6) {
			palabra = "sa";
		}
		
		if(numeroDia == 7) {
			palabra = "do";
		}
		
		for(int i = 0; i < platos.size(); i++ ) {
			if(platos.get(i).darCodigo() == cod) {
				if(platos.get(i) instanceof PlatoDiario) {
					respuesta = true;
				}
				
				if(platos.get(i) instanceof PlatoCarta) {
					PlatoCarta plat = (PlatoCarta)platos.get(i);
					if(plat.darDia() == palabra)
						respuesta = true;
				}
			
			}
		}
		
		return respuesta;
	}
	
}

