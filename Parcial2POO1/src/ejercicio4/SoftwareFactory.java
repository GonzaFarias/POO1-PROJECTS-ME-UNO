package ejercicio4;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SoftwareFactory {

	private List<Desarrollador> a;

	public SoftwareFactory(List<Desarrollador> a) {

		this.a = a;
	}

	public List<Desarrollador> listarDesarrolladoresSegunSueldo() {

		Collections.sort(this.a, new OrdenarDesarrolladores());

		return this.a;

	}

	public void seleccionarSemiSenior() {

		List<Desarrollador> semiSeniores = new ArrayList<Desarrollador>();

		for (Desarrollador x : a) {
			if (x.getSr().equals(Seniority.SEMISENIOR)) {
				semiSeniores.add(x);
			}
		}

		this.a = semiSeniores;

	}

	public static void main(String[] args) throws IOException {
		
		Desarrollador a = new Desarrollador(1616,"Jorge",152.5, Seniority.JUNIOR);
		Desarrollador b = new Desarrollador(6516,"Gonzalo",456.5, Seniority.SEMISENIOR);
		Desarrollador cc = new Desarrollador(51616,"Lucas",564.5, Seniority.JUNIOR);
		Desarrollador d = new Desarrollador(4464,"Pablo",561.5, Seniority.SEMISENIOR);
		
		List<Desarrollador> des = new ArrayList<Desarrollador>();
		des.add(d);
		des.add(cc);
		des.add(b);
		des.add(a);
		
		SoftwareFactory s = new SoftwareFactory(des);
		
		s.listarDesarrolladoresSegunSueldo();
		s.seleccionarSemiSenior();
		System.out.println(s.listarDesarrolladoresSegunSueldo());
	
	}
}	
