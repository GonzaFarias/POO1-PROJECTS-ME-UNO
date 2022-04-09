package Camping_Parcelas;

import java.util.ArrayList;

public class Camping {
	private int max;
	ArrayList<Parcela> parcela;

	public Camping(int max) {
		parcela = new ArrayList<Parcela>();
		this.max = max;
	}

	public void ocuparParcelaCon(int mayores, int menores) {
		if (mayores + menores <= 12) {
			if (parcela.size() <= max - 1) {
				Parcela personas = new Parcela(mayores, menores);
				parcela.add(personas);
			} else {
				System.out.println("El ArrayList ya esta completo (max:" + max + ")");
			}
		} else
			throw new Error("Limite de personas superado");
	}

	public int devolverPersonas() {
		int total = 0;
		for (Parcela x : parcela) {
			total += x.getMayores() + x.getMenores();
		}
		return total;
	}

	public int contarParcelasCon(int mayores) {
		int cont = 0;
		for (Parcela x : parcela) {
			if (x.getMayores() == mayores) {
				cont++;
			}
		}
		return cont;
	}

	public int[] parcelasConI_Personas() {
		int[] array = new int[13];
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			for (int x = 0; x < parcela.size(); x++) {
				if (parcela.get(x).getMayores() + parcela.get(x).getMenores() == i) {
					cont++;
				}
			}
			array[i] = cont;
			cont = 0;
		}
		return array;
	}
}
