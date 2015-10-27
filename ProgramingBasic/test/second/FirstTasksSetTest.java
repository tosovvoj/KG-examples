/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package second;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Vojtech Tosovsky
 */
public class FirstTasksSetTest {

	public FirstTasksSetTest() {
	}

	/**
	 * Test of one method, of class FirstTasksSet.
	 */
	@Test
	public void testOne() {
		System.out.println("one");
		int expResult = 1;
		int result = FirstTasksSet.one();
		assertEquals(expResult, result);
	}

	/**
	 * Test of same method, of class FirstTasksSet.
	 */
	@Test
	public void testSame() {
		System.out.println("same");
		int i = 0;
		int expResult = i;
		int result = FirstTasksSet.same(i);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	/**
	 * Test of same method, of class FirstTasksSet.
	 */
	@Test
	public void testSame2() {
		System.out.println("same");
		int i = -99;
		int expResult = i;
		int result = FirstTasksSet.same(i);
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	/**
	 * Test of five method, of class FirstTasksSet.
	 */
	@Test
	public void testFive() {
		System.out.println("five");
		int expResult = 5;
		int result = FirstTasksSet.five();
		assertEquals(expResult, result);
	}

	/**
	 * Test of incermentor method, of class FirstTasksSet.
	 */
	@Test
	public void testIncermentor() {
		System.out.println("incermentor");
		int i = 0;
		int expResult = 1;
		int result = FirstTasksSet.incermentor(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of incermentor method, of class FirstTasksSet.
	 */
	@Test
	public void testIncermentor2() {
		System.out.println("incermentor");
		int i = 5;
		int expResult = 6;
		int result = FirstTasksSet.incermentor(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of incermentor method, of class FirstTasksSet.
	 */
	@Test
	public void testIncermentor3() {
		System.out.println("incermentor");
		int i = -99;
		int expResult = -98;
		int result = FirstTasksSet.incermentor(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of signum method, of class FirstTasksSet.
	 */
	@Test
	public void testSignumZero() {
		System.out.println("signumZero");
		int i = 0;
		int expResult = 0;
		int result = FirstTasksSet.signum(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of signum method, of class FirstTasksSet.
	 */
	@Test
	public void testSignum() {
		System.out.println("signumPOsitive");
		int i = 5;
		int expResult = 1;
		int result = FirstTasksSet.signum(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of signum method, of class FirstTasksSet.
	 */
	@Test
	public void testSignumNegative() {
		System.out.println("signum");
		int i = -99;
		int expResult = -1;
		int result = FirstTasksSet.signum(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of contentSquare method, of class FirstTasksSet.
	 */
	@Test
	public void testContentSquare2() {
		System.out.println("contentSquare2");
		int side = 3;
		int expResult = 9;
		int result = FirstTasksSet.contentSquare(side);
		assertEquals(expResult, result);
	}

	@Test
	public void testContentSquare3() {
		System.out.println("contentSquare3");
		int side = 4;
		int expResult = 16;
		int result = FirstTasksSet.contentSquare(side);
		assertEquals(expResult, result);
	}

	@Test
	public void testContentSquare() {
		System.out.println("contentSquare");
		int side = 5;
		int expResult = 25;
		int result = FirstTasksSet.contentSquare(side);
		assertEquals(expResult, result);
	}

	/**
	 * Test of nearestHigherOrSameEven method, of class FirstTasksSet.
	 */
	@Test
	public void testNearestHigherOrSameEven() {
		System.out.println("nearestHigherOrSameEven");
		int i = 12;
		int expResult = 12;
		int result = FirstTasksSet.nearestHigherOrSameEven(i);
		assertEquals(expResult, result);
	}

	@Test
	public void testNearestHigherOrSameEven2() {
		System.out.println("nearestHigherOrSameEven");
		int i = 1;
		int expResult = 2;
		int result = FirstTasksSet.nearestHigherOrSameEven(i);
		assertEquals(expResult, result);
	}

	@Test
	public void testNearestHigherOrSameEven3() {
		System.out.println("nearestHigherOrSameEven");
		int i = 7;
		int expResult = 8;
		int result = FirstTasksSet.nearestHigherOrSameEven(i);
		assertEquals(expResult, result);
	}

	/**
	 * Test of max method, of class FirstTasksSet.
	 */
	@Test
	public void testMax() {
		System.out.println("max");
		int a = 1;
		int b = 2;
		int c = 3;
		int expResult = 3;
		int result = FirstTasksSet.max(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testMax2() {
		System.out.println("max");
		int a = 10;
		int b = 5;
		int c = 4;
		int expResult = 10;
		int result = FirstTasksSet.max(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testMax3() {
		System.out.println("max");
		int a = 999;
		int b = 1000;
		int c = 876;
		int expResult = 1000;
		int result = FirstTasksSet.max(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testMax4() {
		System.out.println("max");
		int a = 12;
		int b = 567;
		int c = 23;
		int expResult = 567;
		int result = FirstTasksSet.max(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testMax5() {
		System.out.println("max");
		int a = 12;
		int b = 903;
		int c = 900;
		int expResult = 903;
		int result = FirstTasksSet.max(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testMax6() {
		System.out.println("max");
		int a = 800;
		int b = 700;
		int c = 1000;
		int expResult = 1000;
		int result = FirstTasksSet.max(a, b, c);
		assertEquals(expResult, result);
	}

	/**
	 * Test of min method, of class FirstTasksSet.
	 */
	@Test
	public void testmin() {
		System.out.println("min");
		int a = 1;
		int b = 2;
		int c = 3;
		int expResult = 1;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin2() {
		System.out.println("min");
		int a = 10;
		int b = 5;
		int c = 4;
		int expResult = 4;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin3() {
		System.out.println("min");
		int a = 999;
		int b = 1000;
		int c = 876;
		int expResult = 876;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin4() {
		System.out.println("min");
		int a = 12;
		int b = 567;
		int c = 23;
		int expResult = 12;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin5() {
		System.out.println("min");
		int a = 12;
		int b = 903;
		int c = 900;
		int expResult = 12;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin6() {
		System.out.println("min");
		int a = 700;
		int b = 700;
		int c = 1000;
		int expResult = 700;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin7() {
		System.out.println("min");
		int a = 800;
		int b = 700;
		int c = 700;
		int expResult = 700;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmin8() {
		System.out.println("min");
		int a = 300;
		int b = 700;
		int c = 300;
		int expResult = 300;
		int result = FirstTasksSet.min(a, b, c);
		assertEquals(expResult, result);
	}

	/**
	 * Test of middle method, of class FirstTasksSet.
	 */
	@Test
	public void testmiddle() {
		System.out.println("middle");
		int a = 1;
		int b = 2;
		int c = 3;
		int expResult = 2;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle2() {
		System.out.println("middle");
		int a = 10;
		int b = 5;
		int c = 4;
		int expResult = 5;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle3() {
		System.out.println("middle");
		int a = 999;
		int b = 1000;
		int c = 876;
		int expResult = 999;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle4() {
		System.out.println("middle");
		int a = 12;
		int b = 567;
		int c = 23;
		int expResult = 23;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle5() {
		System.out.println("middle");
		int a = 12;
		int b = 903;
		int c = 900;
		int expResult = 900;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle6() {
		System.out.println("middle");
		int a = 800;
		int b = 700;
		int c = 1000;
		int expResult = 800;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle7() {
		System.out.println("middle");
		int a = 800;
		int b = 800;
		int c = 800;
		int expResult = 800;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	@Test
	public void testmiddle8() {
		System.out.println("middle");
		int a = 700;
		int b = 700;
		int c = 1000;
		int expResult = 700;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}
	@Test
	public void testmiddle9() {
		System.out.println("middle");
		int a = 700;
		int b = -1000;
		int c = -1000;
		int expResult = -1000;
		int result = FirstTasksSet.middle(a, b, c);
		assertEquals(expResult, result);
	}

	/**
	 * Test of alwaysFalse method, of class FirstTasksSet.
	 */
	@Test
	public void testAlwaysFalse() {
		System.out.println("alwaysFalse");
		boolean expResult = false;
		boolean result = FirstTasksSet.alwaysFalse();
		assertEquals(expResult, result);
	}

	/**
	 * Test of isPositive method, of class FirstTasksSet.
	 */
	@Test
	public void testIsPositive() {
		System.out.println("isPositive");
		int number = 0;
		boolean expResult = false;
		boolean result = FirstTasksSet.isPositive(number);
		assertEquals(expResult, result);
	}

	@Test
	public void testIsPositive2() {
		System.out.println("isPositive");
		int number = 1;
		boolean expResult = true;
		boolean result = FirstTasksSet.isPositive(number);
		assertEquals(expResult, result);
	}

	@Test
	public void testIsPositive3() {
		System.out.println("isPositive");
		int number = -3;
		boolean expResult = false;
		boolean result = FirstTasksSet.isPositive(number);
		assertEquals(expResult, result);
	}

	/**
	 * Test of isBothPositive method, of class FirstTasksSet.
	 */
	@Test
	public void testIsBothPositive() {
		System.out.println("isBothPositive");
		int number1 = 0;
		int number2 = 0;
		boolean expResult = false;
		boolean result = FirstTasksSet.isBothPositive(number1, number2);
		assertEquals(expResult, result);
	}

	@Test
	public void testIsBothPositive2() {
		System.out.println("isBothPositive");
		int number1 = 1;
		int number2 = 0;
		boolean expResult = false;
		boolean result = FirstTasksSet.isBothPositive(number1, number2);
		assertEquals(expResult, result);
	}

	@Test
	public void testIsBothPositive3() {
		System.out.println("isBothPositive");
		int number1 = 1;
		int number2 = 1;
		boolean expResult = true;
		boolean result = FirstTasksSet.isBothPositive(number1, number2);
		assertEquals(expResult, result);
	}

	@Test
	public void testIsBothPositive4() {
		System.out.println("isBothPositive");
		int number1 = 1;
		int number2 = -10;
		boolean expResult = false;
		boolean result = FirstTasksSet.isBothPositive(number1, number2);
		assertEquals(expResult, result);
	}

	/**
	 * Test of atLeastOneNegative method, of class FirstTasksSet.
	 */
	@Test
	public void testAtLeastOneNegative2() {
		System.out.println("atLeastOneNegative");
		int n1 = 0;
		int n2 = -1;
		int n3 = 0;
		int n4 = 0;
		boolean expResult = true;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	@Test
	public void testAtLeastOneNegative3() {
		System.out.println("atLeastOneNegative");
		int n1 = 0;
		int n2 = 0;
		int n3 = -5;
		int n4 = 0;
		boolean expResult = true;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	@Test
	public void testAtLeastOneNegative4() {
		System.out.println("atLeastOneNegative");
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int n4 = -7;
		boolean expResult = true;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	@Test
	public void testAtLeastOneNegative5() {
		System.out.println("atLeastOneNegative");
		int n1 = 123;
		int n2 = 0;
		int n3 = -123;
		int n4 = -123;
		boolean expResult = true;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	@Test
	public void testAtLeastOneNegative6() {
		System.out.println("atLeastOneNegative");
		int n1 = 876;
		int n2 = -3;
		int n3 = -2;
		int n4 = -1;
		boolean expResult = true;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	@Test
	public void testAtLeastOneNegative7() {
		System.out.println("atLeastOneNegative");
		int n1 = 12;
		int n2 = 14;
		int n3 = 18;
		int n4 = 19;
		boolean expResult = false;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	@Test
	public void testAtLeastOneNegative8() {
		System.out.println("atLeastOneNegative");
		int n1 = -123;
		int n2 = 123;
		int n3 = 123;
		int n4 = -123;
		boolean expResult = true;
		boolean result = FirstTasksSet.atLeastOneNegative(n1, n2, n3, n4);
		assertEquals(expResult, result);
	}

	/**
	 * Test of minOrMax method, of class FirstTasksSet.
	 */
	@Test
	public void testMinOrMax() {
		System.out.println("minOrMax");
		boolean min = true;
		int n1 = 0;
		int n2 = 12;
		int n3 = 15;
		int expResult = 0;
		int result = FirstTasksSet.minOrMax(min, n1, n2, n3);
		assertEquals(expResult, result);
	}

	@Test
	public void testMinOrMax2() {
		System.out.println("minOrMax");
		boolean min = false;
		int n1 = 4;
		int n2 = 12;
		int n3 = 15;
		int expResult = 15;
		int result = FirstTasksSet.minOrMax(min, n1, n2, n3);
		assertEquals(expResult, result);
	}

	@Test
	public void testMinOrMax3() {
		System.out.println("minOrMax");
		boolean min = true;
		int n1 = 987;
		int n2 = -1;
		int n3 = 5;
		int expResult = -1;
		int result = FirstTasksSet.minOrMax(min, n1, n2, n3);
		assertEquals(expResult, result);
	}

	@Test
	public void testMinOrMax4() {
		System.out.println("minOrMax");
		boolean min = false;
		int n1 = 987;
		int n2 = -1;
		int n3 = 5;
		int expResult = 987;
		int result = FirstTasksSet.minOrMax(min, n1, n2, n3);
		assertEquals(expResult, result);
	}

	@Test
	public void testMinOrMax5() {
		System.out.println("minOrMax");
		boolean min = true;
		int n1 = 987;
		int n2 = -9;
		int n3 = 5123;
		int expResult = -9;
		int result = FirstTasksSet.minOrMax(min, n1, n2, n3);
		assertEquals(expResult, result);
	}

	@Test
	public void testMinOrMax6() {
		System.out.println("minOrMax");
		boolean min = true;
		int n1 = 5;
		int n2 = 5;
		int n3 = 5;
		int expResult = 5;
		int result = FirstTasksSet.minOrMax(min, n1, n2, n3);
		assertEquals(expResult, result);
	}

	/**
	 * Test of sumOfAlll method, of class FirstTasksSet.
	 */
	@Test
	public void testSumOfAlll() {
		System.out.println("sumOfAlll");
		String input = " 1 2 3 0";
		int expResult = 6;
		int result = FirstTasksSet.sumOfAlll(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAlll2() {
		System.out.println("sumOfAlll");
		String input = " 2 2 3 0 1";
		int expResult = 7;
		int result = FirstTasksSet.sumOfAlll(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAlll3() {
		System.out.println("sumOfAlll");
		String input = " -1 -2 -3 0";
		int expResult = -6;
		int result = FirstTasksSet.sumOfAlll(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAlll4() {
		System.out.println("sumOfAlll");
		String input = " 1 2 3 3 2 1 0 1 2 3 ";
		int expResult = 12;
		int result = FirstTasksSet.sumOfAlll(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAlll5() {
		System.out.println("sumOfAlll");
		String input = " 1 2 3 -3 -2 -1 0 -1";
		int expResult = 0;
		int result = FirstTasksSet.sumOfAlll(input);
		assertEquals(expResult, result);
	}

	/**
	 * Test of sumOfAllPOsitive method, of class FirstTasksSet.
	 */
	@Test
	public void testSumOfAllPOsitive() {
		System.out.println("sumOfAllPOsitive");
		String input = "1 2 3 0";
		int expResult = 6;
		int result = FirstTasksSet.sumOfAllPOsitive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAllPOsitive2() {
		System.out.println("sumOfAllPOsitive");
		String input = "1 2 3 -3 0";
		int expResult = 6;
		int result = FirstTasksSet.sumOfAllPOsitive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAllPOsitive3() {
		System.out.println("sumOfAllPOsitive");
		String input = "-1 -2 -3 0";
		int expResult = 0;
		int result = FirstTasksSet.sumOfAllPOsitive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAllPOsitiv4() {
		System.out.println("sumOfAllPOsitive");
		String input = "-1 -2 -3 5 0";
		int expResult = 5;
		int result = FirstTasksSet.sumOfAllPOsitive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSumOfAllPOsitive5() {
		System.out.println("sumOfAllPOsitive");
		String input = "10 22 33 -1 -2 -3 0  1 2 3 4  5 4 2 0 0 0 ";
		int expResult = 65;
		int result = FirstTasksSet.sumOfAllPOsitive(input);
		assertEquals(expResult, result);
	}

	/**
	 * Test of somePositive method, of class FirstTasksSet.
	 */
	@Test
	public void testSomePositive() {
		System.out.println("somePositive");
		String input = " 0 0";
		boolean expResult = false;
		boolean result = FirstTasksSet.somePositive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSomePositive2() {
		System.out.println("somePositive");
		String input = "1 0";
		boolean expResult = true;
		boolean result = FirstTasksSet.somePositive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSomePositive3() {
		System.out.println("somePositive");
		String input = "1 2 3 4 5 6 7 8 9 0";
		boolean expResult = true;
		boolean result = FirstTasksSet.somePositive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSomePositive4() {
		System.out.println("somePositive");
		String input = "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -2 -2 -2 -2 -5 -6 0 2 3 ";
		boolean expResult = false;
		boolean result = FirstTasksSet.somePositive(input);
		assertEquals(expResult, result);
	}

	@Test
	public void testSomePositive5() {
		System.out.println("somePositive");
		String input = "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -2 -2 -2 -2 -5 -6 1 0";
		boolean expResult = true;
		boolean result = FirstTasksSet.somePositive(input);
		assertEquals(expResult, result);
	}

//	@Test
//	public void testallPositive() {
//		System.out.println("allPositive");
//		String input = "-1 0 0";
//		boolean expResult = false;
//		boolean result = FirstTasksSet.allPositive(input);
//		assertEquals(expResult, result);
//	}
//
//	@Test
//	public void testallPositive2() {
//		System.out.println("allPositive");
//		String input = "1 0";
//		boolean expResult = true;
//		boolean result = FirstTasksSet.allPositive(input);
//		assertEquals(expResult, result);
//	}
//
//	@Test
//	public void testallPositive3() {
//		System.out.println("allPositive");
//		String input = "1 2 3 4 5 6 7 8 9 0";
//		boolean expResult = true;
//		boolean result = FirstTasksSet.allPositive(input);
//		assertEquals(expResult, result);
//	}
//
//	@Test
//	public void testallPositive4() {
//		System.out.println("allPositive");
//		String input = "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -2 -2 -2 -2 -5 -6 0 2 3 ";
//		boolean expResult = false;
//		boolean result = FirstTasksSet.allPositive(input);
//		assertEquals(expResult, result);
//	}
//
//	@Test
//	public void testallPositive5() {
//		System.out.println("allPositive");
//		String input = "-1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -1 -2 -2 -2 -2 -5 -6 1 0";
//		boolean expResult = false;
//		boolean result = FirstTasksSet.allPositive(input);
//		assertEquals(expResult, result);
//	}

}
