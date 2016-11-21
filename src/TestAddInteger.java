import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddInteger {

	@Test
	public void test() {
		ClassToTest cls = new ClassToTest();
		int result= cls.addTwoIntegers(2, 3);
		assertEquals(5,result);
	}

}
