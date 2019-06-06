package dominio;

import org.apiguardian.api.API;

public class Carrera {
	private String nombre;
	private String abreviatura;
	private String plan;
	private Materia[] listaMaterias =new Materia[50];
	private int cantMaterias=0;

	public Carrera(String nombre, String abreviatura, String plan) {
		this.nombre = nombre;
		this.abreviatura = abreviatura;
		this.plan = plan;
	}

	public Carrera() {
		this.nombre = "";
		this.abreviatura = "";
		this.plan = "";
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String getAbreviatura() {
		// TODO Auto-generated method stub
		return this.abreviatura;
	}

	public String getPlan() {
		// TODO Auto-generated method stub
		return this.plan;
	}

	public void setListaMaterias(Materia[] listaMaterias) {
		this.listaMaterias = listaMaterias;
	}

	public Materia[] getListaMaterias() {
		return listaMaterias;

	}

	public String getNombreEnMayusculas() {
		return nombre.toUpperCase();
	}

	public String getNombreTipoOracion() {

		return nombre.substring(0, 1).toUpperCase() + nombre.substring(1).toLowerCase();

	}

	public String getNombreCorto() {
		String[] frase = nombre.split(" ");
		for (int i = 0; i < frase.length; i++) {

		}
		if (nombre.length() > 5) {
			return nombre.substring(0, 5) + ".";
		}
		return "";
	}

	public boolean agregarMaterias(Materia materia) {
		// lenght es la longitud
		if (cantMaterias == 0) {
			listaMaterias[0] = materia;
			cantMaterias++;
			return true;
		} else {
			if (cantMaterias < 10) {
				for (int i = 0; i < cantMaterias; i++) {
					if (materia.equals(listaMaterias[i])) {
						return false;
					}
				}
				listaMaterias[cantMaterias + 1] = materia;
				cantMaterias++;
				return true;
			}

			
		}
		return false;

	}

}
