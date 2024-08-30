package main;

import java.util.Scanner;

import objetos.Cine;
import objetos.Pelicula;
import objetos.Sala;

public class Main {

	public static void main(String[] args) {

		// OBJETO SCANNER

		Scanner sc = new Scanner(System.in);

		// CREAMOS OBJETO CINE

		Cine cineNassica = new Cine("Nassica", 250, 5);

		// CREAMOS OBJETO PELICULAS

		Pelicula pBarbie = new Pelicula("Barbie", 114);
		Pelicula pInterstellar = new Pelicula("Interstellar", 165);
		Pelicula pOppenheimer = new Pelicula("Oppenheimer", 180);
		Pelicula pHachiko = new Pelicula("Hachiko", 94);
		Pelicula pBichos = new Pelicula("Bichos: Una aventura en miniatura", 92);

		// CREAMOS OBJETO SALA

		Sala salaUno = new Sala(1, 5, 10, pBarbie);
		Sala salaDos = new Sala(1, 5, 10, pInterstellar);
		Sala salaTres = new Sala(1, 5, 10, pOppenheimer);
		Sala salaCuatro = new Sala(1, 5, 10, pHachiko);
		Sala salaCinco = new Sala(1, 5, 10, pBichos);

		// VARIABLES USUARIO

		int optionOperation;
		int optionSeeMovie;

		// MENU CINE

		do {

			// MENU OPERACION
			System.out.print("\n" + " === CINES CINESSA  ===" + "\n"
					+ "\n Seleccione a continuacion la operacion que desea realizar: \n" + "\n"
					+ " \n [1] VER CARTELERA. \n" + " \n [2] COMPRAR ENTRADAS. \n" + "\n [3] EXIT. \n" + " \n >>> ");

			optionOperation = sc.nextInt();

			// CONTROL DE ERRORES OPTIONOPERATION

			if (optionOperation == 1 || optionOperation == 2) {

				// OPCION VER ENTRADAS

				if (optionOperation == 1) {

					System.out.println(
							"\n" + " === CINES CINESSA ===" + "\n" + " \n TOP PELICULAS \n" + " ------------- ");
					System.out.println("\n [1] BARBIE. \n" + "\n [2] INTERSTELLAR. \n" + "\n [3] OPPENHEIMER. \n"
							+ "\n [4] HACHIKO. \n" + "\n [3] BICHOS. \n");
					System.out.print("\n Seleccione a continuacion la operacion que desea realizar. \n" + " >>> ");
					optionSeeMovie = sc.nextInt();

					switch (optionSeeMovie) {

					case 1:
						pBarbie.showMovie();
						break;

					case 2:
						pInterstellar.showMovie();
						break;

					case 3:
						pOppenheimer.showMovie();
						break;

					case 4:
						pHachiko.showMovie();
						break;

					case 5:
						pBichos.showMovie();
						break;

					default:
						System.out.println("INCORRECTO. Error de respuesta.");
					}

					// OPCION COMPRAR ENTRADAS

				} else if (optionOperation == 2) {

				}

			} else if (optionOperation < 1 || optionOperation > 3) {
				System.out.println("\n" + "Error de respuesta. Introduzca de nuevo la opcion a realizar.");
			}

		} while (optionOperation != 3);
		{

			System.out
					.println("\n" + " \n === HASTA PRONTO ===" + "\n" + " \n Muchas gracias por confiar en ADESLAS. ");

		}

	}

}
