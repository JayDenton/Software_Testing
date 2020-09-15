package Homework5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem1ClassTest {

	Problem1Class prb1;
	
	@Before
	public void setUp() throws Exception {
		prb1 = new Problem1Class();
	}

	@FileParameters("src/CSV_files/Problem1TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, boolean cruiseEngaged, double speed, double distance, boolean expEmerBrake, int expPulseCount,String MCDC) {
		prb1.emerBrakeFunction(cruiseEngaged, speed, distance);
		assertEquals(expEmerBrake,prb1.isEmerBrake());
		assertEquals(expPulseCount,prb1.getPulseCount());
	}
}