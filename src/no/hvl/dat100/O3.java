package no.hvl.dat100;

import static java.lang.Integer.parseInt;
import static javax.swing.JOptionPane.showInputDialog;

public class O3 {

	public static void main(String[] args) {
		String numbers = showInputDialog("Skriv inn et heltall større enn 0 eller mindre enn 26: ");
		    
		int n = parseInt(numbers);
		int faculty = 1;
		 		
		for (int i = 1; i <= n; i++) {
			faculty=faculty*i;
		}
		
		System.out.println("Fakultetet av " + n + " er " + faculty);

	}
	
}
