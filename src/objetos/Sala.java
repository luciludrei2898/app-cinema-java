package objetos;

import java.util.Scanner;

public class Sala {

	Scanner sc = new Scanner(System.in);

	// VARIABLES

	private int idSala;
	private String[][] seats;
	private Pelicula movie;

	// VARIABLES

	int answerUserBuySeat;

	// CONSTRUCTOR

	public Sala(int idSala, int columna, int fila, Pelicula movie) {
		this.idSala = idSala;
		seats = new String[fila][columna];
		this.movie = movie;
	}
	

	// METODOS

	// GETTER Y SETTER

	public int getIdSala() {
		return idSala;
	}

	public void setIdSala(int idSala) {
		this.idSala = idSala;
	}

	public String[][] getSeats() {
		return seats;
	}

	public void setSeats(String[][] seats) {
		this.seats = seats;
	}

	public Pelicula getMovie() {
		return movie;
	}

	public void setMovie(Pelicula movie) {
		this.movie = movie;
	}

	// VER BUTACAS

	public void showSeats() {

	}

	// COMPRAR Y OCUPAR BUTACA

}
