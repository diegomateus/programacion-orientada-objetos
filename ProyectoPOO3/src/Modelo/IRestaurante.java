package Modelo;

import java.util.List;

public interface IRestaurante {

	public void agregarIngrediente( int codigo,String nombre, long precioUnitario, String descripcionIngrediente, int inventario, int minimo);
	public Ingredientes buscarIngrediente(int codigo);
	public void agregarInventario(int codigo,int inventario);
	public void agregarPlato(int codigo,String nombre);
	public Plato buscarPlato(int codigo);
	public void calcularValor();
	public List<Integer> menuInt();
	public List<String> menuNom();
	public List<String> menuTipo();
	public List<EnumDia> menuDia();
	public List<Integer> menuValor();
	public boolean verificar (int codigo);
	public boolean restarCantidad(int codigo,int cantidad);
	public int totalOrden(int codigo,int cantidadPlatos);
	public Orden crearOrden();
	public void modificarPrecioOrden(int valor);
	public void agregarCantidadPlato(int codigo,int codigoIngrediente,int cant);
	public void agregarPlatosOrdenes(int I_D,int codigo, int cantidadPlatos);
	public List<Orden> ventasDia(int anio,int mes,int dia);
	public List<Integer> calcularPlatosMasSolicitados();
	public String buscarNombre(int cod);
	public EnumDia retornarDia(int cod);
	public List<Integer> calcularPlatosMasRentables();
	public void agregarPlatoCarta(int c, String n,String dia);
	public void eliminarOrden(int I_D);
	public List<String> verificarInventario();
	public List<Integer> verificarCantidadInventario();
	public int darCodigoUltimaOrden();
	public boolean verificarDia(int cod);

}
