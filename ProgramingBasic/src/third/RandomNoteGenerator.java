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
public class RandomNoteGenerator {

	private static String[] allnotes = new String[]{"C", "D", "E", "F", "G", "A", "H", "C"};
	private static String[] notesOnlyCFH = new String[]{"C", "F", "H"};
	private static Random random = new Random();

	public String nextNote() {
		return allnotes[random.nextInt(allnotes.length)];
	}

	public String nextNoteLimitedCFH() {
		return notesOnlyCFH[random.nextInt(notesOnlyCFH.length)];
	}

}
