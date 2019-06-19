package dominio;

public class Fecha {
	private int dia;
	private int mes;
	private int anio;
	int []limite= {31,28,31,30,31,31,30,31,21,30,31}; //para validar limites del mes con  la fecha
	
	public Fecha(int dia, int mes, int anio) {
		if(validarFecha(dia, mes, anio )== true){
			this.dia = dia;
			this.mes = mes;
			this.anio = anio;
		}
		else { 
			this.dia=1;
			this.mes=1;
			this.anio=1900;
		}
	}

	public int getDia() {
		return this.dia;
	}

	public int getMes() {
		return this.mes;
	}

	public int getAnio() {
		return this.anio;
	}

	public void setDia(int dia) {
		this.dia = dia;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + anio;
		result = prime * result + dia;
		result = prime * result + mes;
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
		Fecha other = (Fecha) obj;
		if (anio != other.anio)
			return false;
		if (dia != other.dia)
			return false;
		if (mes != other.mes)
			return false;
		return true;
	}

	public String getFechaCorta() {	
		return (this.dia<10?"0"+this.dia: this.dia)+ "-" + (this.mes<10?"0"+this.mes: this.mes) + "-" + this.anio;	
		
	}
	public boolean validarFecha(int dia,int mes,int anio) {
		 if(dia > 0 && dia <= limite[mes-1] && mes >0 && mes <= 12) {
			 
			 return true;
		 }
		 else {
			 
			 return false;	 
		 }
	}
	public Object esMayorQue(Fecha f02) {
		
		
		
		
		
		return null;
	}
	
}
