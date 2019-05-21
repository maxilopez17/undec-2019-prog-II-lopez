package dominio;

public class Ejercicio02 {

	
	public static boolean esPrimo(int n) {
		int cont=0;
		for (int i = 1; i <= n; i++) {
			if(n%i==0)
				++cont;
		
		}
		return (cont==2);
		
	}
	
	public static int primosEntre(int limInf, int limSup) {
		int cont=0;
		for (int i = limInf; i <= limSup; i++) {
			if(esPrimo(i))
				++cont;
		}
		return cont;
	}
	
}
