package dominio;

// 2,3,4,5,6,7,8,9,10,11

public class Divisibilidad {
	// formula sacada de wikipedia
	public static boolean esDivisiblePorDos(int i) {
		int b=i, a=2;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
			return false;
	}
	public static boolean esDivisiblePorTres(int i) {
		int b=i, a=3;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}

	public static boolean esDivisiblePorCuatro(int i) {
		int b=i, a=4;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	public static boolean esDivisiblePorCinco(int i) {
		int b=i, a=5;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	public static boolean esDivisiblePorSeis(int i) {
		int b=i, a=6;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	public static boolean esDivisiblePorSiete(int i) {
		int b=i, a=7;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	public static boolean esDivisiblePorOcho(int i) {
		int b=i, a=8;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	public static boolean esDivisiblePorNueve(int i) {
		int b=i, a=9;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	
	public static boolean esDivisiblePorDies(int i) {
		int b=i, a=10;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	public static boolean esDivisiblePorOnce(int i) {
		int b=i, a=11;
		double c=b/a;
		if((c % 1== 0) && (b-(a*c))==0)
			return true;
		else
		return false;
	}
	

	

	
	
	
}
