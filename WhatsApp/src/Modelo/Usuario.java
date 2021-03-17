package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
private long telefono;
private String nombre;
private String apellido;
private String estado = "Hey there! I am using Whatsapp.";
private List <Chat> chats = new ArrayList <Chat>();
public Usuario(long tel,String n, String ap)
{
	telefono = tel;
	nombre = n;
	apellido = ap;
}
public long getTelefono() {
	return telefono;
}
public void setTelefono(long telefono) {
	this.telefono = telefono;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getApellido() {
	return apellido;
}
public void setApellido(String apellido) {
	this.apellido = apellido;
}
public String getEstado() {
	return estado;
}
public void setEstado(String estado) {
	this.estado = estado;
}
}