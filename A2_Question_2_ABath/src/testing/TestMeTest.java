package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMeTest { //fixture
	TestMe test1;
	int output;
	@BeforeEach
	public void setUp()  { //fixture
		test1 = new TestMe();
		//int output;
		
	}

	@AfterEach
	void tearDown()  {// fixture
	}

	@Test
	void test1() { //fixture	
		output = test1.mid(1, 2, 3);//test case
		assertEquals(2, output); //test oracle
	
		output = test1.mid(2, 1, 3);//test case
		assertEquals(2, output);//test oracle
	
		output = test1.mid(1, 3, 1);//test case
		assertEquals(1, output);//test oracle

		output = test1.mid(2, 3, 1);//test case
		assertEquals(2, output);//test oracle

		output = test1.mid(1, 1, 1);//test case
		assertEquals(1, output);//test oracle
	}

}
