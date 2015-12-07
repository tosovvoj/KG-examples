/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Vojtech Tosovsky
 */
public class TaskSetTest {

	public TaskSetTest() {
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
	 * Test of returnFirstElement method, of class TaskSet.
	 */
	@Test
	public void testReturnFirstElement() {
		System.out.println("returnFirstElement");
		int[] array = new int[]{1, 2, 5};
		int expResult = 1;
		int result = TaskSet.returnFirstElement(array);
		assertEquals(expResult, result);

		System.out.println("returnFirstElement");
		array = new int[]{9, 8, 7};
		expResult = 9;
		result = TaskSet.returnFirstElement(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of returnSecondElement method, of class TaskSet.
	 */
	@Test
	public void testReturnSecondElement() {
		System.out.println("returnSecondElement");
		int[] array = new int[]{9, 8, 7, 6, 5, 4, 3, 52, 123};
		int expResult = 8;
		int result = TaskSet.returnSecondElement(array);
		assertEquals(expResult, result);

		array = new int[]{9, 55, 7, 5, 6, 8, 2, 1};
		expResult = 55;
		result = TaskSet.returnSecondElement(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of returnLastElement method, of class TaskSet.
	 */
	@Test
	public void testReturnLastElement() {
		System.out.println("returnLastElement");
		int[] array = new int[]{9, 8, 7};
		int expResult = 7;
		int result = TaskSet.returnLastElement(array);
		assertEquals(expResult, result);

		array = new int[]{9, 8, 1, 2, 5, 9, 7, 5, 0, 45, 52, 0, 45, 2, 47, 4564, 654, 0, 321, 12, 1, 231, 5};
		expResult = 5;
		result = TaskSet.returnLastElement(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of findMaximum method, of class TaskSet.
	 */
	@Test
	public void testFindMaximum() {
		System.out.println("findMaximum");
		int[] array = new int[]{1, 2, 3, 4, 5};
		int expResult = 5;
		int result = TaskSet.findMaximum(array);
		assertEquals(expResult, result);

		array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 99};
		expResult = 99;
		result = TaskSet.findMaximum(array);
		assertEquals(expResult, result);

		array = new int[]{1, 2, 3, 4, 5, 4, 3, 2, 1, 199, 8, 7, 4, 3, 1};
		expResult = 199;
		result = TaskSet.findMaximum(array);
		assertEquals(expResult, result);

		array = new int[]{7777, 2, 3, 4, 5, 4, 3, 2, 1, 199, 8, 7, 4, 3, 1};
		expResult = 7777;
		result = TaskSet.findMaximum(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of findMinimum method, of class TaskSet.
	 */
	@Test
	public void testFindMinimum() {
		System.out.println("findMinimum");
		int[] array = new int[]{9, 8, 7};
		int expResult = 7;
		int result = TaskSet.findMinimum(array);
		assertEquals(expResult, result);

		array = new int[]{1, 9, 8, 7};
		expResult = 1;
		result = TaskSet.findMinimum(array);
		assertEquals(expResult, result);

		array = new int[]{1, 9, 0, 8, 7};
		expResult = 0;
		result = TaskSet.findMinimum(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of findFirstIndexOfX method, of class TaskSet.
	 */
	@Test
	public void testFindFirstIndexOfX() {
		System.out.println("findFirstIndexOfX");
		int[] array = new int[]{9, 8, 7};
		int x = 9;
		int expResult = 0;
		int result = TaskSet.findFirstIndexOfX(array, x);
		assertEquals(expResult, result);

		array = new int[]{9, 8, 7, 6, 10, 12, 7, 8};
		x = 7;
		expResult = 2;
		result = TaskSet.findFirstIndexOfX(array, x);
		assertEquals(expResult, result);

		array = new int[]{9, 8, 7, 6, 10, 12, 10, 12, 12};
		x = 12;
		expResult = 5;
		result = TaskSet.findFirstIndexOfX(array, x);
		assertEquals(expResult, result);

		array = new int[]{9, 8, 7, 6, 10, 12, 10, 12, 12};
		x = 55;
		expResult = -1;
		result = TaskSet.findFirstIndexOfX(array, x);
		assertEquals(expResult, result);

	}

	/**
	 * Test of findLastIndexOfX method, of class TaskSet.
	 */
	@Test
	public void testFindLastIndexOfX() {
		System.out.println("findLastIndexOfX");
		int[] array = new int[]{9, 8, 7};
		int x = 9;
		int expResult = 0;
		int result = TaskSet.findLastIndexOfX(array, x);
		assertEquals(expResult, result);

		array = new int[]{9, 8, 7, 9};
		x = 9;
		expResult = 3;
		result = TaskSet.findLastIndexOfX(array, x);
		assertEquals(expResult, result);

		array = new int[]{1, 1, 1, 1};
		x = 1;
		expResult = 3;
		result = TaskSet.findLastIndexOfX(array, x);
		assertEquals(expResult, result);

		array = new int[]{1, 1, 1, 1};
		x = 4;
		expResult = -1;
		result = TaskSet.findLastIndexOfX(array, x);
		assertEquals(expResult, result);

	}

	/**
	 * Test of sumOfArray method, of class TaskSet.
	 */
	@Test
	public void testSumOfArray() {
		System.out.println("sumOfArray");
		int[] array = new int[]{1, 2, 3};;
		int expResult = 6;
		int result = TaskSet.sumOfArray(array);
		assertEquals(expResult, result);

		array = new int[]{1, 2, 3, 5};
		expResult = 11;
		result = TaskSet.sumOfArray(array);
		assertEquals(expResult, result);

		array = new int[]{0, 0, 0, 1, 2, 3, 5, 0, 0, 0, 0};
		expResult = 11;
		result = TaskSet.sumOfArray(array);
		assertEquals(expResult, result);

		array = new int[]{0, 0, 0, 0};
		expResult = 0;
		result = TaskSet.sumOfArray(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of sumOfPowers method, of class TaskSet.
	 */
	@Test
	public void testSumOfPowers() {
		System.out.println("sumOfPowers");
		int[] array = new int[]{1, 2};
		int expResult = 5;
		int result = TaskSet.sumOfPowers(array);
		assertEquals(expResult, result);

		array = new int[]{2, 2};
		expResult = 8;
		result = TaskSet.sumOfPowers(array);
		assertEquals(expResult, result);

		array = new int[]{0, 3, 4};
		expResult = 25;
		result = TaskSet.sumOfPowers(array);
		assertEquals(expResult, result);

		array = new int[]{0, 3, 4, 5};
		expResult = 50;
		result = TaskSet.sumOfPowers(array);
		assertEquals(expResult, result);

	}

	/**
	 * Test of doesAContainsAnyElmementFromB method, of class TaskSet.
	 */
	@Test
	public void testDoesAContainsAnyElmementFromB() {
		System.out.println("doesAContainsAnyElmementFromB");
		int[] a = new int[]{9, 8, 7};
		int[] b = new int[]{9, 8, 7};
		boolean expResult = true;
		boolean result = TaskSet.doesAContainsAnyElmementFromB(a, b);
		assertEquals(expResult, result);

		a = new int[]{9, 8, 7, 6, 5, 4};
		b = new int[]{0,0,4};
		expResult = true;
		result = TaskSet.doesAContainsAnyElmementFromB(a, b);
		assertEquals(expResult, result);

		a = new int[]{3,9, 8, 7, 6, 5, 4};
		b = new int[]{8,9,3};
		expResult = true;
		result = TaskSet.doesAContainsAnyElmementFromB(a, b);
		assertEquals(expResult, result);

		a = new int[]{3,9, 8, 7, 6, 5, 4};
		b = new int[]{0,0,3};
		expResult = true;
		result = TaskSet.doesAContainsAnyElmementFromB(a, b);
		assertEquals(expResult, result);

		a = new int[]{3,9, 8, 7, 6, 5, 4};
		b = new int[]{10,20,30};
		expResult = false;
		result = TaskSet.doesAContainsAnyElmementFromB(a, b);
		assertEquals(expResult, result);

	}

	/**
	 * Test of doesAcontainsAllElmementFromB method, of class TaskSet.
	 */
	@Test
	public void testDoesAcontainsAllElmementFromB() {
		System.out.println("doesAcontainsAllElmementFromB");
		int[] a = new int[]{9,8,7};
		int[] b = new int[]{9,8,7};
		boolean expResult = true;
		boolean result = TaskSet.doesAcontainsAllElmementFromB(a, b);
		assertEquals(expResult, result);
		
		a = new int[]{9,8,7,6,5,4};
		b = new int[]{9,8,7};
		expResult = true;
		result = TaskSet.doesAcontainsAllElmementFromB(a, b);
		assertEquals(expResult, result);
		
		a = new int[]{9,8,7,6,5,4};
		b = new int[]{6,5,4};
		expResult = true;
		result = TaskSet.doesAcontainsAllElmementFromB(a, b);
		assertEquals(expResult, result);
		
		a = new int[]{9,8,7,6,5,4};
		b = new int[]{4,6,9};
		expResult = true;
		result = TaskSet.doesAcontainsAllElmementFromB(a, b);
		assertEquals(expResult, result);
		
		
		a = new int[]{9,1,7,6,5,4};
		b = new int[]{4,6,9,3};
		expResult = false;
		result = TaskSet.doesAcontainsAllElmementFromB(a, b);
		assertEquals(expResult, result);
		
		
		a = new int[]{9,1,7,6,5,4};
		b = new int[]{55,4,6,9,7};
		expResult = false;
		result = TaskSet.doesAcontainsAllElmementFromB(a, b);
		assertEquals(expResult, result);
		
	}

	/**
	 * Test of reverse method, of class TaskSet.
	 */
	@Test
	public void testReverse() {
		System.out.println("reverse");
		int[] array =new int[]{9,8,7};
		int[] reverse = new int[]{7,8,9};
		TaskSet.reverse(array);
		Assert.assertArrayEquals(array,reverse);
		
		array =new int[]{1};
		reverse = new int[]{1};
		TaskSet.reverse(array);
		Assert.assertArrayEquals(array,reverse);
		
		array =new int[]{1,2};
		reverse = new int[]{2,1};
		TaskSet.reverse(array);
		Assert.assertArrayEquals(array,reverse);
		
		array =new int[]{1,2,3,4,5,6,7,8,9};
		reverse = new int[]{9,8,7,6,5,4,3,2,1};
		TaskSet.reverse(array);
		Assert.assertArrayEquals(array,reverse);
		
	}

	/**
	 * Test of sortAscending method, of class TaskSet.
	 */
	@Test
	public void testSortAscending() {
		System.out.println("sortAscending");
		int[] array = new int[]{1,2,3};
		int[] expResult = new int[]{1,2,3};
		int[] result = TaskSet.sortAscending(array);
		assertArrayEquals(expResult, result);
		
		array = new int[]{5,4,3,2};
		expResult = new int[]{2,3,4,5};
		result = TaskSet.sortAscending(array);
		assertArrayEquals(expResult, result);
		
		array = new int[]{1};
		expResult = new int[]{1};
		result = TaskSet.sortAscending(array);
		assertArrayEquals(expResult, result);
		
		array = new int[]{1,10,5,3,8};
		expResult = new int[]{1,3,5,8,10};
		result = TaskSet.sortAscending(array);
		assertArrayEquals(expResult, result);
		
	}

	/**
	 * Test of sortDescending method, of class TaskSet.
	 */
	@Test
	public void testSortDescending() {
		System.out.println("sortDescending");
		int[] array = new int[]{9,8,7};
		int[] expResult = new int[]{9,8,7};
		int[] result = TaskSet.sortDescending(array);
		assertArrayEquals(expResult, result);
		
		array = new int[]{1,2,3};
		expResult = new int[]{3,2,1};
		result = TaskSet.sortDescending(array);
		assertArrayEquals(expResult, result);
		
		
		array = new int[]{8,5,6,4};
		expResult = new int[]{8,6,5,4};
		result = TaskSet.sortDescending(array);
		assertArrayEquals(expResult, result);
		
		array = new int[]{8};
		expResult = new int[]{8};
		result = TaskSet.sortDescending(array);
		assertArrayEquals(expResult, result);
		
	}

	/**
	 * Test of containsOnlyEven method, of class TaskSet.
	 */
	@Test
	public void testContainsOnlyEven() {
		System.out.println("containsOnlyEven");
		int[] array = new int[]{9,8,7};
		boolean expResult = false;
		boolean result = TaskSet.containsOnlyEven(array);
		assertEquals(expResult, result);
		
		array = new int[]{10,8,6};
		expResult = true;
		result = TaskSet.containsOnlyEven(array);
		assertEquals(expResult, result);
		
		array = new int[]{2};
		expResult = true;
		result = TaskSet.containsOnlyEven(array);
		assertEquals(expResult, result);
		
		array = new int[]{1,2,4,8};
		expResult = false;
		result = TaskSet.containsOnlyEven(array);
		assertEquals(expResult, result);
		
		array = new int[]{2,4,8,1};
		expResult = false;
		result = TaskSet.containsOnlyEven(array);
		assertEquals(expResult, result);
		
	}

	/**
	 * Test of containsOnlyPrime method, of class TaskSet.
	 */
	@Test
	public void testContainsOnlyPrime() {
		System.out.println("containsOnlyPrime");
		int[] array = new int[]{1,2,3};
		boolean expResult = true;
		boolean result = TaskSet.containsOnlyPrime(array);
		assertEquals(expResult, result);
		
		array = new int[]{1,2,3,4};
		expResult = false;
		result = TaskSet.containsOnlyPrime(array);
		assertEquals(expResult, result);
		
		array = new int[]{857,859,709,701};
		expResult = true;
		result = TaskSet.containsOnlyPrime(array);
		assertEquals(expResult, result);
		
		array = new int[]{4,857,859,709,701};
		expResult = false;
		result = TaskSet.containsOnlyPrime(array);
		assertEquals(expResult, result);
		
		array = new int[]{857,859,709,701,16};
		expResult = false;
		result = TaskSet.containsOnlyPrime(array);
		assertEquals(expResult, result);
	}

	/**
	 * Test of notPrimeReplaceByNearestPrime method, of class TaskSet.
	 */
	@Test
	public void testNotPrimeReplaceByNearestPrime() {
		System.out.println("notPrimeReplaceByNearestPrime");
		int[] array = new int[]{1,2,3};
		int[] expResult = new int[]{1,2,3};
		int[] result = TaskSet.notPrimeReplaceByNearestPrime(array);
		Assert.assertArrayEquals(expResult, result);
		
		array = new int[]{1,2,3,4};
		expResult = new int[]{1,2,3,5};
		result = TaskSet.notPrimeReplaceByNearestPrime(array);
		Assert.assertArrayEquals(expResult, result);
		
		array = new int[]{2,3,4,5};
		expResult = new int[]{2,3,5,5};
		result = TaskSet.notPrimeReplaceByNearestPrime(array);
		Assert.assertArrayEquals(expResult, result);
		
		array = new int[]{10};
		expResult = new int[]{11};
		result = TaskSet.notPrimeReplaceByNearestPrime(array);
		Assert.assertArrayEquals(expResult, result);
		
		array = new int[]    {10,11,12,13,14,15};
		expResult = new int[]{11,11,13,13,17,17};
		result = TaskSet.notPrimeReplaceByNearestPrime(array);
		Assert.assertArrayEquals(expResult, result);
		
	}

	/**
	 * Test of returnManhattonDistanceOfTwoPoints method, of class TaskSet.
	 */
	@Test
	public void testReturnManhattonDistanceOfTwoPoints() {
		System.out.println("returnManhattonDistanceOfTwoPoints");
		int[] a = new int[]{1};
		int[] b = new int[]{0};
		int expResult = 1;
		int result = TaskSet.returnManhattonDistanceOfTwoPoints(a, b);
		assertEquals(expResult, result);
		
		a = new int[]{1,0,0};
		b = new int[]{0,0,0};
		expResult = 1;
		result = TaskSet.returnManhattonDistanceOfTwoPoints(a, b);
		assertEquals(expResult, result);
		
		a = new int[]{1,0,0};
		b = new int[]{0,2,3};
		expResult = 6;
		result = TaskSet.returnManhattonDistanceOfTwoPoints(a, b);
		assertEquals(expResult, result);
		
		a = new int[]{1,0,0,0,0,4,3};
		b = new int[]{0,2,3,0,0,4,3};
		expResult = 6;
		result = TaskSet.returnManhattonDistanceOfTwoPoints(a, b);
		assertEquals(expResult, result);
		
	}

}
