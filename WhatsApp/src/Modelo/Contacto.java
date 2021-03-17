package Modelo;

public class Contacto {
	private long telefono;
	private String nombre;
	private String apellido;
	private String estado = "Hey there! I am using Whatsapp.";
	public Contacto(long tel, String nom, String ap)
	{
		telefono = tel;
		nombre = nom;
		apellido = ap;
	}
	
}
