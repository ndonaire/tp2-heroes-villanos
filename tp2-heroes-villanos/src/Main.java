//ESTE MAIN LO USE PARA PROBAR ALGUNAS COSAS, NO USAR COMO MAIN REAL XD
public class Main {

	public static void main(String[] args) {
		Caracteristica carac1 = new Caracteristica(50,50,50,50);
		Heroe heroe1 = new Heroe("Tony Stark","Iron Man",carac1);
		
		Caracteristica carac2 = new Caracteristica(10,10,10,10);
		Heroe heroe2 = new Heroe("Steve Rogers","Capitan America",carac2);
		
		Caracteristica carac3 = new Caracteristica(40,40,40,40);
		Heroe heroe3 = new Heroe("Homero Simpson","Hombre Pie",carac3);
		
		Liga liga1 = new Liga("Avengers");
		
		liga1.agregarCompetidor(heroe1);
		liga1.agregarCompetidor(heroe2);
		liga1.agregarCompetidor(heroe3);
		
		liga1.mostrarNombreReal();
		liga1.mostrarNombrePersonaje();
		liga1.mostrarCaracteristicas();
		

	}

}
