package test;

import static org.junit.jupiter.api.Assertions.*;



import org.junit.jupiter.api.Test;
import dominio.Login;

class TestLogin {

	void test01LoginLongitudCorrecta() {
		//Assert
		String contraNoValida1="012345678";
		String contraNoValida2="012345AAA";
		String contraNoValida3="aaaj";
		String contraValida1="012&34LMml#";
		String contraValida2="#12ld%h90HW";
		String contraNoValida4= "???#83832RRbn";
		
		//Act
		boolean actual1= Login.ValidarLongitud(contraNoValida1);
		boolean actual2= Login.ValidarMinusculas(contraNoValida2);
		boolean actual3= Login.ValidarNumeros(contraNoValida3);
		boolean actual4= Login.ValidarContrasenia(contraValida1);
		boolean actual5= Login.ValidarContrasenia(contraValida2);
		boolean actual6= Login.validarCaracterEspeciales(contraValida1);
		boolean actual7= Login.validarCaracterEspeciales(contraValida2);
		boolean actual8= Login.validarCaracterEspeciales(contraNoValida4);
		//Assert
		assertEquals(false,actual1);
		assertEquals(false,actual2);
		assertEquals(false,actual3);
		assertEquals(true,actual4);
		assertEquals(true,actual5);
		assertEquals(true,actual6);
		assertEquals(true,actual7);
		assertEquals(false,actual8);
		
	}
	
}
