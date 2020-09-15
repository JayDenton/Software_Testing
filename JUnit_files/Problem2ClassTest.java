package Homework5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem2ClassTest {

	Problem2Class prb2;
	
	@Before
	public void setUp() throws Exception {
		prb2 = new Problem2Class();
	}

	@FileParameters("src/CSV_files/Problem2TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, int boxInCarNum, int rrCarNum, int shipmentNum, int expBoxSum, String bPath,String comments) {
		assertEquals(expBoxSum,prb2.calcPrevBoxNumber(boxInCarNum, rrCarNum, shipmentNum));
	}
}