/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package four;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Vojtech Tosovsky
 */
public class fourTaskSetTest {

	/**
	 * Test of power method, of class fourTaskSet.
	 */
	@Test
	public void testPower() {
		System.out.println("power");
		int base = 1;
		int exponent = 1;
		int expResult = 1;
		int result = fourTaskSet.power(base, exponent);
		assertEquals(expResult, result);

		System.out.println("power");
		base = 1;
		exponent = 2;
		expResult = 1;
		result = fourTaskSet.power(base, exponent);
		assertEquals(expResult, result);

		System.out.println("power");
		base = 1;
		exponent = 2;
		expResult = 1;
		result = fourTaskSet.power(base, exponent);
		assertEquals(expResult, result);

		System.out.println("power");
		base = 10;
		exponent = 2;
		expResult = 100;
		result = fourTaskSet.power(base, exponent);
		assertEquals(expResult, result);

		System.out.println("power");
		base = 3;
		exponent = 3;
		expResult = 27;
		result = fourTaskSet.power(base, exponent);
		assertEquals(expResult, result);

		System.out.println("power");
		base = 2;
		exponent = 10;
		expResult = 1024;
		result = fourTaskSet.power(base, exponent);
		assertEquals(expResult, result);

	}

	/**
	 * Test of prime method, of class fourTaskSet.
	 */
	@Test
	public void testPrime() {
		System.out.println("prime");
		int n = 1;
		boolean expResult = true;
		boolean result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 2;
		expResult = true;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 3;
		expResult = true;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 4;
		expResult = false;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 11;
		expResult = true;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 23;
		expResult = true;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 109;
		expResult = true;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

		System.out.println("prime");
		n = 110;
		expResult = false;
		result = fourTaskSet.prime(n);
		assertEquals(expResult, result);

	}

	/**
	 * Test of primeCountUnderN method, of class fourTaskSet.
	 */
	@Test
	public void testPrimeCountUnderN() {
		System.out.println("primeCountUnderN");
		int n = 2;
		int expResult = 1;
		int result = fourTaskSet.primeCountUnderN(n);
		assertEquals(expResult, result);

		System.out.println("primeCountUnderN");
		n = 2;
		expResult = 1;
		result = fourTaskSet.primeCountUnderN(n);
		assertEquals(expResult, result);

		System.out.println("primeCountUnderN");
		n = 3;
		expResult = 2;
		result = fourTaskSet.primeCountUnderN(n);
		assertEquals(expResult, result);

		System.out.println("primeCountUnderN");
		n = 4;
		expResult = 3;
		result = fourTaskSet.primeCountUnderN(n);
		assertEquals(expResult, result);

		System.out.println("primeCountUnderN");
		n = 7;
		expResult = 4;
		result = fourTaskSet.primeCountUnderN(n);
		assertEquals(expResult, result);

		System.out.println("primeCountUnderN");
		n = 19;
		expResult = 8;
		result = fourTaskSet.primeCountUnderN(n);
		assertEquals(expResult, result);

	}

}
