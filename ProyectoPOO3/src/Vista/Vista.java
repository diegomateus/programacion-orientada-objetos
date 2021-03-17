package Vista;

public class Vista {
	//Construtor

	public Vista()
	{

	}
	/**
	 * M�todo que muestra el men� principal
	 */
	public void Menu(){
		System.out.println("RESTURANTE LA GUACHAFITA");
		System.out.println("   1. Agregar un ingrediente nuevo al sistema");
		System.out.println("   2. Agregar un plato nuevo al sistema");
		System.out.println("   3. Mostrar el men� del restaurante");
		System.out.println("   4. Agregar una orden al sistema");
		System.out.println("   5. Mostrar los 3 platos m�s solicitados");
		System.out.println("   6. Mostrar los 3 platos m�s rentables");
		System.out.println("   7. Totalizar las �rdenes de un d�a");
		System.out.println("   8. Guardar el sistema");
		System.out.println("   9. Cargar el sistema");
		System.out.println("  10. Salir");
	}

	/**
	 * M�todo que muestra cuando un dato es ingresado erroneamente
	 */
	public void errorDatoIngresado(){
		System.out.println("El dato ingresado no es v�lido");
	}
	/**
	 * M�todo que indica que alguno de los datos ingresados no es el correcto
	 */
	public void Error(){
		//Este m�todo es usado cuando se es ingresado un dato erroneo
		System.out.println("Alguno de los datos ingresados no es correcto");
	}
	/**
	 * Mensaje de confirmaci�n cuando un ingrediente nuevo es a�adido
	 */
	public void nuevoIngrediente(){
		System.out.println("El ingrediente se agreg� correctamente");
	}

	/**
	 * M�todo que pide la ruta para la lectura de archivos que conectan con la persistencia
	 */
	public void PedirRuta() {
		System.out.println("Digite la ruta");
	}
	/**
	 * Este m�todo imprime el men� disponible, recibe como parametros
	 * el codigo, el nombre y el precio del plato
	 * @param cod
	 * @param nombre
	 * @param precio
	 */
	public void Menu(int cod, String nombre,int precio){
		System.out.println("C�digo: " + cod);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("                   ");
	}
	/**
	 * M�todo que le pide los tipos de platos agregados a la orden al usuario
	 */
	public void pedirPlatos(){
		System.out.println("�Cu�ntos tipos de platos van en la orden? ");
	}

	/**
	 * M�todo que recibe como par�metros el codigo, el nombre y el precio de los platos
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public void platosRentables(int codigo,String nombre, int precio){
		System.out.println("C�digo: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("==========================");
	}
	
	/**
	 * M�todo que pregunta el c�digo
	 */
	public void pregCodigo(){
		System.out.println("Ingrese el c�digo: ");
	}
	
	/**
	 * M�todo que pide la cantidad
	 */
	public void ingCant(){
		System.out.println("Ingrese la cantidad: ");
	}
	
	/**
	 * Este metodo recibe como par�metro cualquier cadena y la imrpime
	 * @param arg
	 */
	public void imprimirString(String arg){
		System.out.println(arg);
	}
	
	/**
	 * M�todo que recibe como par�metros el codigo, el nombre 
	 * y la cantidad de pedidos de los platos
	 * @param codigo
	 * @param nombre
	 * @param pedidos
	 */
	public void platosPedidos(int codigo,String nombre, int pedidos){
		System.out.println("C�digo: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Pedidos: $" + pedidos);
		System.out.println("==========================");
	}
	
	/**
	 * M�todo que recibe como par�metro un numero y lo imprime
	 * @param numero
	 */
	public void Imprimir_int(int numero) {
		System.out.println(numero);
	}
	
	/**
	 * m�todo que recibe como par�metro un codigo y un valor para imprimirlo
	 * @param codigo
	 * @param valor
	 */
	public void imprimirVentasDia(int codigo, long valor) {
		System.out.println("C�digo: " + codigo);
		System.out.println("Valor:  $" + valor);
		System.out.println(" ");
	}
	
	/**
	 * m�todo que recibe como par�metro un valor y lo imprime
	 * @param valor
	 */
	public void Total_dia(long valor) {
		System.out.println("Total:  $" + valor);
	}
	
	/**
	 * M�todo que recibe como par�metro el total de la orden para imprimirla
	 * @param total
	 */
	public void Imprimir_total_orden(int total) {
		System.out.println("El valor de la orden es: $" + total);
		System.out.println(" ");
	}
	
	/**
	 * M�todo que recibe el turno del pedido y lo imprime
	 * @param I_D
	 */
	public void Imprimir_agregar_orden(int I_D) {
		System.out.println("--AGREGAR ORDEN: " + I_D);
	}
	/**
	 * M�todo que indica que no se ha encontrado un plato con un especifico c�digo
	 * @param cod
	 */
	public void platoCodigoNoEncontrado(int cod) {
		System.out.println("El plato con el c�digo '" + cod + "' no existe.");
	}

}
