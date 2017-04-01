package unitTests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bussiness_code.Bunny;
import bussiness_code.FurColor;
import bussiness_code.Gender;

public class BunnyTest {

	Bunny testBunny;

	@Before
	public void before() {
		testBunny = new Bunny();
	}

	@After
	public void after() {
		testBunny = null;
	}

	@Test
	public void testSex() {
		Gender sex = testBunny.getSex();
		switch (sex) {
		case Male:
			assertEquals("Sex should match", Gender.Male, sex);
			break;
		case Female:
			assertEquals("Sex should match", Gender.Female, sex);
			break;
		default:
			fail("Wrong gender");
			break;
		}
	}

	@Test
	public void testColor() {
		FurColor color = testBunny.getColor();
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
		int age = testBunny.getAge();
		assertTrue("Age should match", 0 <= age && age <= 10);
	}

}
