package test;

import dominio.Materia;

public class Implementacion {
	private String anioDictado;
	private String fechaInicio;
	private String fechaFin;
	private Materia materia;
	private Alumno[] listaAlumnos;
	
	public Implementacion(Materia materia,String anioDictado, String fechaInicio, String fechaFin) {
		this.materia= materia;
		this.anioDictado = anioDictado;
		this.fechaInicio = fechaInicio;
		this.fechaFin = fechaFin;
	}

	public Materia getMateria() {
		return materia;
	}

	public String getAnioDictado() {
		return anioDictado;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public Alumno[] getListaAlumnos() {
		return listaAlumnos;
	}

	public void setAnioDictado(String anioDictado) {
		this.anioDictado = anioDictado;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public void setListaAlumnos(Alumno[] listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Object agregarAlumnos(Alumno alumno) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	
	
	
	
	

}
