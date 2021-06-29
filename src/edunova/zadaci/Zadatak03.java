package edunova.zadaci;

public class Zadatak03 {
	
	// Kreirajte metodu razlika tipa int koja
	// prima dva parametra tipa String
	// Metoda vraæa razliku prvog i drugog primljenog broja
	
	public static int razlika (String a, String b) {
		int razlikaBrojeva = (Integer.parseInt(a)) - (Integer.parseInt(b));
		return razlikaBrojeva;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(razlika ("5","3"));
	}

}
