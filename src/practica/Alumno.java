package practica;

public class Alumno 
{
	String numControl;

    String nombre;

    String ap;

    String am;

    String grupo;

    String turno;

    String carrera;

	public Alumno(String numControl, String nombre, String ap, String am, String grupo, String turno, String carrera) 

	{

		this.numControl = numControl;

		this.nombre = nombre;

		this.ap = ap;

		this.am = am;

		this.grupo = grupo;

		this.turno = turno;

		this.carrera = carrera;

	}

	

	public Alumno() 

	{

		

	}



	public String getNumControl() 

	{

		return numControl;

	}



	public void setNumControl(String numControl) 

	{

		this.numControl = numControl;

	}



	public String getNombre()

	{

		return nombre;

	}



	public void setNombre(String nombre)

	{

		this.nombre = nombre;

	}



	public String getAp() {

		return ap;

	}



	public void setAp(String ap) {

		this.ap = ap;

	}



	public String getAm() {

		return am;

	}



	public void setAm(String am) {

		this.am = am;

	}



	public String getGrupo() {

		return grupo;

	}



	public void setGrupo(String grupo) {

		this.grupo = grupo;

	}



	public String getTurno() {

		return turno;

	}



	public void setTurno(String turno) {

		this.turno = turno;

	}



	public String getCarrera() {

		return carrera;

	}



	public void setCarrera(String carrera) {

		this.carrera = carrera;

	}

    

	

	public void ImprimirAlumno() 

	{

		System.out.println(numControl+"\t"+nombre+" "+ap+" "+am+"\t"+grupo+" "+carrera+" "+turno);

	}
}
