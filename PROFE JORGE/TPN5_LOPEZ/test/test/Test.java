package test;

import static org.junit.jupiter.api.Assertions.*;

import dominio.Carrera;

class Test {

	@org.junit.jupiter.api.Test
	void test01() {//A
		//Arrange
		String expectedNombre="Licenciatura en Enologia";
		String expectedAbreviatura="Lic. Enolg.";
		String expectedPlan="128/12";
		
		//Act
		Carrera c01= new Carrera(expectdNombre, expectdAbreviatura,expectedPlan);
		String actualNombre=c01.getNombre();
		String actualAbreviatura=c01.getAbreviatura();
		String actualPlan=c01.getPlan();
		
		
		
		// Assert
		assertEquals(expectNombre,actualNombre);
		assertEquals(expectAbreviatura,actualAbreviatura);
		assertEquals(expectedPlan,actualPlan);
		
	}
	@org.junit.jupiter.api.Test
	void test02() {//B
		//Arrange
		Carrera c01= new Carrera("Licenciatura En Sistemas","Lic. Sist.","071/08");
		Carrera c02= new Carrera("Licenciatura En Sistemas","Lic. Sist.","070/08");
		Carrera c03= new Carrera("Ingeniaria en Sistemas","Ing. Sist.","071/08");
		//Act
		boolean actual01= c01.equals(c02);
		boolean actual02= c01.equals(c03);
		
		// Assert
		assertEquals(false,actual01);
		assertEquals(true,actual02);
	}
	@org.junit.jupiter.api.Test
	void test03() {//C
		//Arrange
	
		String expectedNombre="Programacion 2";
		String expectedAbreviatura="Prog II";
		AnioAcademico expectedAnio=AnioAcademico.II;
		
		
		//Act
		Materia c01= new Materia(expectdNombre, expectdAbreviatura,expectedAnio);
		String actualNombre=c01.getNombre();
		String actualAbreviatura=c01.getAbreviatura();
		String actualAnio=c01.getAnioAcademico();
		
		// Assert
		assertEquals(expectNombre,actualNombre);
		assertEquals(expectAbreviatura,actualAbreviatura);
		assertEquals(expectedAnio,actualAnioAcademico);
	}
	@org.junit.jupiter.api.Test
	void test04() { //d
		//Arrange
	
		Materia c01= new Materia("Programacion II","Prog II",AnioAcademico.II);
		Materia c02= new Materia("programacion II","Prog II",AnioAcademico.II);
		Materia c03= new Materia("Programacion II","Prog II",AnioAcademico.II);
		
		//Act
		boolean actual01= c01.equals(c02);
		boolean actual02= c01.equals(c03);// c01 el primero a comparar con c03  
		
		// Assert
		assertEquals(false,actual01);
		assertEquals(true, actual02);
	}
	@org.junit.jupiter.api.Test
	void test05() { //e
		//Arrange
		Carrera carrera= new Carrera("Ingenieria en Sistemas", "IS","072/08");
		Materia c01= new Materia("Algoritmo","Alg",AnioAcademico.I);
		Materia c02= new Materia("Administracion de Empresa","AE",AnioAcademico.I);
		Materia c03= new Materia("Algebra Lineal","AL",AnioAcademico.I);
		Materia c04= new Materia("Analisis Matematico I","AM I",AnioAcademico.I);
		Materia c05= new Materia("Sistema de Representacion","SR",AnioAcademico.I);
		Materia c06= new Materia("Algebra y Geometria","AG",AnioAcademico.I);
		Materia c07= new Materia("Matematica Discreta","MD",AnioAcademico.I);
		Materia c08= new Materia("Electronica Digital","ED",AnioAcademico.I);
		Materia c09= new Materia("Fisica I","F I",AnioAcademico.I);
		Materia c10= new Materia("Quimica","Q",AnioAcademico.I);
		Materia c11= new Materia("Programacion I","Prog I",AnioAcademico.I);
		Materia c12= new Materia("Quimica","Q",AnioAcademico.I);
		//Act

	
		
		// Assert
		assertEquals(true, carrera.agregarMaterias(c01));
		assertEquals(true, carrera.agregarMaterias(c02));
		assertEquals(true, carrera.agregarMaterias(c03));
		assertEquals(true, carrera.agregarMaterias(c04));
		assertEquals(true, carrera.agregarMaterias(c05));
		assertEquals(true, carrera.agregarMaterias(c06));
		assertEquals(true, carrera.agregarMaterias(c07));
		assertEquals(true, carrera.agregarMaterias(c08));
		assertEquals(true, carrera.agregarMaterias(c09));
		assertEquals(true, carrera.agregarMaterias(c10));
		assertEquals(false, carrera.agregarMaterias(c11));
		assertEquals(false, carrera.agregarMaterias(c12));
		
	}
	@org.junit.jupiter.api.Test
	void test06() { //f
		//Arrange
		
		Carrera carrera= new Carrera("Ingenieria en Sistemas", "IS","072/08");
		Materia c01= new Materia("Algoritmo","Alg",AnioAcademico.I);
		Materia c02= new Materia("Administracion de Empresa","AE",AnioAcademico.I);
		Materia c03= new Materia("Algebra Lineal","AL",AnioAcademico.I);
		Materia c04= new Materia("Analisis Matematico I","AM I",AnioAcademico.I);
		Materia c05= new Materia("Sistema de Representacion","SR",AnioAcademico.I);
		Materia c06= new Materia("Algebra y Geometria","AG",AnioAcademico.I);
		Materia c07= new Materia("Matematica Discreta","MD",AnioAcademico.I);
		Materia c08= new Materia("Electronica Digital","ED",AnioAcademico.I);
		Materia c09= new Materia("Fisica I","F I",AnioAcademico.I);
		Materia c10= new Materia("Quimica","Q",AnioAcademico.I);
		
		
		//Act
		carrera.agregarMaterias(c01);
		carrera.agregarMaterias(c02);
		carrera.agregarMaterias(c03);
		carrera.agregarMaterias(c04);
		carrera.agregarMaterias(c05);
		carrera.agregarMaterias(c06);
		carrera.agregarMaterias(c07);
		carrera.agregarMaterias(c08);
		carrera.agregarMaterias(c09);
		carrera.agregarMaterias(c10);
		
		String []expected01= {"Analisis Matematico I","Quimica","Fisica I"};
		String []actual01 = carrera.getMateriasPorAnio(anioAcademico.I); 
		
		String []expected02= {"Analisis Matematico I","Algoritmo","Administracion de empresas","Algebra Lineal","Sistema de Representacion","Quimica","Fisica I","Electronica Digital","Matematica Discreta","Algebra y Geometria"};
		
		
		//Assert
		assertEquals(false, actual01.equals(expected01));
		assertEquals(true, actual01.equals(expected02));
	}
	@org.junit.jupiter.api.Test
	void test07() {//G
		//Arrange
		Carrera carrera= new Carrera("Ingenieria en Sistemas", "IS","072/08");
		Materia c01= new Materia("Algoritmo","Alg",AnioAcademico.I);
		carrera.agregarMaterias(c01);
		String expectedMateria="Algoritmo";
		String expectedAnioDictado="2019";
		String expectedFechaInicio="15-03-2019";
		String expectedFechaFin="25-11-2019";
		
		Implementacion i01=new Implementacion(c01,"2019","15-03-2019","25-11-2019");
		
		//Act
		
		String actualMateria=c01.getMateria().getNombre();
		String actualAnioDictado=c02.getAnioDictado();
		String actualFechaInicio=c03.getFechaInicio();
		String actualFechaFin=c04.getFechaFin();
		
		
		// Assert
		assertEquals(expectedMateria,actualMateria);
		assertEquals(expectedAnioDictado,actualAnioDictado);
		assertEquals(expectedFechaInicio,actualFechaInicio);
		assertEquals(expectedFechaFin,actualFechaFin);
	}
	@org.junit.jupiter.api.Test
	void test05() { //h
		//Arrange
		Implementacion implementacion= new Implementacion("Nombre y Apellido","Carrera","Matricula");
		Alumnos c01= new Alumnos("Aron riperto","Ingenieria en Sistemas","100221");
		Alumnos c02= new Alumnos("Lopez Maximiliano","Licenciatura en sistemas","195303");
		Alumnos c03= new Alumnos("Matias Perez","Ingenieria en Sistemas","101220");
		Alumnos c04= new Alumnos("Pepe Loro","Licenciatura en Sistemas","100222");
		Alumnos c05= new Alumnos("Fabriio Herrera","Licenciatura en Sistemas","123900");
		Alumnos c06= new Alumnos("Pepe Loro","Licenciatura en Sistemas","100222");
		Alumnos c07= new Alumnos("Aron riperto","Ingenieria en Sistemas","100221");
		Alumnos c08= new Alumnos("Aron riperto","Ingenieria Agronoma","100221");
		Alumnos c09= new Alumnos("Susy rere","Abogacia","902020");
		//Act

	
		
		// Assert
		assertEquals(true, implementacion.agregarAlumnos(c01));
		assertEquals(true, implementacion.agregarAlumnos(c02));
		assertEquals(true, implementacion.agregarAlumnos(c03));
		assertEquals(true, implementacion.agregarAlumnos(c04));
		assertEquals(true, implementacion.agregarAlumnos(c05));
		assertEquals(false,implementacion.agregarAlumnos(c06));
		assertEquals(false,implementacion.agregarAlumnos(c07));
		assertEquals(false,implementacion.agregarAlumnos(c08));
		assertEquals(false,implementacion.agregarAlumnos(c09));
	}
	
}
