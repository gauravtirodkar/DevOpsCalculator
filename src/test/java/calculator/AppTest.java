package calculator;

import static org.junit.Assert.assertTrue;

import org.junit.Test;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	@Test
	    public void test_squareRoot() {
	        double a = 36.0;
	        double expectedResult = 6.0;
	        double result = App.squareRoot(a);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
	@Test
	    public void test_factorial() {
	        int a = 7;
	        int expectedResult = 5040;
	        int result = App.factorial(a);
	        Assert.assertEquals(expectedResult, result);
	    }
		
	@Test
	    public void test_naturalLog() {
	        double a = 2.718;
	        double expectedResult = 1.0;
	        double result = App.naturalLog(a);
	        Assert.assertEquals(expectedResult, result, 0.2f);
	    }
	
	@Test
	    public void test_power() {
	        double a = 5.0;
			double b = 2.0;
	        double expectedResult = 32.0;
	        double result = App.power(a,b);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
}
