package test;
import static org.junit.Assert.*;

import org.junit.Test;

import main.ClassToTest;

/**
 * Dies ist ein Komponententest
 * @author MSI-Dan
 *
 */
public class TestAddHello {

	@Test
	public void test() {
		ClassToTest cls = new ClassToTest();
		String a="Tsch�ss";
		String result = cls.addHello(a);
		assertEquals(a+"Hello1", result);
	}

}
