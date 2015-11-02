/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

/**
 *
 * @author Vojtech Tosovsky
 */
public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
	}

	public void pozdrav() {
		System.out.println("Ahoj, já jsem " + name + ".");
	}

	public static void main(String[] args) {
		Person kluk = new Person("David");
		kluk.pozdrav();
		Person holka = new Person("Marie");
		holka.pozdrav();
	}

}
