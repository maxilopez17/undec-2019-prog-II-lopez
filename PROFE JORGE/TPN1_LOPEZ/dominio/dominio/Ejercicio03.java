package dominio;

public class Ejercicio03 {
	
	public static boolean numeroPerfecto(int num) {
		int cont=0;
		for (int i = 1; i < num; i++) {
			if(num%i==0)
				cont+=i;
		
		}
		return (cont==num);
		
	}
}
