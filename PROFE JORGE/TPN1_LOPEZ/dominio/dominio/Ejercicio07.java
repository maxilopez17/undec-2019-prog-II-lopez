package dominio;

public class Ejercicio07 {

	 public static void ordenarMenorAMayor(int[] A) {
		int temp=0;
        for (int i = 0; i < A.length; i++) {
        	for (int j = i+1; j < A.length; j++) {
        		if(A[i]>A[j]) {
        			temp=A[i];
        			A[i]=A[j];
        			A[j]=temp;
        		}
        	}
		}
        for (int i = 0; i < A.length; i++) 
        	System.out.print(A[i]);
        System.out.println();
	 }
	 
	 public static void ordenarMayorAMenor(int[] A) {
		 int temp=0;
	        for (int i = 0; i < A.length; i++) {
	        	for (int j = i+1; j < A.length; j++) {
	        		if(A[i]<A[j]) {
	        			temp=A[i];
	        			A[i]=A[j];
	        			A[j]=temp;
	        		}
	        	}
			}
	        for (int i = 0; i < A.length; i++) 
	        	System.out.print(A[i]);
	        System.out.println();
		 }   
	 
	 
	 public static void ordenarMenorAMayorSubArray(int[] A, int indexInicio, int indexFin) {
        
		 int temp=0;
	        for (int i = indexInicio; i <= indexFin; i++) {
	        	for (int j = i+1; j <= indexFin; j++) {
	        		if(A[i]>A[j]) {
	        			temp=A[i];
	        			A[i]=A[j];
	        			A[j]=temp;
	        		}
	        	}
			}
	        for (int i = 0; i < A.length; i++) 
	        	System.out.print(A[i]);
	        System.out.println();
		 }
	 
	 public static void ordenarMayorAMenorSubArray(int[] A, int indexInicio, int indexFin) {
        
		 int temp=0;
	        for (int i = indexInicio; i <= indexFin; i++) {
	        	for (int j = i+1; j <= indexFin; j++) {
	        		if(A[i]<A[j]) {
	        			temp=A[i];
	        			A[i]=A[j];
	        			A[j]=temp;
	        		}
	        	}
			}
	        for (int i = 0; i < A.length; i++) 
	        	System.out.print(A[i]);
	        System.out.println();
		 }

}
