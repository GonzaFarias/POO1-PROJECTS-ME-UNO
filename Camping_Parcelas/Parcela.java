package Camping_Parcelas;

public class Parcela {

	private int menores;
	private int mayores;

	public Parcela(int mayores, int menores) {
		this.mayores = mayores;
		this.menores = menores;
	}

	public int getMenores() {
		return menores;
	}

	public int getMayores() {
		return mayores;
	}
}
