package Persistencia;

import java.io.*;
import Controlador.Controlador;
import Modelo.Ingredientes;
import Modelo.Plato;
import Modelo.Restaurante;
import Modelo.IRestaurante;

public class Persistencia {

	/**
	 * Método que guarda información de la clase restaurante
	 * @param r
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static void serializar(IRestaurante r) throws FileNotFoundException, IOException{
		try {

			ObjectOutputStream oos = new ObjectOutputStream( new FileOutputStream("./data/Guardado.txt"));
			oos.writeObject(r);
			oos.close();
		}

		catch(Exception e) {
			e.printStackTrace();
			System.err.println("No se pudo serializar");
		}
	}


	/**
	 * Método que carga información guardada de la clase restaurante 
	 * @return
	 * @throws Exception
	 */
	public static Restaurante cargar() throws Exception{
		
		Restaurante r = null;
		
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("./data/Guardado.txt"));
			r =(Restaurante) ois.readObject();
			ois.close();
			return r;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new Exception("Error al cargar");
		}
	}

	/**
	 * Método que se implementa para leer el archivo de texto correspondiente a los ingredientes
	 * @param ruta dirección del archivo
	 * @param c controlador 
	 * @throws IOException
	 */
	public void leerIngredientes(String ruta, Controlador c) throws IOException{

		try{

			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea = br.readLine();

			while(!linea.startsWith("0")) {

				if(!linea.startsWith("#")){
					String[] datos = linea.split("\\*");
					int codigo = Integer.parseInt(datos[0].trim());				
					String nombre = datos[1].trim();
					long precioUnitario = Long.parseLong(datos[2].trim());
					String descripcionIngrediente = datos[3].trim();
					int inventario = Integer.parseInt(datos[4].trim());
					int minimo = Integer.parseInt(datos[5].trim());
					Ingredientes I = c.buscarIngrediente(codigo);

					if(I == null) {
						c.agregarIngredientes(codigo,nombre,precioUnitario,descripcionIngrediente,inventario,minimo);
						}
					else {
						c.agregarInventario(codigo, inventario);
					}
				}
				linea = br.readLine();
			}
			br.close();
			c.imprimir("                                        ");
			c.imprimir("Se agregaron los ingredientes de forma exitosa");
			c.imprimir("                                        ");
		}

		catch(Exception e){
			System.err.println("No se pudo");
		}
	}

	/**
	 * Método implementado para leer el archivo de texto relacionado con los platos
	 * @param ruta dirección del archivo
	 * @param c controlador
	 */
	public void leerPlatos(String ruta,Controlador c) {

		try {

			BufferedReader br = new BufferedReader(new FileReader(ruta));
			String linea = br.readLine();

			while(linea!=null) {

				if(linea.equals("#PLATO")) {

					linea = br.readLine();
					linea = br.readLine();
					String[]datos = linea.split("\\*");
					int codigo = Integer.parseInt(datos[0].trim());
					String nombre = datos[1].trim();
					String tipo = datos[2].trim();
					String dia = " ";
					
					if(tipo.equals("carta")) {
						dia = datos[3].trim();
					}

					Plato plat = c.buscarPlato(codigo);

					if(plat == null) {
						
						if(dia.equals(" ")) {
							
							c.agregarPlato(codigo, nombre);
						}
						
						else {
							
							c.agregarPlatoCarta(codigo, nombre, 0, dia);
						}
					}

					linea = br.readLine();
					linea = br.readLine();

					while(!linea.equals("0")) {
						String[] datosI = linea.split("  ");
						int codigoIngrediente = Integer.parseInt(datosI[0].trim());
						int cant = Integer.parseInt(datosI[1].trim());
						c.agregarIngredienteAPlato(codigo,codigoIngrediente,cant);
						linea = br.readLine();
					}
				}
				linea = br.readLine();
			}

			br.close();
			c.imprimir("                                         ");
			c.imprimir("Se agregaron los platos de forma exitosa" );
			c.imprimir("                                         ");
		}
		catch(Exception e) {
			System.err.println("No se pudo abrir el archivo");
		}
	}
}
