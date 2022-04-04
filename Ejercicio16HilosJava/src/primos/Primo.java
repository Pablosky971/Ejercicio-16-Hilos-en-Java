package primos;

public class Primo extends Thread {
	private int primo;
	private CalculoPrimo cp;
	
	public Primo(int primo, CalculoPrimo cp) {
		this.primo=primo;
		this.cp = cp;
	}
	
	public void run() {
		System.out.println("Soy el hilo " + Thread.currentThread().getName() +
				" y voy a comprobar si el número " + this.primo + " es un número primo (true) o (false) compuesto.");
		cp.comprobacionPrimo(primo);
		System.out.println("El hilo " + Thread.currentThread().getName() + " ha finalizado la comprobación del número asignado.");
	}

	public int getPrimo() {
		return primo;
	}

	public void setPrimo(int primo) {
		this.primo = primo;
	}

	
	}


