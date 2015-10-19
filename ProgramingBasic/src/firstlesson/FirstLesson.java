/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstlesson;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Vojtech Tosovsky
 */
public class FirstLesson {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {
	}

	private static void tisk() {
		//		Vypsání mezery
		System.out.print(" ");
//		Vypsání mezery a poté zalomení řádku
		System.out.println(" ");
	}

	private static void power() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Prosím zadejte číslo, které chcete umocnit");
		int number = inputScanner.nextInt();
		System.out.println("Prosím zadejte, na kolikátou se má číslo umocnit");
		int power = inputScanner.nextInt();
		int result = number;
		for (int i = 1; i < power; i++) {
			result = result * number;
		}
		System.out.println("Vysledek je: " + result);
	}

	private static void guessNUmber2() {
		Random random = new Random();
		int number = random.nextInt(100);
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Myslím si číslo od 0 do 100, zkus ho uhodnout.");
		int guess = -1;
		while (guess != number) {
			guess = inputScanner.nextInt();
			if (guess < number) {
				System.out.println("Škoda, netrefil jsi, zkus něco většího.");
			}
			if (guess > number) {
				System.out.println("Škoda, netrefil jsi, zkus něco menšího.");
			}
		}
		System.out.println("Paráda! Myslel jsem na: " + number + ". Jsi vítěz!");
	}

	private static void guseeNumber1() {
		Random random = new Random();
		int number = random.nextInt(100);
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Myslím si číslo od 0 do 100, zkus ho uhodnout.");
		while (true) {
			int guess = inputScanner.nextInt();
			if (guess == number) {
				System.out.println("Paráda! Myslel jsem na: " + number + ". Jsi vítěz!");
				break;
			}
			if (guess < number) {
				System.out.println("Škoda, netrefil jsi, zkus něco většího.");
			}
			if (guess > number) {
				System.out.println("Škoda, netrefil jsi, zkus něco menšího.");
			}
		}
	}

	private static void minFromTwo() {
		Scanner inputScanner = new Scanner(System.in);
		System.out.println("Zadejte prvni cislo: ");
		int a = inputScanner.nextInt();
		System.out.println("Zadejte druhe cislo: ");
		int b = inputScanner.nextInt();
		int minimum = a;
		if (b < a) {
			minimum = b;
		}
		System.out.println("Minimu je: " + minimum);
	}

	public void createSomeVariables() {
		int cislo;
		byte maleCislo;
		boolean logickaPromena;
		Object objekt;
		cislo = 5;
		maleCislo = 3;
		logickaPromena = true;
		objekt = new String();
		int dvaVJednom = 5;
	}

	public static void useIF() {
		Scanner inputScanner = new Scanner(System.in);
		int x = inputScanner.nextInt();
		String parita = new String();
		if (x % 2 == 0) {
			parita = new String("sude");
		}
		if (x % 2 == 1) {
			parita = new String("liche");
		}
		System.out.println("Cislo je " + parita);
	}

}
