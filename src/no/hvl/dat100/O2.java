package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class O2 {

	public static void main(String[] args) {

		int studentnumber = 10;
		int student = studentnumber;
		String utTxt;

		for (int i = 1; i <= student; i++) {

			String poengsum = showInputDialog("Skriv inn poengsum " + "(Student nummer " + i + ")");
			int poeng = parseInt(poengsum);

			if (poeng < 0 || poeng > 100) {
				utTxt = "Error";
				showMessageDialog(null, utTxt);
				i--;
				continue;
			}

			if (poeng >= 0 && poeng <= 39) {
				utTxt = ("Din karakter er F");

			} else if (poeng >= 40 && poeng <= 49) {
				utTxt = "Din karakter er E";

			} else if (poeng >= 50 && poeng <= 59) {
				utTxt = "Din karakter er D";

			} else if (poeng >= 60 && poeng <= 79) {
				utTxt = "Din karakter er C";

			} else if (poeng >= 80 && poeng <= 89) {
				utTxt = "Din karakter er B";

			} else if (poeng >= 90 && poeng <= 100) {
				utTxt = "Din karakter er A";

			} else {
				utTxt = "Error";

			}
			showMessageDialog(null, utTxt);

		}

	}

}