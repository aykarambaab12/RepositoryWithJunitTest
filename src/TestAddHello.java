import static org.junit.Assert.*;

import org.junit.Test;

public class TestAddHello {

	@Test
	public void test() {
		ClassToTest cls = new ClassToTest();
		String a="Tsch�ss";
		String result = cls.addHello(a);
		assertEquals(a+"Hello", result);
	}

}
