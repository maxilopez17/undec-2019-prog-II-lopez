package dominio;

public class Materia {
	private String nombre;
	private String abreviatura;
	private AnioAcademico anioacademico;
	
	
	public Materia(String Nombre, String Abreviatura, AnioAcademico Anio) {
		this.nombre=Nombre;
		this.abreviatura=Abreviatura;
		this.anioacademico=Anio;
	}
	
	public Materia() {
		this.nombre="";
		this.abreviatura="";
		
	}

	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	public String getAbreviatura() {
		// TODO Auto-generated method stub
		return this.abreviatura;
	}

	public AnioAcademico getAnioAcademico() {
		// TODO Auto-generated method stub
		return this.anioacademico;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Materia other = (Materia) obj;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
	
}
