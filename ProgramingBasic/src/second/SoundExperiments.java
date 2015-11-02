/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 *
 * @author Vojtech Tosovsky
 */
public class SoundExperiments {

	private static HashMap<Character, Integer> map;

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws InterruptedException, LineUnavailableException, IOException {
//		bezi liska k taboru
//		cece2gggcece2dddcegedd2ecegedd2c
		map = new HashMap<Character, Integer>();
		map.put('c', 32);
		map.put('d', 37);
		map.put('e', 41);
		map.put('f', 43);
		map.put('g', 49);
		Scanner inputScanner = new Scanner(System.in);
		int x = 1;
		int zero = (int) '0';
		while (x != 0) {
			int multiplier = 1;
			Character two = '2';
			Character four = '4';
			Character eight = '8';

			Character note = (char) System.in.read();
			if (note.equals(two) || note.equals(four) || note.equals(eight)) {
				multiplier = (int) note;
				multiplier -= zero;
				note = (char) System.in.read();
			}
			Integer get = map.get(note); //
			if (get == null) {
				continue;
			}
			SoundUtils.tone(get, 500 * multiplier, 10);
		}
		System.out.println("Konec programu");

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

	public static class SoundUtils {

		public static float SAMPLE_RATE = 8000f;

		public static void tone(int hz, int msecs)
				throws LineUnavailableException {
			tone(hz, msecs, 1.0);
		}

		public static void tone(int hz, int msecs, double vol)
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
}
