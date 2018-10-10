package bank;

import java.util.Scanner;

public class bankTest {

	public static void main(String[] args) {
		
		Bankkartya[] bk = new Bankkartya[3];
		
		/*
		bk[0] = new Bankkartya("Tomi1", 1000, 500);
		bk[1] = new Bankkartya("Tomi2", 6000, 1500);
		bk[2] = new Bankkartya("Tomi3", 5500, 2500);
		
		for (Bankkartya b : bk) {
			System.out.println(b.toString());
			b.penzFelvet(600);
			System.out.println("Az egyenleg: " + b.getEgyenleg() + "\n");
		}
		*/
		
		bk[0] = new Bankkartya("Tomi1", 1000);
		bk[1] = new Bankkartya("Tomi2", 6000);
		bk[2] = new Bankkartya("Tomi3", 5500);
		
		for (Bankkartya b : bk) {
			System.out.println(b.toString());
			b.penzFelvet(600);
			System.out.println("Az egyenleg: " + b.getEgyenleg() + "\n");
		}
		
		//Scanner scanner = new Scanner(System.in);
		
		
		
	}

}
