package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O1 {

	public static void main(String[] args) {
		String payroll = showInputDialog("Årslønn i antall hele kroner: ");

		int pay = parseInt(payroll);
		double trinnskatt;
		
		double trinnskatt1 = (292850-208051)*0.017;
		double trinnskatt2 = (670000-292851)*0.040 + trinnskatt1;
		double trinnskatt3 = (937900-671001)*0.136 + trinnskatt2;
		double trinnskatt4 = (1350000-937901)*0.166 + trinnskatt3;
				
		String utTxt;

		if (pay < 0) {
			utTxt = "Ugyldig verdi";

		} else if (pay >= 0 && pay <= 208050) {
			utTxt = "Du betaler ingen trinnskatt";

		} else if (pay >= 208051 && pay <= 292850) {
			trinnskatt = (pay-208051)*0.017;
			utTxt = "Du skal betale " + Math.round(trinnskatt) + " kr i trinnskatt";

		} else if (pay >= 292851 && pay <= 670000) {
			trinnskatt = (pay-292851)*0.04 + trinnskatt1;
			utTxt = pay + " Du skal betale " + Math.round(trinnskatt) + " kr i trinnskatt";

		} else if (pay >= 671001 && pay <= 937900) {
			trinnskatt = (pay-671001)*0.136 + trinnskatt2;
			utTxt = "Du skal betale " + Math.round(trinnskatt) + " kr i trinnskatt";

		} else if (pay >= 937901 && pay <= 1350000) {
			trinnskatt = (pay-937901)*0.166 + trinnskatt3;
			utTxt = "Du skal betale " + Math.round(trinnskatt) + " kr i trinnskatt";

		} else {
			trinnskatt = (pay-1350001)*0.176 + trinnskatt4;	
			utTxt = "Du skal betale " + Math.round(trinnskatt) + " kr i trinnskatt";

		}

		showMessageDialog(null, utTxt);

	}

}