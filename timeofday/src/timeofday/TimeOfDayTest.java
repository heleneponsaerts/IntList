package timeofday;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {
	
	

	@Test
	void test() {
		TimeOfDay myTimeOfDay = new TimeOfDay();
		assert TimeOfDay.getHours() == 0;
		assert TimeOfDay.getMinutes() == 0;
		TimeOfDay.setHours(12);
		TimeOfDay.setMinutes(45);
		assert TimeOfDay.getHours() == 12;
		assert TimeOfDay.getMinutes() == 0;
		assert myTimeOfDay.getMinutes() == 45;
	}

}
