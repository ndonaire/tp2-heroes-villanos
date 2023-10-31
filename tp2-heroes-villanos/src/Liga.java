import java.util.ArrayList;
import java.util.List;

public class Liga implements Personaje{
	private String nombre;
	private List<Personaje> competidores;
	
	
	public Liga(String nombre) {
		super();
		this.nombre = nombre;
		this.competidores = new ArrayList<>();
	}
	
	public boolean agregarCompetidor(Personaje competidor){
		//Faltan validaciones
		this.competidores.add(competidor);
		return true;
	}
	
	public boolean eliminarCompetidor(Personaje competidor){
		//Faltan validaciones
		this.competidores.remove(competidor);
		return true;
	}

	@Override
	public void mostrarNombreReal() {
		System.out.println("Nombre Liga:" + this.nombre);
		for(Personaje competidor: this.competidores) {
			competidor.mostrarNombreReal();
		}
		
	}

	@Override
	public void mostrarNombrePersonaje() {
		System.out.println("Nombre Liga:" + this.nombre);
		for(Personaje competidor: this.competidores) {
			competidor.mostrarNombrePersonaje();
		}
	}

	@Override
	public void mostrarCaracteristicas() {
		//Deberia calcular el promedio de cada caracteristica
		System.out.println("Nombre Liga:" + this.nombre);
		for(Personaje competidor: this.competidores) {
			competidor.mostrarCaracteristicas();
		}
		
	}

	@Override
	public boolean esGanador(Personaje competidor, Caracteristica caracteristica) {
		// Comparar con otro competidor / Liga y determinar quien gana
		return false;
	}

	@Override
	public List<Personaje> Vencedores(Personaje competidor, Caracteristica caracteristica) {
		//Devolver lista de todos los personajes / ligas que vencen al personaje
		return null;
	}

}
