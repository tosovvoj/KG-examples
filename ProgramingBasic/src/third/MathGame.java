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
public class MathGame {

	private int questionCount;
	private SoundUtils soundUtils = new SoundUtils();
	private int difficulty;
	Scanner scanner = new Scanner(System.in);

	public MathGame(int questionCount, int difficulty) {
		this.questionCount = questionCount;
		this.difficulty = difficulty;
	}

	/**
	 * *
	 *
	 * @return
	 */
	public void start() {
		System.out.println("Hra začíná, vypočítáš všechno?");
		int counter = 0;
		int correctCount = 0;
		int wrongCount = 0;

		while (counter < questionCount) {
			MathSummingQuestion question = new MathSummingQuestion(difficulty);
			question.show();
			int answerFormPlayer = getAnswerFormPlayer();
			boolean correct = question.checkAnswer(answerFormPlayer);
			if (correct) {
				System.out.println("Správně");
				playPositive();
				correctCount = correctCount + 1;
			}
			if (!correct) {
				System.out.println("Špatně");
				playNegative();
				wrongCount = wrongCount + 1;
			}
			counter = counter + 1;
		}
		System.out.println("");
		System.out.println("Konec hry");
		System.out.println(correctCount + " odpovědí bylo správně");
		System.out.println(wrongCount + " odpovědí bylo špatně");
		if (wrongCount == 0) {
			System.out.println("Gratulace, jsi šikovný/ná!");
		}
		if (wrongCount != 0) {
			System.out.println("Příště to snad bude lěpší");
		}
	}

	private int getAnswerFormPlayer() {
		int answer = scanner.nextInt();
		return answer;

	}

	private void playPositive() {
		soundUtils.play("C", 200, 10);
		soundUtils.play("E", 200, 15);
		soundUtils.play("C", 200, 15);
		soundUtils.play("F", 400, 15);
	}

	private void playNegative() {
		soundUtils.play("Dis", 500, 10);
	}
	
	

}
