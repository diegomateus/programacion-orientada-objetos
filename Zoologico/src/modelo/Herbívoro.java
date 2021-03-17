package modelo;

import java.util.List;

public interface Herbívoro 
{
	public String darPlantaFavorita();
	
	public boolean esRumiante();
	
	public List<Animal> darDepredadores();
}
