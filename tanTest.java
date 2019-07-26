package test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import main.Tan;

/**
 * This is the test class for tangent class
 * @author Hetvi
 *
 */
public class tanTest {

	Tan tan;
	
	/**
	 * This is before method which executes before every test method.
	 */
	@Before
	public void before() {
		tan = new Tan();
	}
	
	/**
	 * This method tests power method for integer number.
	 */
	@Test
	public void testPower() {
		double result = tan.power(3, 3);
		System.out.println("Power result :" + result);
		assertTrue(result == 27.0);
	}
	
	/**
	 * This method tests power method for Real number.
	 */
	@Test
	public void testPower1() {
		double result = tan.power(2.1, 3);
		System.out.println("Power result :" + result);
		assertTrue(result == 9.261);
	}
	
	/**
	 * This method tests factorial method that it is properly working or not.
	 */
	@Test
	public void testFact() {
		double result = tan.fact(3);
		assertTrue(result== 6);
	}
	
	/**
	 * This method tests factorial method that it is properly working or not.
	 */
	@Test
	public void testFact1() {
		double result = tan.fact(1);
		assertTrue(result== 1);
	}
	
	/**
	 * This method tests sin method that it is properly working or not.
	 */
	@Test
	public void testSinf() {
		double result = tan.sinf(30);
		assertTrue(result==0.5);
	}
	
	/**
	 * This method tests cosine method that it is properly working or not.
	 */
	@Test
	public void testCosf() {
		double result = tan.cosf(30);
		assertTrue(result == 0.86602);
	}
	
	/**
	 * This method tests sine method that it is properly working or not.
	 */
	@Test
	public void testSinf1() {
		double result = tan.sinf(45);
		assertTrue(result==0.70711);
	}
	
	/**
	 * This method tests cosine method that it is properly working or not.
	 */
	@Test
	public void testCosf1() {
		double result = tan.cosf(45);
		assertTrue(result == 0.70711);
	}
	
	/**
	 * This method tests tangent method that it is properly working or not.
	 */
	@Test
	public void testTanf() {
		double result = tan.tanf(45);
		assertTrue(result == 1);
	}
	
	/**
	 * This method tests tangent method that it is properly working or not.
	 */
	@Test
	public void testTanf1() {
		double result = tan.tanf(30);
		assertTrue(result == 0.57735);
	}
	
	/**
	 * This method tests the validation method that it is in its domain or not.
	 */
	@Test
	public void testValidateValue()
	{
		boolean result = tan.validateValue(90);
		assertFalse(result);
	}
	
	/**
	 * This method tests the validation method that it is in its domain or not.
	 */
	@Test
	public void testValidateValue1()
	{
		boolean result = tan.validateValue(-270);
		assertFalse(result);
	}
	
	/**
	 * This method tests the validation method that it is in its domain or not.
	 */
	@Test
	public void testValidateValue2()
	{
		boolean result = tan.validateValue(180);
		assertTrue(result);
	}
	
}
