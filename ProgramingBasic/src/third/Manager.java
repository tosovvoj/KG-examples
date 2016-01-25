/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.util.Scanner;

/**
 *
 * @author Vojtech Tosovsky
 */
public class Manager {

	public void startGame() {
		MathGame game = new MathGame(3, 20);
		game.start();
	}
	
	public static void main(String [] args) throws InterruptedException{
		System.out.println("Start");
	Manager manager= new Manager();
	manager.startGame();
	waitForAnyKey();
	}
	
	private static void waitForAnyKey(){
		Scanner scanner= new Scanner(System.in);
		char x= scanner.findInLine(".").charAt(0);
		System.out.println(x);		
	}

}
