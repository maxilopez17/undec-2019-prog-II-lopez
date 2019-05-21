package dominio;

//Considere siguiente proceso repetitivo para un número entero dado: 
//	si el número es 1, el proceso termina. 
//	De lo contrario, si es par se divide entre 2, 
//	y si es impar se multiplica por 3 y se le suma 1. 
//Si empezamos con 6, por ejemplo, obtendremos la sucesión de números 6, 3, 10, 5, 16, 8, 4, 2, 1. 
//La conjetura de Collatz dice que, a partir de cualquier número inicial, la sucesión obtenida 
//siempre termina en 1. Escriba un programa que permita verificar la conjetura de Collatz para 
//cualquier entero dado, y que imprima la secuencia correspondiente.

public class Ejercicio04 {

	public static String collatz(int numero) {
		String cad = "";
		//numero!=1 &&
		while(numero !=2) {
			if(numero %2 ==0) {
				numero=numero /2;
				cad=cad +numero+ ", ";		
			}
			else {
				numero=(numero*3)+1;
				cad=cad +numero+ ", ";
			}
			
		}
		cad=cad +numero/2;
//		System.out.println(cad);
		return cad;
		
	}
}
