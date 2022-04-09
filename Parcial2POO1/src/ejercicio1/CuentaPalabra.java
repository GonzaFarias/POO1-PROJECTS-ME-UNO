package ejercicio1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CuentaPalabra {

	public CuentaPalabra() {

	}

	public void cuentaPalabras(String archivoEntrada, String archivoSalida, String[] palabras) throws IOException {

		Scanner sc = new Scanner(new File(archivoEntrada));
		int contVim = 0;
		int contUnix = 0;
		int contEditor = 0;
		int contModo = 0;
		int contOrdenes = 0;
		String lista = "";
		while (sc.hasNext()) {

			lista += " " + sc.nextLine();
		}
		sc.close();

		lista = lista.replace("(", "");
		lista = lista.replace(")", "");
		lista = lista.replace(".", "");
		lista = lista.replace(",", "");
	
		String[] arrTexto;
		arrTexto = lista.split(" ");
		for (int z = 0; z < arrTexto.length; z++) {
			if (palabras[0].equalsIgnoreCase(arrTexto[z])) {
				contVim++;
			} else if (palabras[1].equalsIgnoreCase(arrTexto[z])) {
				contUnix++;
			} else if (palabras[2].equalsIgnoreCase(arrTexto[z])) {
				contEditor++;
			} else if (palabras[3].equalsIgnoreCase(arrTexto[z])) {
				contModo++;
			} else if (palabras[4].equalsIgnoreCase(arrTexto[z])) {
				contOrdenes++;
			}
		}

		FileWriter arch = new FileWriter(new File(archivoSalida));
		PrintWriter salida = new PrintWriter(arch);

		salida.println("Cantidad de veces que aparece cada palabra: ");
		salida.println("vim: " + contVim);
		salida.println("unix: " + contUnix);
		salida.println("editor: " + contEditor);
		salida.println("modo: " + contModo);
		salida.println("�rdenes: " + contOrdenes);

		salida.close();
	}

	public String[] obtenerArregloDePalabras() {
		// modificarlo si fuera necesario para hacer más y mejores pruebas
		String[] s = { "vim", "unix", "editor", "modo", "órdenes" };

		return s;
	}

	public static void main(String[] args) throws IOException {
		CuentaPalabra contador = new CuentaPalabra();
		contador.cuentaPalabras("src/archivosParcial/archivoDeEntrada.in", "src/archivosParcial/archivoDeSalida.out", contador.obtenerArregloDePalabras());
	}

}