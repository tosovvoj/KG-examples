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
		return 5;
	}

//	tato funkce má vrátit, to co dostane na vstupu. Pro 5 vrátí 5 atd....
	public static int same(int i) {
		return i;
	}

//   Impletnujte funkci incrmentor která vrací číslo o jedna větší.
//    tedy pro 1 vrátí 2 pro 5 vrátí 6 pro 5678 vrátí 5679 pro -10 -9...
	public static int incermentor(int i) {
		int increment = i + 1;
		return increment;
	}

//    Implementujte matematickou funkci signum.
//    Tato fukce vrací nulu pro nulu, Pro kladná číla 1 pro záporná čísla -1
//   Například:
//    pro -5 vrací -1,
//    pro 0 vrací 0
//    pro 8 vrací 1
	public static int signum(int i) {
		if (i == 0) {
			return i;
		}
		if (i > 0) {
			return 1;
		}
		return -1;
	}

//	tato funkce má vráti obsah čtverce, tedy pro stranu 5 vrátí hodnotu 25
	public static int contentSquare(int side) {
		return side * side;
	}

	// Tato fukce má vrátit  nejbližší vyšší sudé číslo  
	public static int nearestHigherOrSameEven(int i) {
		if (i % 2 == 0) {
			return i;
		}
		int increment = i + 1;
		return increment;
	}

//tato funkce vrací největší číslo z čísel a,b,c pro 1,2,3, má vrátit 3
	public static int max(int a, int b, int c) {
		int max = a;
		if (b > max) {
			max = b;
		}
		if (c > max) {
			max = c;
		}
		return max;
	}

	//tato funkce vrací nejmenší číslo z čísel a,b,c pro 1, 2, 3 má vrátit 1
	public static int min(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		}
		if (c < min) {
			min = c;
		}
		return min;
	}

	//tato funkce vrací  prostřední číslo z čísel a,b,c pro 1, 2, 3 má vrátit 2
	public static int middle(int a, int b, int c) {
		int max = max(a, b, c);
		int min = min(a, b, c);
		if (a < max && a > min) {
			return a;
		}
		if (b < max && b > min) {
			return b;
		}
		if (c < max && c > min) {
			return c;
		}
		if (a == b) {
			return a;
		}
		if (a == c) {
			return a;
		}
		return b;

	}

//	tato funkce má vždy vrátit false
	public static boolean alwaysFalse() {
		return (false);
	}

//	tato funkce má vrátiti true pokud dostane na vstup kladné číslo jinak vrací false
	public static boolean isPositive(int number) {
//		|| je operátor logick funkce OR(nebo)
		return number > 0;
	}
//	tato funkce vrací true pokud jsou obě čísla na vstupu kladná. JInak vrací false;

	public static boolean isBothPositive(int number1, int number2) {
		return (isPositive(number1) && isPositive(number2));
	}

	//	tato funkce vrací true pokud je alespoň jedno číslo na vstupu záporné, jinak false
	public static boolean atLeastOneNegative(int n1, int n2, int n3, int n4) {
		if (n1 < 0 || n2 < 0 || n3 < 0 || n4 < 0) {
			return true;
		}
		return false;
	}

//tato funkce vrací buď minimum z čísel n1,n2,n3, nebo maximum, podle toho co je boolean min
//	min==true->minimum;  min==false ->maximum
	public static int minOrMax(boolean min, int n1, int n2, int n3) {
		if (min) {
			return min(n1, n2, n3);
		}
		return max(n1, n2, n3);
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
			if (isPositive(number)) {
				sum = sum + number;
			}
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
			if (isPositive(number)) {
				return true;
			}
			number = scanner.nextInt();
		}
		return false;
	}

	public static boolean allPositive(String input) {
		Scanner scanner = new Scanner(input);
		int sum = 0;
		int number = scanner.nextInt();
		while (number != 0) {
			if (!isPositive(number)) {
				return false;
			}
			number = scanner.nextInt();
		}
		return true;
	}

}
