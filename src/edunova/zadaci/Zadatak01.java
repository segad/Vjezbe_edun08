package edunova.zadaci;

public class Zadatak01 {
	
	// Kreirati metodu tipa int naziva suma 
	// koja prima niz cijelih brojeva
	// metoda vraæa sumu svih brojeva u nizu
	
	// Metodu pozvati iz main metode
	private static int suma(int[] brojevi) {
		int suma = 0;
		for(int i: brojevi) {
			suma+=i;
		}
		return suma;
	}
	
	public static void main(String[] args) {
		int brojevi [] = {3,10,15,90,11};
		System.out.println(suma(brojevi));
	}
}
