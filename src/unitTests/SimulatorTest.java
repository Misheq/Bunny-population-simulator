package unitTests;

import java.util.ArrayList;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bussiness_code.Bunny;

public class SimulatorTest {

	Bunny testBunny;
	List<Bunny> testBunnyList;

	@Before
	public void setUp() throws Exception {
		this.testBunny = new Bunny("init");
		this.testBunnyList = new ArrayList<>();
	}

	@After
	public void tearDown() throws Exception {
		this.testBunny = null;
		this.testBunnyList = null;
	}

	@Test
	public void testInitialBunnies() {
		//initialBunnies();
	}

}
