package practica;
import java.util.*;

import java.util.Scanner;
public class Main
{
	public static void main(String[] cecyto) {

		Scanner in = new Scanner(System.in);



		ArrayList<Alumno> listaAlumno = new ArrayList<Alumno>();



		int opcion = 0;



		do {

			System.out.println("1.-Agregar Alumno ");

			System.out.println("2.-Ver Alumnos ");

			System.out.println("3.-Salir ");



			System.out.print("Elige Opcion ");

			opcion = in.nextInt();



			switch (opcion) {

			case 1:

				in.nextLine();



				Alumno x = new Alumno();



				System.out.println("Numero de control");

				x.setNumControl(in.nextLine());



				System.out.println("Nombre");

				x.setNombre(in.nextLine());



				System.out.println("Apellido paterno");

				x.setAp(in.nextLine());



				System.out.println("Apellido materno");

				x.setAm(in.nextLine());



				System.out.println("Grupo");

				x.setGrupo(in.nextLine());



				System.out.println("Carrera");

				x.setCarrera(in.nextLine());



				System.out.println("Turno");

				x.setTurno(in.nextLine());



				listaAlumno.add(x);



				break;



			case 2:



				System.out.println("NUMCON\tNOMBRE\t\t\tGRUPO\tCARRERA\tTURNO");



				for (Alumno a : listaAlumno) {

					a.ImprimirAlumno();

				}

				break;



			case 3:



				System.out.println("ADIOS");



			default:



				System.out.println("ERROR");

				break;

			}

		} while (opcion != 3);



	}

}
