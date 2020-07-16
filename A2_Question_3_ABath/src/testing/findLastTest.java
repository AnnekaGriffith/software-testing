package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class findLastTest {

	@Test
	void test() {
		
//JUnit test for part (b) fault not executed;
		TestMe test1 = new TestMe();
		int [] arry1 = new int[0];
		int output1 = test1.findLast(arry1, 2);
		assertEquals(-1, output1);
		

		
//JUnit test for part (d) not a failure but result is an error;
		TestMe test2 = new TestMe();
		int [] arry2 = new int[3];
		arry2 [0] = 3;
		arry2 [1] = 3;
		arry2 [2] = 5;
		
		int output2 = test2.findLast(arry2, 3);
		//int output3 = test2.findLast(arry2, 3);
		assertEquals(1, output2);
		//assertEquals(0, output3); // results in error
		
//JUnit test for part (f) fixed code no error;
		TestMe test3 = new TestMe();
		int [] arry3 = new int[3];
		arry3 [0] = 2;
		arry3 [1] = 3;
		arry3 [2] = 5;
		
		int output4 = test3.findLastFixed(arry3, 2);
		assertEquals(0, output4);
		
		
	}
}
