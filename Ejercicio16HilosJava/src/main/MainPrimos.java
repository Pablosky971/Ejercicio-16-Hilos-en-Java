package main;

import primos.CalculoPrimo;
import primos.Primo;

public class MainPrimos {

	public static void main(String[] args) {
		
		CalculoPrimo cp = new CalculoPrimo();
		
		
		Primo p1 = new Primo(1,cp); // Compuesto
		p1.setName("Hilo 1");
		Primo p2 = new Primo(7,cp); // Primo
		p2.setName("Hilo 2");
		Primo p3 = new Primo(217,cp); // Compuesto
		p3.setName("Hilo 3");
		Primo p4 = new Primo(2503,cp); // Primo
		p4.setName("Hilo 4");
		Primo p5 = new Primo(1998,cp); // Compuesto
		p5.setName("Hilo 5");
		Primo p6 = new Primo(34421,cp); // Primo
		p6.setName("Hilo 6");
		
		
		
		
		try {
			Thread.sleep(0);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		p1.start();
		p2.start();
		p3.start();
		p4.start();
		p5.start();
		p6.start();
	}

}
