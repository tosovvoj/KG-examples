/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package firstlesson;

import java.util.Scanner;

/**
 *
 * @author Vojtech Tosovsky
 */
public class FirstLesson {

    /**
     * @param args the command line arguments
     */
    public static void mmain(String[] args) {
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
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int a = inputScanner.nextInt();
        int b = inputScanner.nextInt();
        int min = a;
        if (b < a) {
            min = b;
        }
        System.out.println("Minimum je: " + min);
    }

}
