package primos;

public class CalculoPrimo {
	
	public CalculoPrimo() {
		
	}
	
	public synchronized boolean comprobacionPrimo(int p) {
		
		
		boolean primo = true;
		if(p == 0 || p == 1 || p == 4) {
			primo = false;
			
		} else {
			
			for(int i = 2; i <= p; i++) {
				
				if(p%i == 0 ) {
					continue;
				} else {
					primo = false;
					break;
				}
				
				
				
			}
		}
		
		System.out.println("El número " + p + " es primo: " + primo);
		return primo;
		
	}

}
