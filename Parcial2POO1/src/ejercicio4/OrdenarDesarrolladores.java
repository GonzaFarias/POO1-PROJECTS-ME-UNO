package ejercicio4;

import java.util.Comparator;

public class OrdenarDesarrolladores implements Comparator<Desarrollador> {

		@Override
		public int compare(Desarrollador o1, Desarrollador o2) {

			if (o1.getSueldo() > o2.getSueldo()) {
				return -1;
			} else if (o1.getSueldo() > o2.getSueldo()) {
				return 0;
			} else
				return 1;
		}

	}

