package egyetem;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import egyetem.Egyetem.Kar;
import egyetem.Egyetem.Kar.Tanszek;

public class Teszt {
	
	public static void main(String[] args) {
		Egyetem e = new Egyetem("Miskolci Egyetem", "Torma Andr�s");
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd");
		
		
		Oktato okt1 = new Oktato("KL", LocalDate.parse("1960 12 05", formatter), "tansz�kvezet�");
		Oktato okt2 = new Oktato("KSz", LocalDate.parse("1970 09 15", formatter), "docens");
		
		
		Kar geik = e.new Kar("G�IK", "Sim�nfalvi Zolt�n");
		Tanszek IIT = geik.new Tanszek("�ltal�nos Informatikai Int�zeti Tansz�k", "Kov�cs L�szl�");
		Tanszek AIT = geik.new Tanszek("�ltal�nos Informatikai Int�zeti Tansz�k", "Neh�z K�roly");
		
		
		System.out.println(e.toString());
		System.out.println(okt1.toString());
		System.out.println(okt2.toString());
		System.out.println(geik.toString());
		System.out.println(IIT.toString());
		System.out.println(AIT.toString());
		
		e.karHozzaad(geik);
		geik.tanszekHozzaad(IIT);
		geik.tanszekHozzaad(AIT);
		IIT.oktatoHozzaad(okt1);
		IIT.oktatoHozzaad(okt1);
		
		System.out.println("A tansz�kek sz�ma: " + geik.getTanszekekSzama());
	}

}
