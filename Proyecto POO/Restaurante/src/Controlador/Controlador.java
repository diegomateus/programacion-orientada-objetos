package Controlador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import Modelo.Ingredientes;
import Modelo.Orden;
import Modelo.Plato;
import Modelo.Restaurante;
import Persistencia.Persistencia;
import java.io.IOException;
import java.time.DayOfWeek;
import java.time.LocalDateTime;

import Vista.Vista;

public class Controlador {

	//Atributos
	Scanner leer = new Scanner(System.in);
	//Relaciones
	private Vista vista;
	private Restaurante modelo;
	private Persistencia persistencia;
	private TestTeclado teclado;
	//Constructor
	public Controlador(){
		vista = new Vista();
		modelo = new Restaurante();
		persistencia = new Persistencia();
		teclado = new TestTeclado();
	}

	//Metodos

	/**
	 * Método que sirve para agregar ingredientes al inventario mediante la relación con la clase restaurante
	 * @param codigo (Es el código del nuevo ingrediente)
	 * @param nombre (Es el nombre del nuevo ingrediente)
	 * @param precioUnitario (Es el precio unitario del nuevo ingrediente)
	 * @param descripcionIngrediente (Es la descripción del nuevo ingrediente)
	 * @param inventario (Es la cantidad que va a estar en el inventario  del nuevo ingrediente)
	 * @param minimo (Es el minimo del nuevo ingrediente)
	 */
	public void agregarIngredientes( int codigo, String nombre, long precioUnitario, String descripcionIngrediente, int inventario, int minimo){
		modelo.agregarIngrediente(codigo, nombre, precioUnitario, descripcionIngrediente, inventario, minimo);
	}

	/**
	 * Método que llama a la clase restaurante para que sume más ingredientes al inventario
	 * @param codigo (Es el código del ingrediente al cual se la va a sumar)
	 * @param inventario (Es la cantidad que se le va sumar)
	 */
	public void agregarInventario(int codigo,int inventario) {
		modelo.agregarInventario(codigo,inventario);
	}

	/**
	 * Método que llama al modelo para buscar un ingrediente dado un parámetro 
	 * @param codigo (Parámetro para buscar el ingrediente)
	 * @return (Retorna el objeto asociado)
	 */
	public Ingredientes buscarIngrediente(int codigo) {
		Ingredientes ingre = modelo.buscarIngrediente(codigo);
		return ingre;
	}

	/**
	 * Método que conecta con la clase restaurante para agregar platos al inventario
	 * @param codigo (Es el código del nuevo plato)
	 * @param nombre (Es el nombre del nuevo plato)
	 */
	public void agregarPlato(int codigo,String nombre) {
		modelo.agregarPlato(codigo, nombre);
	}

	/**
	 * Método para buscar un plato es especifico a añadirlo a una nueva variable
	 * @param codigo (El parametro por el cual se va a buscar un plato en especifico
	 * @return (retorna el objeto asociado al plato)
	 */
	public Plato buscarPlato(int codigo) {
		Plato actual = modelo.buscarPlato(codigo);
		return actual;
	}

	/**
	 * Método que funciona para agregar los ingredientes a los platos
	 * @param codigo (Es el codigo del plato al que se le van a agregar ingredientes)
	 * @param codigoIngrediente (Es el codigo del ingrediente el cual va a ser agregado al plato)
	 * @param cant (Es el numero de cada ingrediente que va en el plato)
	 */
	public void agregarIngredienteAPlato(int codigo,int codigoIngrediente,int cant) {
		modelo.agregarCantidadPlato(codigo, codigoIngrediente, cant);
	}

	/**
	 * Llama a la vista para imprimir una frase
	 * @param arg (La frase la cual se va a imprimir)
	 */
	public void imprimir(String arg){
		vista.imprimirString(arg); // llamado a la vista que imprime cualquier cadena
	}
	/**
	 * Método que imprime un error
	 */
	public void imprimirError()
	{
		vista.Error();//Llamado a la clase vista para imprimir un mensaje de error
	}
	/**
	 * Método que imprime las ventas hechas por día
	 * @param codigo código de la orden
	 * @param valor valor de la orden
	 */
	public void imprimirVentas(int codigo, long valor) {
		vista.imprimirVentasDia(codigo, valor);

	}

