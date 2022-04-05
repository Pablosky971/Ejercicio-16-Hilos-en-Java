package main;

import java.util.Scanner;

import primos.CalculoPrimo;
import primos.Primo;

public class MainPrimos {

	public static void main(String[] args) {
		
		CalculoPrimo cp = new CalculoPrimo();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("=======================================================================");
		System.out.println("Bienvenido al sistema de comprobaci�n de n�meros primos");
		System.out.println("=======================================================================");
		System.out.println("Introduzca el primer n�mero que quiera comprobar: ");
		int n1 = sc.nextInt();
		System.out.println("Introduzca el segundo n�mero que quiera comprobar: ");
		int n2 = sc.nextInt();
		System.out.println("Introduzca el tercer n�mero que quiera comprobar: ");
		int n3 = sc.nextInt();
		
		Primo p1 = new Primo(n1,cp); 
		p1.setName("Hilo 1");
		Primo p2 = new Primo(n2,cp); 
		p2.setName("Hilo 2");
		Primo p3 = new Primo(n3,cp); 
	
		
		
		try {
			Thread.sleep(0);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		p1.start();
		p2.start();
		p3.start();
		
	}

}
