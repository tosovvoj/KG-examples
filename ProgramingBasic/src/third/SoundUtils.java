/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Vojtech Tosovsky
 */
public class SoundUtils {

	private static double A_FREQUENCY = 44;
	private static double A = 1.059463094359;
	private static double[] ALL_NOTES = new double[31];
	private static Map<String, Integer> notes = new HashMap<String, Integer>();

	static {
		for (int i = 0; i < ALL_NOTES.length; i++) {
			int n = i - (ALL_NOTES.length / 2);
			ALL_NOTES[i] = A_FREQUENCY * Math.pow(A, n);
		}
		notes.put("H0", 5);
		notes.put("C", 6);
		notes.put("Cis", 7);
		notes.put("D", 8);
		notes.put("Dis", 9);
		notes.put("E", 10);
		notes.put("F", 11);
		notes.put("Fis", 12);
		notes.put("G", 13);
		notes.put("Gis", 14);
		notes.put("A", 15);
		notes.put("Ais", 16);
		notes.put("H", 17);
		notes.put("C1", 18);
		notes.put("Cis1", 19);
		notes.put("D1", 20);
		notes.put("Dis1", 21);
		notes.put("E1", 22);
		notes.put("F1", 23);
		notes.put("Fis1", 24);
		notes.put("G1", 25);
		notes.put("Gis1", 26);
		notes.put("A1", 27);
		notes.put("Ais1", 28);
		notes.put("H1", 28);
	}

	public void play(String note, int msecs, double vol) {
		try {
			tone(ALL_NOTES[notes.get(note)], msecs, vol);
		} catch (LineUnavailableException ex) {
			System.out.println("Nota " + note + "nenalezena");
			Logger.getLogger(SoundUtils.class.getName()).log(Level.SEVERE, null, ex);
		}


	}

	public static float SAMPLE_RATE = 8000f;

	private static void tone(double hz, int msecs)
			throws LineUnavailableException {
		tone(hz, msecs, 1.0);
	}

	private static void tone(double hz, int msecs, double vol)
			throws LineUnavailableException {
		byte[] buf = new byte[1];
		AudioFormat af = new AudioFormat(
				SAMPLE_RATE, // sampleRate
				8, // sampleSizeInBits
				1, // channels
				true, // signed
				false);      // bigEndian
		SourceDataLine sdl = AudioSystem.getSourceDataLine(af);
		sdl.open(af);
		sdl.start();
		for (int i = 0; i < msecs * 8; i++) {
			double angle = i / (SAMPLE_RATE / hz) * 2.0 * Math.PI;
			buf[0] = (byte) (Math.sin(angle) * 127.0 * vol);
			sdl.write(buf, 0, 1);
		}
		sdl.drain();
		sdl.stop();
		sdl.close();
	}

}
