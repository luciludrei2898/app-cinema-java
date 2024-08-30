package objetos;

public class Pelicula {

	// ATRIBUTOS

	private String name;
	private int time;
	private String descripcion;

	// CONSTRUCTOR

	// LLENO

	public Pelicula(String name, int time, String descripcion) {
		this.name = name;
		this.time = time;
		this.descripcion = descripcion;
	}


	// METODOS
	// GETTER Y SETTER

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	// VER DATOS DE LA PELICULA

	public void showMovie() {

		System.out.println("\n === CINES CINESSA === ");
		System.out.println("\n Nombre de la pelicula: " + name + ".");
		System.out.println(" Duracion: " + time + " minutos.");

	}

}
