package ejercicio2;

public class Punto {

	private double X,Y;

	Punto(double X, double Y) {
		this.X = X;
		this.Y =Y;
	}
	
	
	public double EjeX() {
		return X;
	}
	
	public double EjeY() {
		return Y;
	}

	public void CambiarX(double NuevaX) {
		X=NuevaX;
	}
	public void CambiarY(double NuevaY) {
		Y=NuevaY;
	}
	
	public boolean SobreX() {
		return X == 0;
	}
	
	public boolean SobreY() {
		return Y == 0;
	}

	public boolean OrigenCoordenada() {

		return (X==0 && Y==0);

	}
	public double distancia (Punto otroPunto){

		return Math.sqrt((Math.pow(this.X-otroPunto.X,2)+Math.pow(this.Y-otroPunto.Y,2)));
	}
	
	public static void main(String[] args) {

		Punto num = new Punto(1,1);

		System.out.println(num.EjeX());
		System.out.println(num.EjeY());
		num.CambiarX(0);
		System.out.println(num.EjeX());
		System.out.println(num.SobreX());
		System.out.println(num.SobreY());
		num.CambiarY(0);
		System.out.println(num.OrigenCoordenada());
	}

}
