package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		 String payroll = showInputDialog("Årslønn i antall hele kroner: ");
		    
		    int pay = parseInt(payroll);
		 	String utTxt;
		 	
		 		if (pay<0) {
		 			utTxt = "Ugyldig verdi";
		 			
		 		} else if (pay >=0 && pay <= 208050) {
		 			utTxt = "Du har ingen trinnskatt";
		 		
				} else if (pay >=208051 && pay <= 292850) {
					utTxt = "Din trinnskatt er 1,7%";
		 		
				} else if (pay >=292851 && pay <= 670000) {
		 			utTxt = "Din trinnskatt er 4,0%";
		 			
				} else if (pay >=671001 && pay <= 937900) {
		 			utTxt = "Din trinnskatt er 13,6%";
		 			
				} else if (pay >=937901 && pay <= 1350000) {
		 			utTxt = "Din trinnskatt er 16,6%";
		 			
		 		} else {
		 			utTxt = "Din trinnskatt er 17,6%";
		 			
		 		}
		 		
	 			showMessageDialog(null,utTxt);
	 			
		 }

	}