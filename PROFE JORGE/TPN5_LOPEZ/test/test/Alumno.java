package test;

import dominio.Carrera;

public class Alumno {
	private String nombre;
	private String apellido;
	private String dni;
	private String matricula;
	private Carrera carrera;
	
	public Alumno(String nombre, String apellido, String dni, Carrera carrera, String matricula) {
		
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.matricula = matricula;
		this.carrera = carrera;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public String getDni() {
		return dni;
	}

	public String getMatricula() {
		return matricula;
	}

	public Carrera getCarrera() {
		return carrera;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public void setCarrera(Carrera carrera) {
		this.carrera = carrera;
	}
	
	
	
	
	
	
	
}
