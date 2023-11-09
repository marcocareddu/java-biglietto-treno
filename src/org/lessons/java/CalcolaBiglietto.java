package org.lessons.java;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		
//		Consts
		final float KM_COST = 0.21F;
		final int JUNIOR = 18;
		final int SENIOR = 65;
		final int JUNIOR_DISCOUNT = 20;
		final int SENIOR_DISCOUNT = 40;
		final String RESULT_PHRASE = "Il costo del biglietto è: ";
		
//		Scanner instance
		Scanner in = new Scanner(System.in);
		
//		Take vars from user
		System.out.println("Quanti chilometri vuoi percorrere?");
		String km = in.nextLine();
		int intKm = Integer.valueOf(km);
		
		System.out.println("Qual è la tua età?");
		String age = in.nextLine();
		int intAge = Integer.valueOf(age);

		float grossTicket = intKm * KM_COST;
		float discount = 0;
		
//		Calc Result
		if(intAge <= JUNIOR) {
			discount = (grossTicket * JUNIOR)/100;
		} else if (intAge >= SENIOR) {
			discount = (grossTicket * SENIOR)/100;
		}
		float netTicket = grossTicket - discount;
		
//		Print Result
		System.out.println(RESULT_PHRASE + "€" + netTicket);
	}
}
