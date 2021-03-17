package modelo;

import java.util.List;

public interface Carnívoro
{
	public int darCantidadCarne();
	
	public boolean esCarroñero();
	
	public List<Animal> darListaPresas();
	
	public int darNumeroDientes();
}
