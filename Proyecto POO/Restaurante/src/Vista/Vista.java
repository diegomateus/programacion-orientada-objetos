package Vista;

public class Vista {
	//Construtor

	public Vista()
	{

	}
	/**
	 * Método que muestra el menú principal
	 */
	public void Menu(){
		System.out.println("RESTURANTE LA GUACHAFITA");
		System.out.println("   1. Agregar un ingrediente nuevo al sistema");
		System.out.println("   2. Agregar un plato nuevo al sistema");
		System.out.println("   3. Mostrar el menú del restaurante");
		System.out.println("   4. Agregar una orden al sistema");
		System.out.println("   5. Mostrar los 3 platos más solicitados");
		System.out.println("   6. Mostrar los 3 platos más rentables");
		System.out.println("   7. Totalizar las órdenes de un día");
		System.out.println("   8. Guardar el sistema");
		System.out.println("   9. Cargar el sistema");
		System.out.println("  10. Salir");
	}

	/**
	 * Método que muestra cuando un dato es ingresado erroneamente
	 */
	public void errorDatoIngresado(){
		System.out.println("El dato ingresado no es válido");
	}
	/**
	 * Método que indica que alguno de los datos ingresados no es el correcto
	 */
	public void Error(){
		//Este método es usado cuando se es ingresado un dato erroneo
		System.out.println("Alguno de los datos ingresados no es correcto");
	}
	/**
	 * Mensaje de confirmación cuando un ingrediente nuevo es añadido
	 */
	public void nuevoIngrediente(){
		System.out.println("El ingrediente se agregó correctamente");
	}

	/**
	 * Método que pide la ruta para la lectura de archivos que conectan con la persistencia
	 */
	public void PedirRuta() {
		System.out.println("Digite la ruta");
	}
	/**
	 * Este método imprime el menú disponible, recibe como parametros
	 * el codigo, el nombre y el precio del plato
	 * @param cod
	 * @param nombre
	 * @param precio
	 */
	public void Menu(int cod, String nombre,int precio){
		System.out.println("Código: " + cod);
		System.out.println("Nombre: "+ nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("                   ");
	}
	/**
	 * Método que le pide los tipos de platos agregados a la orden al usuario
	 */
	public void pedirPlatos(){
		System.out.println("¿Cuántos tipos de platos van en la orden? ");
	}

	/**
	 * Método que recibe como parámetros el codigo, el nombre y el precio de los platos
	 * @param codigo
	 * @param nombre
	 * @param precio
	 */
	public void platosRentables(int codigo,String nombre, int precio){
		System.out.println("Código: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Precio: $" + precio);
		System.out.println("==========================");
	}
	
	/**
	 * Método que pregunta el código
	 */
	public void pregCodigo(){
		System.out.println("Ingrese el código: ");
	}
	
	/**
	 * Método que pide la cantidad
	 */
	public void ingCant(){
		System.out.println("Ingrese la cantidad: ");
	}
	
	/**
	 * Este metodo recibe como parámetro cualquier cadena y la imrpime
	 * @param arg
	 */
	public void imprimirString(String arg){
		System.out.println(arg);
	}
	
	/**
	 * Método que recibe como parámetros el codigo, el nombre 
	 * y la cantidad de pedidos de los platos
	 * @param codigo
	 * @param nombre
	 * @param pedidos
	 */
	public void platosPedidos(int codigo,String nombre, int pedidos){
		System.out.println("Código: " + codigo);
		System.out.println("Nombre: " + nombre);
		System.out.println("Pedidos: $" + pedidos);
		System.out.println("==========================");
	}
	
	/**
	 * Método que recibe como parámetro un numero y lo imprime
	 * @param numero
	 */
	public void Imprimir_int(int numero) {
		System.out.println(numero);
	}
	
	/**
	 * método que recibe como parámetro un codigo y un valor para imprimirlo
	 * @param codigo
	 * @param valor
	 */
	public void imprimirVentasDia(int codigo, long valor) {
		System.out.println("Código: " + codigo);
		System.out.println("Valor:  $" + valor);
		System.out.println(" ");
	}
	
	/**
	 * método que recibe como parámetro un valor y lo imprime
	 * @param valor
	 */
	public void Total_dia(long valor) {
		System.out.println("Total:  $" + valor);
	}
	
	/**
	 * Método que recibe como parámetro el total de la orden para imprimirla
	 * @param total
	 */
	public void Imprimir_total_orden(int total) {
		System.out.println("El valor de la orden es: $" + total);
		System.out.println(" ");
	}
	
	/**
	 * Método que recibe el turno del pedido y lo imprime
	 * @param I_D
	 */
	public void Imprimir_agregar_orden(int I_D) {
		System.out.println("--AGREGAR ORDEN: " + I_D);
	}
	/**
	 * Método que indica que no se ha encontrado un plato con un especifico código
	 * @param cod
	 */
	public void platoCodigoNoEncontrado(int cod) {
		System.out.println("El plato con el código '" + cod + "' no existe.");
	}

}
