package primos;

public class CalculoPrimo {
	
	public CalculoPrimo() {
		
	}
	
	/**
	 * Comprueba si el número indicado es primo o compuesto.
	 * @param p número del que se comprueba su primalidad.
	 * @return true si el p es un número primo, y false si es compuesto.
	 */
	public synchronized boolean comprobacionPrimo(int p) {
		
		
		boolean primo = true;
		if(p == 0 || p == 1 || p == 4) {
			primo = false;
			
		} else {
			
			for(int i = 2; i < p; i++) {
				
				if(p%i == 0 ) {
					primo = false;
					break;
				} else {
					continue;
				}
				
				
				
			}
		}
		
		System.out.println("El número " + p + " es primo: " + primo);
		return primo;
		
	}

}
