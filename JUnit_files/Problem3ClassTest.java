package Homework5;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class Problem3ClassTest {

	Problem3Class prb3;
	
	@Before
	public void setUp() throws Exception {
		prb3 = new Problem3Class();
	}

	@FileParameters("src/CSV_files/Problem3TestCaseTable.csv")
	@Test
	public void test (int testCaseNo, Problem3Class.state currentState,Problem3Class.state nextState, int D, int G, int P, int Z, int expB, int expI, int expT, int expX) {
		prb3.operateBinoculars(currentState, D, G, P, Z);
		assertEquals(expB, prb3.getB());
		assertEquals(expI, prb3.getI());
		assertEquals(expT, prb3.getT());
		assertEquals(expX, prb3.getX());
		assertEquals(nextState,prb3.getNextState());
		
	}
}