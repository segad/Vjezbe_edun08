package edunova.zadaci;

import java.util.Arrays;
import java.util.Random;


public class Zadatak02 {
	
	// Kreirajte metodu slucajniBrojevi 
	// tipa niz decimalnih brojeva (double)
	// koja vraæa 10 sluèajnih brojeva
	// Math.random();
	
	public static double[] slucajniBrojevi () {
		
		double [] nizBrojeva = new double [10];
		
		for(int i=0; i<10; i++) {
			
			nizBrojeva[i] = Math.random();
		}
		return (nizBrojeva);			
	}

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(slucajniBrojevi()));
	
	}

}
