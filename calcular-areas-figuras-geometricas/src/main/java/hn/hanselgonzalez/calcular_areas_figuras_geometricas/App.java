package hn.hanselgonzalez.calcular_areas_figuras_geometricas;

import java.util.Scanner;

public class App 
{
	
	public static void main(String[] args) {
		int opcion=0;
		
		do {
			menuOpciones();
			opcion = leerTecladoEntero("");
			Double resultado = null;
			if(opcion == 1) {
				resultado = areaCirculo(leerTecladoDecimal("Ingrese el radio del Circulo:"));
				
			}else if(opcion == 2) {
				resultado = areaCuadrado(leerTecladoDecimal("Ingrese un lado del Cuadrado:"));
				
			}else if(opcion == 3) {
				resultado = areaRectangulo(leerTecladoDecimal("Ingrese la Altura del Rectangulo:"),leerTecladoDecimal("Ingrese la base del Rectangulo:"));
				
			}else if(opcion == 4) {
				resultado = areaTriangulo(leerTecladoDecimal("Ingrese la Altura del Triangulo:"),leerTecladoDecimal("Ingrese la base del Triangulo:"));

			}else if(opcion ==5) {
				System.out.println("Finalizando Programa");
			}else {
				System.out.println("Opcion Incorrecta");
			}
			
			if(resultado == null) {
				System.out.println();
			}else {
			System.out.println("El Area es: "+ resultado);
			System.out.println();
			}
			
		}while(opcion!=5);
		
	}
	

	
	
	
	private static void menuOpciones() {
		System.out.println("========= CALCULAR AREAS DE FIGURAS GEOMETRICAS =============");
		System.out.println("1.- Circulo");
		System.out.println("2.- Cuadrado");
		System.out.println("3.- Rectangulo");
		System.out.println("4.- Triangulo");
		System.out.print("===== Escoja una Opcion:");

	}

	public static int leerTecladoEntero(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextInt();
	}

	public static double leerTecladoDecimal(String mensaje) {
		Scanner teclado = new Scanner(System.in);
		System.out.println(mensaje);
		return teclado.nextDouble();
	}
	
	
	public static Double areaCirculo(double radio) {
		Double resultado = 0.0;
		if(radio <0) {
			resultado = null;
			System.err.println("El radio del circulo no puede ser negativo");
		}else {
			resultado = 3.14*(radio*radio);
		}
		
		return resultado;
	}

	
	
	public static Double areaCuadrado(double lado) {
		Double resultado = 0.0;
		if(lado <0) {
			resultado = null;
			System.err.println("El lado del cuadrado no puede ser negativo");
		}else {
			resultado = lado*lado;
		}
		
		return resultado;
		
	}
	
	
	
	public static Double areaRectangulo(double base, double altura) {
		Double resultado = 0.0;
		if(base <0 || altura<0) {
			resultado = null;
			System.err.println("La base o altura del rectangulo no pueden ser negativo");
		}else {
			resultado = base*altura;
		}
		
		return resultado;

	}

	
	
	
	public static Double areaTriangulo(double base, double altura) {
		Double resultado = 0.0;
		if(base <0 || altura<0) {
			resultado = null;
			System.err.println("La base o altura del Triangulo no pueden ser negativo");
		}else {
			resultado = (base*altura)/2;
		}
		
		return resultado;
	}


	
	

	
	
}
