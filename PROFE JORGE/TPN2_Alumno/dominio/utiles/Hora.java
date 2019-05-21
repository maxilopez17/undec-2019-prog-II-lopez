package utiles;

public class Hora {

	private int hora;
	private int minuto;
	private int segundo;
	//////// 1 test constructor
	public Hora(int hora,int minuto,int segundo) {
		if(hora<=24 && hora > 0) // test 8,9
			this.hora=hora;
		else
			this.hora=0;
		
		if(minuto<=59 && minuto >0) // test 10,11
			this.minuto=minuto;
		else
			this.minuto=0;
		if(segundo<=59 && segundo >0) // test 12,13
			this.segundo=segundo;
		else
			this.segundo=0;
	}
	public int getHora() {
		return this.hora;
	}
	
	public int getMinuto() {
		return this.minuto;
	}
	public int getSegundo() {
		return this.segundo;
	}
	////////////// 2 test constructor
	public Hora() {
		this.hora=0;
		this.minuto=0;
		this.segundo=0;
	}
	
	///////// 3 test constructor 4 juntos
	public String getHoraConFormato() {
		
		return Utiles.LPAD(this.hora, 2)+":"+Utiles.LPAD(this.minuto, 2)+":"+Utiles.LPAD(this.segundo, 2);
	}
	
	//////// 5 test
	
	public void setHora(int hora) {
		this.hora=hora;
		
	}
	//////// 6 test
	public void setMinuto(int minuto) {
		this.minuto=minuto;
	}
	// 7 test
	public void setSegundo(int segundo) {
		this.segundo=segundo;
	}
	// 14,15 test
	public void addHora(int hora) {
		int suma=hora+getHora();
		if(suma>24)
			setHora(suma-24);
		else {
			if(suma<0)
				setHora(suma+24);
			else
				setHora(suma);	
		}
	}
	// 16 test
	public void addMinuto(int minuto) {
		int suma=minuto+getMinuto();
		if(suma>59) {
			setMinuto(suma-60);
		//	setHora(getHora()+suma/60);
			addHora(suma/60);
		}
		else {
			if(suma<0) { // test 23
				setMinuto(suma+60);
				addHora(-1);
			}
			else
				setMinuto(suma);
				
		}
	}
	// 18,19,20
	public void addSegundo(int segundo) {
		int suma=segundo+getSegundo();
		if(suma>59) {
			setSegundo(suma-60);
			addMinuto(suma/60);
		}
		else
			setSegundo(suma);
		
	}
	// 23
	
	
	
	
	
	
	
	
}
