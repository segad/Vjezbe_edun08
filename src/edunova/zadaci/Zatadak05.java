package edunova.zadaci;

import javax.swing.JOptionPane;

public class Zatadak05 {

	// Kreirajte metodu primBroj tipa boolean koja za primljeni
	// cijeli broj vraæa true ako je prim ili false ako nije
	// prim broj

	private static boolean primBroj(int cijeliBroj) {
		boolean rezultat = false;
		if (!(cijeliBroj % 2 == 0) && cijeliBroj > 2) {
			rezultat = true;
			return rezultat;
		} else if (cijeliBroj == 2) {
			rezultat = true;
			return rezultat;
		} else {
			return rezultat;
		}

	}

	public static void main(String[] args) {

		int a, b;

		a = Integer.parseInt(JOptionPane.showInputDialog("Unesi prvi broj"));
		b = Integer.parseInt(JOptionPane.showInputDialog("Unesi drugi broj"));

		primBrojevi(a, b);
	}

	// Kreirajte metodu primBrojevi tipa void koja prima
	// dva cijela broja
	// metoda ispisuje prim brojeve izmeðu dva primljena broja

	private static void primBrojevi(int a, int b) {
		for (int i = a; i < b; i++) {

			if (!(i % 2 == 0)) {
				System.out.println(i);

			}

		}
	}

}
