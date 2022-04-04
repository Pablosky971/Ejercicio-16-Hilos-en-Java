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
				" y voy a comprobar si el n�mero " + this.primo + " es un n�mero primo (true) o (false) compuesto.");
		cp.comprobacionPrimo(primo);
		System.out.println("El hilo " + Thread.currentThread().getName() + " ha finalizado la comprobaci�n del n�mero asignado.");
	}

	public int getPrimo() {
		return primo;
	}

	public void setPrimo(int primo) {
		this.primo = primo;
	}

	
	}


