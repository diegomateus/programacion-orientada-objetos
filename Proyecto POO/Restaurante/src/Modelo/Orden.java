package Modelo;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.*;


public class Orden  implements Serializable{
	
	private static final long serialVersionUID = -7396842053008827653L;
	//Atributos

	private static int ID_CONSECUTIVO = 1000; 
	private int codigo;
	private long valor;
	private LocalDateTime fecha;
	private List<OrdenesPlato> ordenesPlato;
	//Constructor
	/**
	 * @param valor
	 */
	public Orden()
	{
		codigo = ID_CONSECUTIVO;
		ID_CONSECUTIVO++;
		this.valor = 0;
		fecha = LocalDateTime.now();
		ordenesPlato = new ArrayList<OrdenesPlato>();
	}
	public static int getID_CONSECUTIVO() {
		return ID_CONSECUTIVO;
	}
	public static void setID_CONSECUTIVO(int iD_CONSECUTIVO) {
		ID_CONSECUTIVO = iD_CONSECUTIVO;
	}
	//Métodos, getters y setters
	/**
	 * @return
	 */
	public int darCodigo() {
		return codigo;
	}
	/**
	 * @param codigo
	 */
	public void cambiarCodigo(int codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return
	 */
	public long darValor() {
		return valor;
	}
	/**
	 * @param valor
	 */
	public void cambiarValor(long valor) {
		this.valor = valor;
	}
	/**
	 * @return
	 */
	public LocalDateTime darFecha() {
		return fecha;
	}
	/**
	 * @param fecha
	 */
	public void cambiarFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	/**
	 * @param cantidadPlatos
	 * @param p
	 */
	public void agregarPlatosOrdenes(int cantidadPlatos,Plato p) {
		OrdenesPlato ordenPlato = new OrdenesPlato(cantidadPlatos,p);
		ordenesPlato.add(ordenPlato);

	}
	
	public int darCantidadDePlatos(int cod) {
		
		int total = 0;
		
		for (int i = 0; i < ordenesPlato.size(); i++) {
			if(cod == ordenesPlato.get(i).darCodigoPlato()) {
				total += ordenesPlato.get(i).darCantidad();
			}
		}
		return total;
	}
}