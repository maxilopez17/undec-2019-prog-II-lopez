package dominio;

public class Precio {
	private double valor;
	private Fecha fechaDesde;
	private Fecha fechaHasta;
	
	public Precio(double valor, Fecha fechaDesde, Fecha fechaHasta) {
		
		this.valor = valor;
		this.fechaDesde = fechaDesde;
		this.fechaHasta = fechaHasta;
	}

	public double getValor() {
		return valor;
	}

	public Fecha getFechaDesde() {
		return fechaDesde;
	}

	public Fecha getFechaHasta() {
		return fechaHasta;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public void setFechaDesde(Fecha fechaDesde) {
		this.fechaDesde = fechaDesde;
	}

	public void setFechaHasta(Fecha fechaHasta) {
		this.fechaHasta = fechaHasta;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaDesde == null) ? 0 : fechaDesde.hashCode());
		result = prime * result + ((fechaHasta == null) ? 0 : fechaHasta.hashCode());
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
		Precio other = (Precio) obj;
		if (fechaDesde == null) {
			if (other.fechaDesde != null)
				return false;
		} else if (!fechaDesde.equals(other.fechaDesde))
			return false;
		if (fechaHasta == null) {
			if (other.fechaHasta != null)
				return false;
		} else if (!fechaHasta.equals(other.fechaHasta))
			return false;
		return true;
	}
	//Lpad(string llamado cadena, int largo,string caracter)}
	//para agregar 0 a las fechas 
	
	
	
}
