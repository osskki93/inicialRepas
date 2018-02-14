package bloque4ejercicio9;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// Número de dígitos que posee un número
		
		
		int numero1;
		Scanner sc=new Scanner (System.in);
		
		do {
			System.out.println("Introduzca el número del cual desee saber el numero de digitos");
			numero1=sc.nextInt();
		}
		while (numero1<0);
		numerodigitos (numero1);
	}

	public static void numerodigitos (int num1) {
		int cont=0;
			
		do {
			num1=num1/10;
			cont++;
			
		}
		while(num1>0);
		System.out.println("El número posee " +cont + " digitos");

	}
}
