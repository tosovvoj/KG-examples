/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package third;

import org.junit.After;
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Vojtech Tosovsky
 */
public class SecondTaskSetTest {

	public SecondTaskSetTest() {
	}

	@BeforeClass
	public static void setUpClass() {
	}

	@AfterClass
	public static void tearDownClass() {
	}

	@Before
	public void setUp() {
	}

	@After
	public void tearDown() {
	}

	/**
	 * Test of one method, of class SecondTaskSet.
	 */
	@Test
	public void testOne() {
		System.out.println("one");
		int expResult = 1;
		int result = SecondTaskSet.one();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	/**
	 * Test of seven method, of class SecondTaskSet.
	 */
	@Test
	public void testSeven() {
		System.out.println("seven");
		int expResult = 7;
		int result = SecondTaskSet.seven();
		assertEquals(expResult, result);
		// TODO review the generated test code and remove the default call to fail.
	}

	/**
	 * Test of greaterOrEqualSeven method, of class SecondTaskSet.
	 */
	@Test
	public void testGreaterOrEqualSeven() {
		System.out.println("greaterOrEqualSeven");
		int number = 0;
		boolean expResult = false;
		boolean result = SecondTaskSet.greaterOrEqualSeven(number);
		assertEquals(expResult, result);

		number = 7;
		expResult = true;
		result = SecondTaskSet.greaterOrEqualSeven(number);
		assertEquals(expResult, result);

		number = 8;
		expResult = true;
		result = SecondTaskSet.greaterOrEqualSeven(number);
		assertEquals(expResult, result);

		number = -999;
		expResult = false;
		result = SecondTaskSet.greaterOrEqualSeven(number);
		assertEquals(expResult, result);

	}

	/**
	 * Test of max method, of class SecondTaskSet.
	 */
	@Test
	public void testMax() {
		System.out.println("max");
		int n1 = 0;
		int n2 = 0;
		int expResult = 0;
		int result = SecondTaskSet.max(n1, n2);
		assertEquals(expResult, result);

		n1 = 1;
		n2 = 2;
		expResult = 2;
		result = SecondTaskSet.max(n1, n2);
		assertEquals(expResult, result);

		n1 = 10;
		n2 = 2;
		expResult = 10;
		result = SecondTaskSet.max(n1, n2);
		assertEquals(expResult, result);

	}

	/**
	 * Test of min method, of class SecondTaskSet.
	 */
	@Test
	public void testMin() {
		System.out.println("min");
		int n1 = 0;
		int n2 = 0;
		int expResult = 0;
		int result = SecondTaskSet.min(n1, n2);
		assertEquals(expResult, result);

		n1 = 99;
		n2 = 200;
		expResult = 99;
		result = SecondTaskSet.min(n1, n2);
		assertEquals(expResult, result);

		n1 = 10;
		n2 = -5;
		expResult = -5;
		result = SecondTaskSet.min(n1, n2);
		assertEquals(expResult, result);

	}

	/**
	 * Test of absoluteValue method, of class SecondTaskSet.
	 */
	@Test
	public void testAbsoluteValue() {
		System.out.println("absoluteValue");
		int x = 0;
		int expResult = 0;
		int result = SecondTaskSet.absoluteValue(x);
		assertEquals(expResult, result);

		x = 1;
		expResult = 1;
		result = SecondTaskSet.absoluteValue(x);
		assertEquals(expResult, result);

		x = 10;
		expResult = 10;
		result = SecondTaskSet.absoluteValue(x);
		assertEquals(expResult, result);

		x = -65;
		expResult = -65;
		result = SecondTaskSet.absoluteValue(x);
		assertEquals(expResult, result);

	}

	/**
	 * Test of triangel method, of class SecondTaskSet.
	 */
	@Test
	public void testTriangel() {
		System.out.println("triangel");
		int a = 0;
		int b = 0;
		int c = 0;
		boolean expResult = false;
		boolean result = SecondTaskSet.triangel(a, b, c);
		assertEquals(expResult, result);

		a = 1;
		b = 1;
		c = 2;
		expResult = true;
		result = SecondTaskSet.triangel(a, b, c);
		assertEquals(expResult, result);

		a = 2;
		b = 3;
		c = 5;
		expResult = false;
		result = SecondTaskSet.triangel(a, b, c);
		assertEquals(expResult, result);

		a = 2;
		b = 3;
		c = 4;
		expResult = false;
		result = SecondTaskSet.triangel(a, b, c);
		assertEquals(expResult, result);

	}

	/**
	 * Test of sumFromOneToN method, of class SecondTaskSet.
	 */
	@Test
	public void testSumFromOneToN() {
		System.out.println("sumFromOneToN");
		int n = 1;
		int expResult = 1;
		int result = SecondTaskSet.sumFromOneToN(n);
		assertEquals(expResult, result);

		n = 2;
		expResult = 3;
		result = SecondTaskSet.sumFromOneToN(n);
		assertEquals(expResult, result);

		n = 3;
		expResult = 6;
		result = SecondTaskSet.sumFromOneToN(n);
		assertEquals(expResult, result);

		n = 10;
		expResult = 55;
		result = SecondTaskSet.sumFromOneToN(n);
		assertEquals(expResult, result);

	}

	/**
	 * Test of NpowerOfTwo method, of class SecondTaskSet.
	 */
	@Test
	public void testNpowerOfTwo() {
		System.out.println("NpowerOfTwo");
		int n = 0;
		int expResult = 1;
		int result = SecondTaskSet.NpowerOfTwo(n);
		assertEquals(expResult, result);

		n = 1;
		expResult = 2;
		result = SecondTaskSet.NpowerOfTwo(n);
		assertEquals(expResult, result);

		n = 8;
		expResult = 256;
		result = SecondTaskSet.NpowerOfTwo(n);
		assertEquals(expResult, result);

		n = 9;
		expResult = 512;
		result = SecondTaskSet.NpowerOfTwo(n);
		assertEquals(expResult, result);

		n = 10;
		expResult = 1024;
		result = SecondTaskSet.NpowerOfTwo(n);
		assertEquals(expResult, result);

	}

	/**
	 * Test of factorial method, of class SecondTaskSet.
	 */
	@Test
	public void testFactorial() {
		System.out.println("factorial");
		int n = 0;
		int expResult = 1;
		int result = SecondTaskSet.factorial(n);
		assertEquals(expResult, result);

		n = 1;
		expResult = 1;
		result = SecondTaskSet.factorial(n);
		assertEquals(expResult, result);

		n = 2;
		expResult = 2;
		result = SecondTaskSet.factorial(n);
		assertEquals(expResult, result);

		n = 3;
		expResult = 6;
		result = SecondTaskSet.factorial(n);
		assertEquals(expResult, result);

		n = 8;
		expResult = 40320;
		result = SecondTaskSet.factorial(n);
		assertEquals(expResult, result);

		n = 6;
		expResult = 720;
		result = SecondTaskSet.factorial(n);
		assertEquals(expResult, result);

	}

}
