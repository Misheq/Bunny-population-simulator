package unitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bussiness_code.Bunny;
import bussiness_code.FurColor;

public class BunnyTest {

	Bunny testBunny;

	@Before
	public void before() {
		testBunny = new Bunny("segg");
	}

	@After
	public void after() {
		testBunny = null;
	}

	@Test
	public void testSex() {
		if (testBunny.isMale()) {
			assertEquals("Sex should match", true, testBunny.isMale());
		} else {
			assertEquals("Sex should match", false, testBunny.isMale());
		}
	}

	@Test
	public void testColor() {
		FurColor color = this.testBunny.getColor();
		switch (color) {
		case black:
			assertEquals("Color should match", FurColor.black, color);
			break;
		case white:
			assertEquals("Color should match", FurColor.white, color);
			break;
		case spotted:
			assertEquals("Color should match", FurColor.spotted, color);
			break;
		case brown:
			assertEquals("Color should match", FurColor.brown, color);
			break;
		default:
			fail("Wrong color");
			break;
		}
	}

	@Test
	public void testAge() {
		int age = this.testBunny.getAge();
		assertTrue("Age should match", 0 <= age && age <= 10);
	}

}
