package finished;

import static org.junit.Assert.*;

import org.junit.Test;

public class RatNumTest {

	private static void represent(int numer, int denom, String result) {
		RatNum r = new RatNum(numer, denom);
		RatNumPrimes rp = new RatNumPrimes(numer, denom);
		
		assertEquals(result, r.toString());
		assertEquals(result, rp.toString());
	}
	
	private static void multiply(int numer1, int denom1, int numer2, int denom2, String result) {
		RatNum r1 = new RatNum(numer1, denom1), r2 = new RatNum(numer2, denom2);
		RatNumPrimes rp1 = new RatNumPrimes(numer1, denom1), rp2 = new RatNumPrimes(numer2, denom2);
		
		RatNum res = r1.multiply(r2);
		RatNumPrimes resp = rp1.multiply(rp2);
		
		assertEquals(result, res.toString());
		assertEquals(result, resp.toString());
	}
	
	@Test
	public void testRepresent() {
		represent(5, 1, "5");
		represent(1, 2, "1/2");
		represent(8, 6, "4/3");
		represent(-7, 2, "-7/2");
		represent(-34, 56, "-17/28");
	}
	
	@Test
	public void testMultiply() {
		multiply(5, 1, 6, 1, "30");
		multiply(1, 2, 2, 1, "1");
		multiply(4, 3, 56, 129, "224/387");
		multiply(3, 2, 2, 9, "1/3");
		multiply(8, -25, 5, 2, "-4/5");
	}

}
