package dominio;

import org.junit.jupiter.api.Test;

public class Ejercicio06 {
	
	public static String imprimirRectagulo(int base, int altura, char caracter) {
		String cad= "";
		boolean senial=false;
		
		for (int i= 0; i < altura; i++) {	
			for (int j = 0; j < base; j++) {
				cad=cad+caracter;
				if(i==altura-1 && j==base-1) 	
					senial=true;		
			}
			if(senial==false) 
				cad=cad+"\n";		
		}
		return cad;
	}
	
	public static String imprimirMatriz(int filas, int columnas, int base) {
		String cad= "";
		boolean senial=false;
		for (int i= 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				if(j==columnas-1)
					cad=cad+base++;
				else
					cad=cad+base++ +"\t";
				if(i==filas-1 && j==columnas-1)
					senial=true;	
			}
			if(senial==false)
				cad=cad+"\n";
		}
//		System.out.println(cad);
		return cad;
		
	}
	
	
}


