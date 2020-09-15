package Homework5;

import static org.junit.Assert.assertEquals;
import org.easymock.EasyMock;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem5ClassTest {

	double cart;
	Problem5ServerData mockobj;
	Problem5Class prb5;
	
	@Before
	public void setUp() {
		prb5 = new Problem5Class();
		mockobj = EasyMock.strictMock(Problem5ServerData.class);
	}
	
	@Test
	@FileParameters("src/CSV_files/Problem5TestCaseTable.csv")
	public void test (int testCaseNumber, double cart, boolean loyaltyCard, boolean validCode, boolean validDigitalCoupon, double expOut, String bPath, String MCDC) {
		EasyMock.expect(mockobj.getCart()).andReturn(cart);
		EasyMock.replay(mockobj);
		assertEquals(expOut,prb5.calcCart(mockobj, loyaltyCard, validCode, validDigitalCoupon),0.01);
	}
}