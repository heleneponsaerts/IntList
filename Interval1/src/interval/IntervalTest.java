package interval;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {

	
	
	@Test
	void test() {
		Interval interval = new Interval(3,4,false);
		
		interval.setUpperBound(8);
		assert interval.getLowerBound() == 3;
		
	}
}
