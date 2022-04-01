package primos;

public class Primo extends Thread {
	private int primo;
	private CalculoPrimo cp;
	
	public Primo(int primo, CalculoPrimo cp) {
		this.primo=primo;
		this.cp = cp;
	}
	
	public void run() {
		cp.comprobacionPrimo(primo);
	}

	public int getPrimo() {
		return primo;
	}

	public void setPrimo(int primo) {
		this.primo = primo;
	}

	
	}


