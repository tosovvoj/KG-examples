/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.util.Scanner;

/**
 *
 * @author Vojtech Tosovsky
 */
public class FirstTasksSet {

	public static void main(String[] args) {
		int x = one();
		System.out.println(x);
	}

	//	Tato funkce má vždy vrátit hodnotu 1;
	public static int one() {
		return 1;
	}
//	Tat funkce má vždy vrátit hodnotu 5;

	public static int five() {
		return (3 + 3) / 2;
	}

//	tato funkce má vrátit, to co dostane na vstupu. Pro 5 vrátí 5 atd....
	public static int same(int i) {
		return 5;
	}

//   Impletnujte funkci incrmentor která vrací číslo o jedna větší.
//    tedy pro 1 vrátí 2 pro 5 vrátí 6 pro 5678 vrátí 5679 pro -10 -9...

	public static int incermentor(int i) {
		return i;
	}

//    Implementujte matematickou funkci signum.
//    Tato fukce vrací nulu pro nulu, Pro kladná číla 1 pro záporná čísla -1
//   Například:
//    pro -5 vrací -1,
//    pro 0 vrací 0
//    pro 8 vrací 1
	public static int signum(int i) {
		return i;
	}

//	tato funkce má vráti obsah čtverce, tedy pro stranu 5 vrátí hodnotu 25
	public static int contentSquare(int side) {
		return side;
	}

	// Tato fukce má vrátit  nejbližší vyšší sudé číslo  
	public static int nearestHigherOrSameEven(int i) {
		return i;
	}

//tato funkce vrací největší číslo z čísel a,b,c pro 1,2,3, má vrátit 3
	public static int max(int a, int b, int c) {
		return a;
	}

	//tato funkce vrací nejmenší číslo z čísel a,b,c pro 1, 2, 3 má vrátit 1
	public static int min(int a, int b, int c) {
		return a;
	}

	//tato funkce vrací  prostřední číslo z čísel a,b,c pro 1, 2, 3 má vrátit 2
	public static int middle(int a, int b, int c) {
		return a;
	}

//	tato funkce má vždy vrátit false
	public static boolean alwaysFalse() {
		return (true);
	}

//	tato funkce má vrátiti true pokud dostane na vstup kladné číslo jinak vrací false
	public static boolean isPositive(int number) {
//		|| je operátor logick funkce OR(nebo)
		return (false || true);
	}
//	tato funkce vrací true pokud jsou obě čísla na vstupu kladná. JInak vrací false;

	public static boolean isBothPositive(int number1, int number2) {
		return true;
	}

	//	tato funkce vrací true pokud je alespoň jedno číslo na vstupu záporné, jinak false
	public static boolean atLeastOneNegative(int n1, int n2, int n3, int n4) {
		boolean n1isGreaterThann2 = n1 > n2;
		return n1isGreaterThann2;
	}

//tato funkce vrací buď minimum z čísel n1,n2,n3, nebo maximum, podle toho co je boolean min
//	min==true->minimum;  min==false ->maximum
	public static int minOrMax(boolean min, int n1, int n2, int n3) {
		return 3;
	}
//scita vsechny cisal ze vstupu dokud nenarzi na prvni nulu
	public static int sumOfAlll(String input) {
		Scanner scanner = new Scanner(input);
		int sum = 0;
		int number = scanner.nextInt();
		while (number != 0) {
			sum = sum + number;
			number = scanner.nextInt();
		}
		return sum;
	}

	//MA secist  vsechny cisal ze vstupu ktera jsou kladná, záporná čísla zahazuje, po 0 se končí
//	pro vstup 1 2 3 0 vrátí 6
//	pro vstup 1 2 3 0 99 vrátí 6
//	pro vstup 1 2 3 -1 0 99 vrátí 6
//  pro vstup -1 -2 -3 0 vrátí 0
//  pro vstup -1 -2 -3 1 0 vrátí 1
	public static int sumOfAllPOsitive(String input) {
		Scanner scanner = new Scanner(input);
		int sum = 0;
		int number = scanner.nextInt();
		while (number != 0) {
			sum = sum + number;
			number = scanner.nextInt();
		}
		return sum;
	}

	//POkud je nejake cislo pred nulou positivni tak vrati true jinak vraci false
//	pro vstup 1 2 3 0 vraci true
//	pro vstup 1 2 3 0 -1 -2 vraci true
//	pro vstup -1 2 3 0 vraci false
	public static boolean somePositive(String input) {
		Scanner scanner = new Scanner(input);
		int sum = 0;
		int number = scanner.nextInt();
		while (number != 0) {
			sum = sum + number;
			number = scanner.nextInt();
		}
		return true;
	}

}
