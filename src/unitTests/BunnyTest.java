package unitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bussiness_code.Bunny;

public class BunnyTest {

	Bunny testBunny;

	@Before
	public void before() {
		testBunny = new Bunny("Bela", "brown", 'M', 2, false);
	}

	@After
	public void after() {
		testBunny = null;
	}

	@Test
	public void testName() {
		String name = testBunny.getName();
		assertEquals("Name should match", "Bela", name);
	}

	@Test
	public void testColor() {
		String color = testBunny.getColor();
		assertEquals("Color should match", "brown", color);
	}

	@Test
	public void testAge() {
		int age = testBunny.getAge();
		assertEquals("Age should match", 2, age);
	}

	@Test
	public void testSex() {
		char sex = testBunny.getSex();
		assertEquals("Sex should match", 'M', sex);
	}

	@Test
	public void testIsVampire() {
		boolean isVampire = testBunny.isVampire();
		assertFalse("IsVampire should be false", isVampire);
	}

}
