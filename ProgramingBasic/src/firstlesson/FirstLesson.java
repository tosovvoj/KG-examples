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
    public static void main(String[] args) {
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
