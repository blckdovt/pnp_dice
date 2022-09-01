package MainPack;

abstract class Würfelmechanik extends GUI{
	
	public static int ergebnis;
	public static String result;
	
	//WÜRFELMECHANIKEN

	public static void w4() {
		double augenzahl = (Math.random()*4)+1;
		ergebnis = (int)augenzahl;
		result = Integer.toString(ergebnis);
		endergebnis.setText(result);
	}

	public static void w6() {
		double augenzahl = (Math.random()*6)+1;
		ergebnis = (int)augenzahl;
		result = Integer.toString(ergebnis);
		endergebnis.setText(result);
	}
	
	public static void w8() {
		double augenzahl = (Math.random()*8)+1;
		ergebnis = (int)augenzahl;
		result = Integer.toString(ergebnis);
		endergebnis.setText(result);
	}
	
	public static void w10() {
		double augenzahl = (Math.random()*10)+1;
		ergebnis = (int)augenzahl;
		result = Integer.toString(ergebnis);
		endergebnis.setText(result);
	}
	
	public static void w12() {
		double augenzahl = (Math.random()*12)+1;
		ergebnis = (int)augenzahl;
		result = Integer.toString(ergebnis);
		endergebnis.setText(result);
	}
	
	public static void w20() {
		double augenzahl = (Math.random()*20)+1;
		ergebnis = (int)augenzahl;
		result = Integer.toString(ergebnis);
		endergebnis.setText(result);
	}
	
	public static void reset() {
		endergebnis.setText("?");
	}

}
