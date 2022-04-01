package main;

import primos.CalculoPrimo;
import primos.Primo;

public class MainPrimos {

	public static void main(String[] args) {
		
		CalculoPrimo cp = new CalculoPrimo();
		
		
		Primo p1 = new Primo(1,cp);
		Primo p2 = new Primo(7,cp);
		Primo p3 = new Primo(217,cp);
		
		Thread t1 = new Thread(p1);

		Thread t2 = new Thread(p2);
		

		Thread t3 = new Thread(p3);
		
		try {
			Thread.sleep(4000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t1.start();
		t2.start();
		t3.start();

	}

}
