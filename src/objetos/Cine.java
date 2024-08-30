package objetos;

public class Cine {

	// ATRIBUTOS

	private String nameCinema;
	private int capacity;
	private Sala[] salas;

	// CONSTRUCTOR

	public Cine(String nameCinema, int capacity, int numsalas) {
		this.nameCinema = nameCinema;
		this.capacity = capacity;
		salas = new Sala[numsalas];
	}

	// METODOS

	// GETTER & SETTER

	public String getNameCinema() {
		return nameCinema;
	}

	public void setNameCinema(String nameCinema) {
		this.nameCinema = nameCinema;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public Sala[] getSalas() {
		return salas;
	}

	public void setSalas(Sala[] salas) {
		this.salas = salas;
	}

}
