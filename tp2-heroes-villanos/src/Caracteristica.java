
public class Caracteristica {
	private int velocidad;
	private int fuerza;
	private int resistencia;
	private int destreza;

	public Caracteristica(int velocidad, int fuerza, int resistencia, int destreza) {
		super();
		this.velocidad = velocidad;
		this.fuerza = fuerza;
		this.resistencia = resistencia;
		this.destreza = destreza;
	}

	public void mostrarCaracteristica(){
		System.out.println("Velocidad: " + velocidad);
		System.out.println("Fuerza: " + fuerza);
		System.out.println("Resistencia: " + resistencia);
		System.out.println("Destreza: " + destreza);
	}

}