	public void total_dia(long valor) {
		vista.Total_dia(valor);
	}
	public void platosPedidos(int codigo,String nombre, int pedidos)
	{
		vista.platosPedidos(codigo, nombre, pedidos);//LLamado a la clase vista
		//para imprimir los platos más pedidos
	}

	public void Imprimir_total_orden(int total) {
		vista.Imprimir_total_orden(total);
	}

	public void agregarPlatoCarta(int c, String n, int p, String dia) {
		modelo.agregarPlatoCarta(c, n, dia);
	}

	public void Imprimir_agregar_orden(int I_D) {
		vista.Imprimir_agregar_orden(I_D);
	}
	/**
	 * Método principal, en el cual se muestra el menú principal
	 * y se hacen los distintos casos de la seleccion
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void inicio() throws IOException, ClassNotFoundException{
		//Método usado para conectar con la clase vista y la clase TestTeclado
		//para observar el menú principal e ingresar datos por consola.

		int opcion = 0;

		do{
			//Cada "case" en este método es una relación con la clase Restaurante.
			// Vista, persistencia y TestTeclado.
			vista.Menu();
			opcion = teclado.ingresoDatos();
			switch (opcion){

			case 1: 

				vista.PedirRuta();
				String ruta1 = teclado.retornarString();
				persistencia.leerIngredientes(ruta1, this);

				break;

			case 2:

				vista.PedirRuta();
				String ruta2 = teclado.retornarString();
				persistencia.leerPlatos(ruta2,this);
				modelo.calcularValor();

				break;	

			case 3:

				vista.imprimirString(" ");
				vista.imprimirString("--MENÚ DEL RESTAURANTE");
				vista.imprimirString(" ");

				List<Integer> codigos = new ArrayList<Integer>();
				List<String> nombres = new ArrayList<String>();
				List<String> tipos = new ArrayList<String>();
				List<Integer> valor = new ArrayList<Integer>();
				List<String> dias = new ArrayList<String>();

				codigos = modelo.menuInt();
				nombres = modelo.menuNom();
				tipos = modelo.menuTipo();
				valor = modelo.menuValor();
				dias = modelo.menuDia();

				for (int i = 0; i < codigos.size(); i++) {
					vista.imprimirString("Codigo: "+ codigos.get(i));
					vista.imprimirString("Nombre: "+ nombres.get(i));
					vista.imprimirString("Tipo: "+ tipos.get(i));
					vista.imprimirString("Día: "+dias.get(i));
					vista.imprimirString("Valor: $" + valor.get(i));
					vista.imprimirString(" ");
				}

				break;

			case 4:

				boolean cantidad;


				List<String> inventario = new ArrayList<String>();
				List<Integer> numeros = new ArrayList<Integer>();

				Orden nuevaOrden = modelo.crearOrden();
				Imprimir_agregar_orden(modelo.darCodigoUltimaOrden());

				vista.pedirPlatos();//cuántos platos quiere
				int cant = teclado.ingresoDatos();//ingresa el usuario
				int total = 0;

				for(int i = 0; i < cant; i++){

					vista.pregCodigo();//código del plato
					int codigoPlato = teclado.ingresoDatos();

					if ( modelo.verificar(codigoPlato) == false){
						vista.platoCodigoNoEncontrado(codigoPlato);
						break;
					}

					if(modelo.verificarDia(codigoPlato) == false) {
						vista.imprimirString("Ese plato no esta disponible el dia de hoy");
						break;
					}

					else {

						vista.ingCant();//Cuántos Platos
						int cantidadPlatos = teclado.ingresoDatos();//Ingresa el usuario

						cantidad = modelo.restarCantidad(codigoPlato,cantidadPlatos);

						if(cantidad == true) {

							modelo.agregarPlatosOrdenes(nuevaOrden.darCodigo(),codigoPlato,cantidadPlatos);
							total += modelo.totalOrden(codigoPlato,cantidadPlatos);

							inventario = modelo.verificarInventario();
							numeros = modelo.verificarCantidadInventario();
							modelo.modificarPrecioOrden(total);
							Imprimir_total_orden(total);

							if(inventario.isEmpty() == false) {
								for (int j = 0; j < inventario.size(); j++) {
									vista.imprimirString("El ingrediente: "+ inventario.get(i) + " necesita pedirle minimo al provedor "+ numeros.get(i) + " para tener lo minimo requerido. ");
								}
							}
						}
						else {
							vista.imprimirString(" No quedan suficientes ingredientes para realizar la orden");
							modelo.eliminarOrden(nuevaOrden.darCodigo());
						}
					}
				}



				break;

			case 5:

				vista.imprimirString("--PLATOS MÁS RENTABLES");
				vista.imprimirString(" ");

				List<Integer> pedidos = new ArrayList<Integer>();
				pedidos = modelo.calcularPlatosMasSolicitados();
				String nombre;
				String diaPedido;
				boolean poder = false;
				int pla = 0;

				if(pedidos.size() == 0) {
					System.out.println("Aún no se han hecho pedidos");
				} 

				else{

					for(int i = 0 ; i < pedidos.size(); i+=2) {
						int cod = pedidos.get(i);

						nombre = modelo.buscarNombre(cod);
						diaPedido = modelo.retornarDia(cod);

						int cantidades = pedidos.get(i+1);

						if(cantidades != 0) {

							pla++;

							vista.imprimirString("Código: "+cod);
							vista.imprimirString("Nombre: "+ nombre);

							if(diaPedido!= "")
							{
								vista.imprimirString("Tipo: Carta");
								vista.imprimirString("Día: " + diaPedido);
							}
							else
							{
								vista.imprimirString("Tipo: Diario");
								vista.imprimirString("Día: Todos");
							}
							vista.imprimirString("Cantidad: "+cantidades);
							vista.imprimirString(" ");
						}
						else {
							poder = true;
						}
					}

					if (poder == true) {
						vista.imprimirString("Solo se han hecho pedidos de: "+ pla + " plato(s)");
						vista.imprimirString(" ");
					}
				}

				break;

			case 6:

				vista.imprimirString("--PLATOS MÁS RENTABLES");
				vista.imprimirString(" ");
				List<Integer> rentables = new ArrayList<Integer>();
				rentables = modelo.calcularPlatosMasRentables();
				boolean poder2 = false;
				int pla2 = 0;

				if(rentables.size() == 0)
				{
					System.out.println("Aún no se han hecho pedidos");
				}
				else
				{
					for (int i = 0; i < rentables.size(); i+=2) {

						int cod = rentables.get(i);
						diaPedido = modelo.retornarDia(cod);
						nombre = modelo.buscarNombre(cod);

						int cantidades = rentables.get(i+1);

						if(cantidades != 0) {

							pla2++;

							vista.imprimirString("Código: "+cod);
							vista.imprimirString("Nombre: "+ nombre);

							if(diaPedido!= "")
							{

								vista.imprimirString("Tipo: Carta");
								vista.imprimirString("Día: " + diaPedido);
							}
							else
							{
								vista.imprimirString("Tipo: Diario");
								vista.imprimirString("Día: Todos");
							}
							vista.imprimirString("Total Ventas: $"+cantidades);	
							vista.imprimirString(" ");
						}

						else {
							poder2 = true;
						}
					}

					if(poder2 == true) {
						vista.imprimirString("Solo se han hecho pedidos de: "+ pla2 + " plato(s)");

					}
				}

				break;

			case 7:

				vista.imprimirString("--TOTAL DE VENTAS EN UN DIA");
				vista.imprimirString(" ");
				vista.imprimirString("Indique una fecha en formato año-mes-día");
				String linea = teclado.retornarString();
				vista.imprimirString(" ");
				String[]datos = linea.split("-");

				int anio = Integer.parseInt(datos[0].trim());
				int mes = Integer.parseInt(datos[1].trim());
				int dia = Integer.parseInt(datos[2].trim());
				List<Orden> ventasDia = modelo.ventasDia(anio,mes,dia);

				long totalVendido = 0;
				for (Orden orden : ventasDia) 
				{
					vista.imprimirVentasDia(orden.darCodigo(), orden.darValor());
					totalVendido += orden.darValor();
				}
				total_dia(totalVendido);
				vista.imprimirString(" ");

				break;

			case 8:
				persistencia.serializar(modelo);

				break;

			case 9:
				try {
					modelo = persistencia.cargar();
					vista.imprimirString("Se cargó correctamente");
				}
				catch (Exception e) {
					// TODO Auto-generated catch block
					vista.imprimirString(e.getMessage());
				}
				break;

			default: vista.errorDatoIngresado();

			break;

			}		

		}while(opcion != 10); 

	}

	public static void main(String args []) throws IOException, ClassNotFoundException {
		Controlador c = new Controlador();
		c.inicio();//Llamado al metodo que relaciona todo.
	}
}