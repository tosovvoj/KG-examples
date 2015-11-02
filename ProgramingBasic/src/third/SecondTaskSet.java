/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

/**
 *
 * @author Vojtech Tosovsky
 */
public class SecondTaskSet {

	public static void main(String[] args) {
//		playBeziLiskaKTaboru();
//		implemenujte meotdu playKdyzJsemHusyPasala
//		Manager manager = new Manager();
//		manager.startGame();
	}

	//tato funkce ma vzdy vrátiti 7
	// tato funkce jiz funguje
	public static int one() {
		return 1;
	}

	//tato funkce ma vzdy vrátiti 7
	public static int seven() {
		return 0;
	}
// vrací true pokud vstupní číslo je větší nebo rovno 7 jinak false
	//pro 5 vrátí false
	//pro 7 vrátí true
	//pro 4 vrátí false

	public static boolean greaterOrEqualSeven(int number) {
		return true;
	}

	//vraci maximum ze dvou zadaných čísel
	public static int max(int n1, int n2) {
		return - 99;
	}

	//vraci minumum ze dvou zadaných čísel
	public static int min(int n1, int n2) {
		return - 99;
	}

	// musí vrátiti absolutní hodontu čísla
	// pro nulu vrací nulu
	//pro 77 vrátí 77
	//pro -923 vrátí 923
	public static int absoluteValue(int x) {
		return 7;
	}

	//rozhdne zdali ze stran těchto délek, lze sestavit trojuhelník.
	// pro 1 1 1 vrátí true
	// pro 10 1 1 vrátí false
	public static boolean triangel(int a, int b, int c) {
		return false;
	}

	// vrátí součet čísel od 1 do n
	// pro 1 vrací 1
	//pro 2 vrací 3
	// pro 3 vrací 6
	//pro 4 vrací 10
	// tato metoda již funguje, nemusíte jí implementovat.
	public static int sumFromOneToN(int n) {
		int sum = 0;
		int counter = 1;
		while (counter <= n) {
			sum = sum + counter;
			counter = counter + 1;
		}
		return sum;
	}

	// tato funkce vrací n tou mocninu dvojky.
	// pro 0 vací 1
	//pro 1 vrací 2
	//pro 2 vrací 4
	//pro 3 vrací 8
	//pro 4 vrací 16
	public static int NpowerOfTwo(int n) {
		return -2;
	}
// vrátí faktoriál
	// btw 0!=1

	public static int factorial(int n) {
		return 0;

	}

	private static void playBeziLiskaKTaboru() {
		System.out.println("Skladba běží liška k táboru");
		SoundUtils soundUtils = new SoundUtils();
		int quarter = 200;
		int volume = 10;
		soundUtils.play("C", quarter, volume);
		soundUtils.play("E", quarter, volume);
		soundUtils.play("C", quarter, volume);
		soundUtils.play("E", quarter, volume);

		soundUtils.play("G", 2 * quarter, volume);
		soundUtils.play("G", quarter, volume);
		soundUtils.play("G", quarter, volume);

		soundUtils.play("C", quarter, volume);
		soundUtils.play("E", quarter, volume);
		soundUtils.play("C", quarter, volume);
		soundUtils.play("E", quarter, volume);

		soundUtils.play("D", 2 * quarter, volume);
		soundUtils.play("D", quarter, volume);
		soundUtils.play("D", quarter, volume);

		soundUtils.play("C", quarter, volume);
		soundUtils.play("E", quarter, volume);
		soundUtils.play("G", quarter, volume);
		soundUtils.play("E", quarter, volume);

		soundUtils.play("D", quarter, volume);
		soundUtils.play("D", quarter, volume);
		soundUtils.play("E", 2 * quarter, volume);

		soundUtils.play("C", quarter, volume);
		soundUtils.play("E", quarter, volume);
		soundUtils.play("G", quarter, volume);
		soundUtils.play("E", quarter, volume);

		soundUtils.play("D", quarter, volume);
		soundUtils.play("D", quarter, volume);
		soundUtils.play("C", 2 * quarter, volume);
	}
}
