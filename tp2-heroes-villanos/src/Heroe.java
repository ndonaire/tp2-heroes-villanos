import java.util.List;

public class Heroe implements Personaje {
	private String nombreReal;
	private String nombrePersonaje;
	private Caracteristica caracteristicas;
	
	public Heroe(String nombreReal, String nombrePersonaje, Caracteristica caracteristicas) {
		super();
		this.nombreReal = nombreReal;
		this.nombrePersonaje = nombrePersonaje;
		this.caracteristicas = caracteristicas;
	}

	@Override
	public void mostrarNombreReal() {
		System.out.println("Nombre real: "+ this.nombreReal);
	}

	@Override
	public void mostrarNombrePersonaje() {
		System.out.println("Nombre héroe: "+ this.nombrePersonaje);	
	}

	@Override
	public void mostrarCaracteristicas() {
		System.out.println("Caracteristicas de:" + this.nombrePersonaje);
		this.caracteristicas.mostrarCaracteristica();		
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
