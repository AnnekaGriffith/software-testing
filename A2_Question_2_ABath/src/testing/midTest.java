package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class midTest {
	TestMe test1;
	public void setup(){ 
		 test1 = new TestMe();
	}
	
	void test1() { //fixture	
		int output = test1.mid(1, 2, 3);//test case
		assertEquals(2, output); //test oracle
	}
	
	void test2() { //fixture
		int output = test1.mid(2, 1, 3);//test case
		assertEquals(2, output);//test oracle
	}	
	void test3() { //fixture	
		int output = test1.mid(1, 3, 1);//test case
		assertEquals(1, output);//test oracle
	}
	void test4() { //fixture
		
		int output = test1.mid(2, 3, 1);//test case
		assertEquals(2, output);//test oracle
	}	
	void test5() { //fixture	
		int output = test1.mid(1, 1, 1);//test case
		assertEquals(1, output);//test oracle
	}

}
