package Homework5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem4ClassTest {

	Problem4Class prb4;
	
	@Before
	public void setUp() throws Exception {
		prb4 = new Problem4Class();
	}

	@FileParameters("src/CSV_files/Problem4TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, double cart, boolean validCode, boolean validDigitalCoupon, boolean loyaltyCard, double expOut, String bPath, String MCDC) {
		assertEquals(expOut, prb4.calcCart(cart, loyaltyCard, validCode, validDigitalCoupon),0.01);
	}
}