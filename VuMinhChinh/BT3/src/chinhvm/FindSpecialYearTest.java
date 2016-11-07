package chinhvm;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FindSpecialYearTest {
	@Test
	public void checkDUPathCount() {
		FindSpecialYear case1 = new FindSpecialYear(1500, 1600);
		assertEquals(34, case1.findYear());
		
		FindSpecialYear case2 = new FindSpecialYear(1997, 1998);
		assertEquals(0, case2.findYear());
	}
	
	@Test
	public void checkDUPathi() {
		FindSpecialYear case1 = new FindSpecialYear(1550, 1600);
		assertEquals(18, case1.findYear());
		
		FindSpecialYear case2 = new FindSpecialYear(1550, 1550);
		assertEquals(0, case2.findYear());
	}
	
	@Test
	public void checkDUPathY1AndY2() {
		FindSpecialYear case1 = new FindSpecialYear(1570, 1600);
		assertEquals(11, case1.findYear());
		
		FindSpecialYear case2 = new FindSpecialYear(1997, 1997);
		assertEquals(0, case2.findYear());
	}
}
