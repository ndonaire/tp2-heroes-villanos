import java.util.List;

public interface Personaje {
	public void mostrarNombreReal();
	public void mostrarNombrePersonaje();
	public void mostrarCaracteristicas();
	public boolean esGanador(Personaje competidor, Caracteristica caracteristica);
	public List<Personaje> Vencedores(Personaje competidor, Caracteristica caracteristica);
}
