import java.util.*;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Aufgabe_10_Bananen {
	
	static float BruttoPreis; // BruttoPreis Ergebnis
	static int BruttoKiloPreisIn; // Brutto Preis Pro Kilo Banenen
	static int BananenKiloIn; // Anzahl Kilo an Bananen
	static float NettoPreis; // NettoPreis
	static float mwSt = 7; // MehrwertSteuer
	static float mwStBetrag; // MwSt Betrag
	
	public static void main (String [] args) {
		//JFrameGUI1();
		System.out.println("Bitte BananenBruttoKiloPreis eingeben und mit Enter Bestaetigen\n dann Bananenen Kilo eingeben und mit Enter Bestaetigen");
		System.out.println();
		Scanner sc = new Scanner(System.in);
		int BruttoKiloPreisIn = 2320;//sc.nextInt();
		int BananenKiloIn = 15000;//sc.nextInt();
		Bananenrechner(BruttoKiloPreisIn, BananenKiloIn);
		
		Aufgabe_10_Bananen.print(BruttoPreis);
	
		
		//JFrameGUI2();
		
	}
	public static void JFrameGUI1() {
		// Erstellt eine Grafische Oberfläche mit den folgenden Parametern
	    JFrame frame = new JFrame();
	    JLabel label = new JLabel("", JLabel.CENTER);
	    frame.add(label);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(500, 300);
	    frame.setVisible(true);
	}
	public static void JFrameGUI2() {
		// Erstellt eine Grafische Oberfläche mit den folgenden Parametern
	    JFrame frame = new JFrame();
	    JLabel label = new JLabel("In der kommandozeile Banenen in Kilo", JLabel.CENTER);
	    frame.add(label);
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(500, 300);
	    frame.setVisible(true);
	}


	public static float Bananenrechner(int BruttoKiloPreisIn, int BananenKiloIn) {
		float BruttoKiloPreisFloat = (float) BruttoKiloPreisIn;
		float BananenKiloFloat = (float) BananenKiloIn;
		BruttoPreis = ((BruttoKiloPreisFloat / 100) * (BananenKiloFloat / 1000)/100);
		
//		System.out.println("Eingabe: " + BruttoKiloPreisFloat);
//		System.out.println("Eingabe: " + BananenKiloFloat);
//		System.out.println();
//		
//		System.out.println("Durch 100: " + BruttoKiloPreisFloat / 100);
//		System.out.println("Durch 1000: " + BananenKiloFloat / 1000);
//		System.out.println();
//		
////		float BruttoKiloPreisRounded = BruttoKiloPreisFloat / 100;
////		System.out.println("Math.rounded: " + Math.round(BruttoKiloPreisRounded));
////		System.out.println();
//		
//		System.out.println("Math.rounded: " + Math.round(BruttoKiloPreisFloat));
//		System.out.println("Math.round: " + Math.round(BananenKiloFloat));
//		System.out.println();
//		
//		float BruttoPreisRounded = (Math.round(BruttoKiloPreisFloat * BananenKiloFloat /100));
//		System.out.println(BruttoPreisRounded);
//		
		NettoPreis = BruttoPreis - (mwSt/100);
		System.out.println("Netto Preis: " + NettoPreis);
		System.out.println("mwSt: " + mwSt/100);
		
		
		return BruttoPreis;
		
	}
	public static void print(float BruttoPreis) {
		System.out.println("Brutto Preis: " + BruttoPreis);
	}
}
