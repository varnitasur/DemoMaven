package Testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class countBTest {

	@Test
	public void test() {
		
		JunitTest test= new JunitTest();
		int output=test.countB("alphabet");
		assertEquals(1,output);
		
	}

}
