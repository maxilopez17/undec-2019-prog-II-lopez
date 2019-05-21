package dominio;


public class Ejercicio09 {
	
	public static int invertirNumero(int n) {
		int resto=0,invertido=0;
		while(n>0) {
			resto=n%10;
			n=n/10;
			invertido=invertido*10+resto;
			
		}
		return invertido;
			
	}
	
}
