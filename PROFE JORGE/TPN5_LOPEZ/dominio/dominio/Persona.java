package dominio;

public class Persona {
	private String nombre;
	private String apellido;
	
	
	public Persona() {
		this.nombre="";
		this.apellido="";
	}
	
	public String getNombre(){
		return this.nombre;
	}
	
	public String getApellido() {
		return this.apellido;
	}

	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}

	public void setApellido(String apellido) {
		this.apellido=apellido;
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido == null) ? 0 : apellido.hashCode());
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
		Persona other = (Persona) obj;
		if (apellido == null) {
			if (other.apellido != null)
				return false;
		} else if (!apellido.equals(other.apellido))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}

	
	
	
	
	
	
	
}
