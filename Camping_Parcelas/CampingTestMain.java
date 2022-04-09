package Camping_Parcelas;

public class CampingTestMain {

	public static void main(String[] args) {
		Camping a = new Camping(5);
		a.ocuparParcelaCon(0, 1);
		a.ocuparParcelaCon(5, 2);
		a.ocuparParcelaCon(4, 2);
		a.ocuparParcelaCon(2, 1);
		a.ocuparParcelaCon(3, 3);
		a.ocuparParcelaCon(0, 2);
		System.out.println("Personas totales: " + a.devolverPersonas());
		System.out.println("Parcelas con mayores indicados: " + a.contarParcelasCon(4));
		int[] arrayParcelasConI = new int[13];
		arrayParcelasConI = a.parcelasConI_Personas();
		System.out.println("-----------------------------------------");
		System.out.println("Array parcelas con personas igual al indice :");
		for (int i = 0; i < arrayParcelasConI.length; i++) {
			System.out.println(i + " = " + arrayParcelasConI[i]);
		}
	}
}
