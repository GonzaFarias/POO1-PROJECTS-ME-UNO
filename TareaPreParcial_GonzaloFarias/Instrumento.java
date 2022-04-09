package TareaPreparcial;

public abstract class Instrumento implements Identificable{

	String nombre;
	double precio;
	boolean esMetalico;
	
	Instrumento(String nombre, double precio, boolean esMetalico){
		this.esMetalico=esMetalico;
		this.nombre=nombre;
		this.precio=precio;
	}
	
	public String queInstrumentoEres() {
		return "Instrumento [Nombre=" +nombre+
			", Precio = $"+precio+",Es metalico= "+esMetalico+"]";
	}
	
	public abstract void afinar();
	
	public static void main(String[] args) {
		
		Instrumento a1 = new Viento("Flauta",1500,false);
		Instrumento a2 = new Percusion("Campana",2000,true);
		Instrumento a3 = new Cuerda("Guitarra",20000,false);
		Instrumento a4 = new Cuerda("Violin",1500,false);
		Instrumento a5 = new Viento("Trompeta",8000,true);
		Instrumento a6 = new Percusion("Triangulo",800,true);
		Instrumento a7 = new Cuerda("Bajo",5000,false);
		Instrumento a8 = new Viento("Saxofon",7000,true);
		Instrumento a9 = new Viento("Trompa",6500,true);
		Instrumento a10 = new Percusion("Xilofono",1000,true);

		Instrumento[] Orquesta = {a1,a2,a3,a4,a5,a6,a7,a8,a9,a10};
		
		for(Instrumento x: Orquesta) {
			System.out.println(x.queInstrumentoEres());
			x.afinar();
			System.out.println("-------------------------------------------------------------------");
		}
		

		
		
	}
}
