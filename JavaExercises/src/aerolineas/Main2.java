package aerolineas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creamos los arraylist principales de todas las entidades
		ArrayList<Comandante> comandantes = new ArrayList<Comandante>();
		ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();
		ArrayList<Avion> aviones = new ArrayList<Avion>();
		ArrayList<Aeropuerto> aeropuertos = new ArrayList<Aeropuerto>();
		ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();

		// Rellenamos los arraylist con datos.
		rellenarComandantes(comandantes);
		rellenarAviones(aviones);
		rellenarPasajeros(pasajeros);
		rellenarAeropuertos(aeropuertos);
		Main2.ordenarAvionesMatricula(aviones);
		for (int i = 0; i < aviones.size(); i++) {
			System.out.println(aviones.get(i).getMatricula());
		}
	}

	public static ArrayList<Pasajero> quitarApellidoyDNIPasajeros(ArrayList<Pasajero> pasajeros, char letra,
			String apellido) {
		for (int i = 0; i < pasajeros.size(); i++) {
			if (pasajeros.get(i).getDni().charAt(pasajeros.get(i).getDni().length() - 1) == letra) {
				pasajeros.remove(i);
			}
			if (pasajeros.get(i).getApellidos().toLowerCase().contains(apellido.toLowerCase())) {
				pasajeros.remove(i);
			}
		}
		return pasajeros;
	}

	public static ArrayList<Avion> avionesSinDuplicados(ArrayList<Avion> aviones) {
		for (int i = 0; i < aviones.size(); i++) {
			for (int j = 0; j < aviones.size(); j++) {
				if (aviones.get(i).getMatricula().equalsIgnoreCase(aviones.get(j).getMatricula())) {
					aviones.remove(i);
				}
			}
		}
		return aviones;
	}

	public static Aeropuerto añadirAvionesAeropuerto(Avion[] avion1, Avion[] avion2, Avion[] avion3,
			Aeropuerto aeropuerto) {
		ArrayList<Avion> avionesinsertar = new ArrayList<Avion>();
		ArrayList<Avion> avion1List = new ArrayList<Avion>(Arrays.asList(avion1));
		ArrayList<Avion> avion2List = new ArrayList<Avion>(Arrays.asList(avion2));
		ArrayList<Avion> avion3List = new ArrayList<Avion>(Arrays.asList(avion3));
		ArrayList<Avion> sumaviones = new ArrayList<Avion>();
		sumaviones.addAll(avion1List);
		sumaviones.addAll(avion2List);
		sumaviones.addAll(avion3List);
		aeropuerto.setAviones(sumaviones);
		return aeropuerto;
	}

	public static ArrayList<Avion> añadirAvionesComprobando(ArrayList<Avion> aviones, Avion[] avionesañadir) {
		Boolean repetido = false;
		for (int i = 0; i < avionesañadir.length; i++) {
			for (int j = 0; j < aviones.size(); j++) {
				if (avionesañadir[j].getMatricula().equalsIgnoreCase(aviones.get(j).getMatricula())) {
					repetido = true;
				}
			}
			if (!repetido) {
				aviones.add(avionesañadir[i]);
			}
			repetido = false;
		}
		return aviones;
	}

	public static ArrayList<Avion> añadirAviones(ArrayList<Avion> aviones, Avion[] avionesañadir) {
		for (int i = 0; i < avionesañadir.length; i++) {
			aviones.add(avionesañadir[i]);
		}
		return aviones;
	}

	public static ArrayList<Pasajero> ordenarPasajeros(ArrayList<Pasajero> pasajeros, int orden) {
		if (orden == 1) {
			Collections.sort(pasajeros, new Comparator<Pasajero>() {
				public int compare(Pasajero pasajero1, Pasajero pasajero2) {
					return pasajero1.getNombre().compareTo(pasajero2.getNombre());
				}
			});
		}
		if (orden == 2) {
			Collections.sort(pasajeros, new Comparator<Pasajero>() {
				public int compare(Pasajero pasajero1, Pasajero pasajero2) {
					return pasajero1.getApellidos().compareTo(pasajero2.getApellidos());
				}
			});
		}
		if (orden == 3) {
			Collections.sort(pasajeros, new Comparator<Pasajero>() {
				public int compare(Pasajero pasajero1, Pasajero pasajero2) {
					return new Integer(pasajero1.getTelefono()).compareTo(new Integer(pasajero2.getTelefono()));
				}
			});
		}
		if (orden == 4) {
			Collections.sort(pasajeros, new Comparator<Pasajero>() {
				public int compare(Pasajero pasajero1, Pasajero pasajero2) {
					return pasajero1.getDni().compareTo(pasajero2.getDni());
				}
			});
		}
		if (orden == 5) {
			Collections.sort(pasajeros, new Comparator<Pasajero>() {
				public int compare(Pasajero pasajero1, Pasajero pasajero2) {
					return new Integer(pasajero1.getEdad()).compareTo(new Integer(pasajero2.getEdad()));
				}
			});
		}

		return pasajeros;
	}

	public static void eliminarComandantes(ArrayList<Comandante> comandantes, Comandante[] comandante1,
			Comandante[] comandante2, Comandante[] comandante3, Comandante[] comandante4) {
		for (int i = 0; i < comandantes.size(); i++) {
			for (int j = 0; j < comandante1.length; j++) {
				if (comandantes.get(i).getDni().equalsIgnoreCase(comandante1[j].getDni())) {
					comandantes.remove(i);
				}
			}
			for (int j = 0; j < comandante2.length; j++) {
				if (comandantes.get(i).getDni().equalsIgnoreCase(comandante2[j].getDni())) {
					comandantes.remove(i);
				}
			}
			for (int j = 0; j < comandante3.length; j++) {
				if (comandantes.get(i).getDni().equalsIgnoreCase(comandante3[j].getDni())) {
					comandantes.remove(i);
				}
			}
			for (int j = 0; j < comandante3.length; j++) {
				if (comandantes.get(i).getDni().equalsIgnoreCase(comandante3[j].getDni())) {
					comandantes.remove(i);
				}
			}
		}
	}

	public static void añadirTresArrayListAeropuerto(ArrayList<Aeropuerto> aeropuertos,
			ArrayList<Aeropuerto> aeropuertos1, ArrayList<Aeropuerto> aeropuertos2,
			ArrayList<Aeropuerto> aeropuertos3) {
		ArrayList<Aeropuerto> suma = new ArrayList<Aeropuerto>();
		suma.addAll(aeropuertos1);
		suma.addAll(aeropuertos2);
		suma.addAll(aeropuertos3);
	}

	public static void añadirAvion(ArrayList<Avion> aviones, String modelo, int pasajeros, String matricula,
			double capacidad_deposito, int año, String comandante) {
		aviones.add(new Avion(modelo, pasajeros, matricula, capacidad_deposito, año, comandante));
	}

	public static ArrayList<Avion> ordenarAvionesMatricula(ArrayList<Avion> aviones) {
		Collections.sort(aviones, new Comparator<Avion>() {
			public int compare(Avion avion1, Avion avion2) {
				return avion1.getMatricula().compareTo(avion2.getMatricula());
			}
		});
		return aviones;
	}

	public static void rellenarComandantes(ArrayList<Comandante> comandantes) {
		comandantes.add(new Comandante("Eric", "Moody", 667448798, "09844578P", 40, 2));
		comandantes.add(new Comandante("Richard", "Champion", 665123325, "09877458K", 54, 2));
		comandantes.add(new Comandante("Malcolm", "Waters", 667448798, "97745589Y", 35, 3));
		comandantes.add(new Comandante("John", "Coward", 745112145, "09312345R", 61, 4));
		comandantes.add(new Comandante("Chesley", "Sully", 666978847, "01255478H", 29, 5));
		comandantes.add(new Comandante("Bryce ", "McCormick ", 666123456, "12566987D", 44, 8));
		comandantes.add(new Comandante("Bob", "Pearson ", 621332263, "36899746J", 49, 1));
		comandantes.add(new Comandante("Robert", "Schornstheimer", 611147898, "12144987C", 52, 10));
	}

	public static void rellenarPasajeros(ArrayList<Pasajero> pasajeros) {
		pasajeros.add(new Pasajero("Pablo", "Costa", 667448798, "09844578P", (byte) 18));
		pasajeros.add(new Pasajero("Bruno", "Cort�s", 665123325, "09877458K", (byte) 19));
		pasajeros.add(new Pasajero("Ivan", "Jimenez", 667448798, "97745589Y", (byte) 20));
		pasajeros.add(new Pasajero("David", "Hinojosa", 745112145, "09312345R", (byte) 21));
		pasajeros.add(new Pasajero("Bladimir", "Vargas", 666978847, "01255478H", (byte) 21));
		pasajeros.add(new Pasajero("Manuel", "Barriopedro ", 666123456, "12566987D", (byte) 28));
		pasajeros.add(new Pasajero("Arturo", "Fernandez ", 621332263, "36899746J", (byte) 21));
		pasajeros.add(new Pasajero("Eduardo", "Limia", 611147898, "12144987C", (byte) 23));
		pasajeros.add(new Pasajero("Dimitro", "Abayduyin", 667448798, "09844578P", (byte) 40));
		pasajeros.add(new Pasajero("Adrian", "Gonzalez", 665123325, "09877458K", (byte) 23));
		pasajeros.add(new Pasajero("Alejandro", "Torres", 667448798, "97745589Y", (byte) 29));
		pasajeros.add(new Pasajero("Sergio", "Alvarez", 745112145, "09312345R", (byte) 21));
		pasajeros.add(new Pasajero("Natividad", "Martinez", 666978847, "01255478H", (byte) 16));
		pasajeros.add(new Pasajero("Antonio", "Andrino ", 666123456, "12566987D", (byte) 19));
		pasajeros.add(new Pasajero("Alejandro", "Lopez ", 621332263, "36899746J", (byte) 27));
		pasajeros.add(new Pasajero("Jaime", "Casanueva", 611147898, "12144987C", (byte) 20));
		pasajeros.add(new Pasajero("Alejandro", "SAnchez", 611147898, "12144987C", (byte) 19));
		pasajeros.add(new Pasajero("Javier", "Hurtado", 667448798, "09844578P", (byte) 40));
		pasajeros.add(new Pasajero("Naggy", "Siddeg", 665123325, "09877458K", (byte) 20));
		pasajeros.add(new Pasajero("Pablo", "Diez", 667448798, "97745589Y", (byte) 21));
		pasajeros.add(new Pasajero("Gregorio", "Eyi Ipico", 745112145, "09312345R", (byte) 19));
		pasajeros.add(new Pasajero("Paloma", "Lopez", 666978847, "01255478H", (byte) 23));
		pasajeros.add(new Pasajero("Ian", "Lopez ", 666123456, "12566987D", (byte) 22));
		pasajeros.add(new Pasajero("Kim", "Seungeun ", 621332263, "36899746J", (byte) 19));

	}

	public static void rellenarAviones(ArrayList<Avion> aviones) {
		aviones.add(new Avion("Boing 737", 200, "119811", 100, 2011, "Javi"));
		aviones.add(new Avion("Boing 747", 250, "119866", 100, 2010, "Javi"));
		aviones.add(new Avion("Boing 727", 250, "119865", 100, 2008, "Javi"));
		aviones.add(new Avion("Boing 747", 250, "119834", 100, 2010, "Javi"));
		aviones.add(new Avion("Boing 777", 200, "119863", 100, 2017, "Javi"));
		aviones.add(new Avion("Boing 767", 300, "119892", 100, 2016, "Javi"));
		aviones.add(new Avion("Boing 757", 400, "119861", 100, 2015, "Javi"));
	}

	public static void rellenarAeropuertos(ArrayList<Aeropuerto> aeropuertos) {
		aeropuertos.add(new Aeropuerto("Adolfo Suarez", "Madrid", 1));
		aeropuertos.add(new Aeropuerto("El Prat", "Barcelona", 2));
		aeropuertos.add(new Aeropuerto("JFK", "New York", 3));
		aeropuertos.add(new Aeropuerto("Reino de Le�n", "Le�n", 4));
		aeropuertos.add(new Aeropuerto("Pisuerga", "Valladolid", 5));
		aeropuertos.add(new Aeropuerto("Cid Campeador", "Burgos", 6));
		aeropuertos.add(new Aeropuerto("AirCochinillo", "Segovia", 7));
		aeropuertos.add(new Aeropuerto("Matacan", "Salamanca", 8));
	}

}
