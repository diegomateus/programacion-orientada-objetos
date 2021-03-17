package Modelo;

import java.util.ArrayList;
import java.util.List;

public class Whatsapp {
private List <Usuario> usuarios = new ArrayList <Usuario>();
public void crearUsuario(Long numero,String nombre,String apellido)
{
	Usuario nuevo = new Usuario(numero,nombre,apellido);
	usuarios.add(nuevo);
}
public boolean VerificarUsuariosCreados()
{
	if(usuarios.size() == 0)
	{
		return false;
	}
	else
	{
		return true;
	}
}
}
