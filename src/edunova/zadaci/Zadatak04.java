package edunova.zadaci;

public class Zadatak04 {
	
	// Kreirajte metodu aritmetièkas sredina tipa float
	// metoda prima niz cijelih brojeva
	// metoda vraæa aritmetièku sredinu svih primljenih brojeva
	
	public static float aritmetickaSredina (int cijeliBrojevi[]) {
		
		float srednjaVrijednost = 0;
		int suma = 0;
		
		for(int i : cijeliBrojevi) {
			suma += i;
			
		}
		srednjaVrijednost = (float) suma/cijeliBrojevi.length; 
		return srednjaVrijednost;
	}
	
	public static void main(String[] args) {
		int cijeliBrojevi [] = {10, 13, 15, 17, 33};
		
		System.out.println(aritmetickaSredina(cijeliBrojevi));
		
		
	}
}
