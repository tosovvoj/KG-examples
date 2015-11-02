/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.util.Random;

/**
 *
 * @author Vojtech Tosovsky
 */
class MathSummingQuestion {

	private static Random random = new Random();

	String question;
	int firstAddend;
	int seconAddend;
	int difficulty;
	int answer;

	public void show() {
		System.out.println("");
		System.out.print(firstAddend);
		System.out.print(" + ");
		System.out.print(seconAddend);
		System.out.print(" = ");
	}

	public boolean checkAnswer(int number) {
		if (number == answer) {
			return true;
		}
		return false;
	}

	public MathSummingQuestion(int difficulty) {
		this.difficulty = difficulty;
		firstAddend = random.nextInt(difficulty);
		seconAddend = random.nextInt(difficulty);
		answer = firstAddend + seconAddend;
	}

	public MathSummingQuestion(String question, int firstAddend, int seconAddend) {
		this.question = question;
		this.firstAddend = firstAddend;
		this.seconAddend = seconAddend;
		difficulty = seconAddend;
		if (firstAddend > seconAddend) {
			difficulty = firstAddend;
		}
		answer = firstAddend + seconAddend;
	}

}
