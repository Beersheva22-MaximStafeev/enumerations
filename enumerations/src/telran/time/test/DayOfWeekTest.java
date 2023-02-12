package telran.time.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import telran.time.DayOfWeek;

class DayOfWeekTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void valuesTest() {
		DayOfWeek[] array = DayOfWeek.values();
		assertEquals(DayOfWeek.SUN, array[0]);
		assertEquals(7, array.length);
	}

	@Test
	void plusDaysTest() {
		assertEquals(DayOfWeek.THU, DayOfWeek.THU.plusDays(700));
		assertEquals(DayOfWeek.THU, DayOfWeek.TUE.plusDays(2));
	}
	
	@Test
	void minusDaysTest() {
		assertEquals(DayOfWeek.THU, DayOfWeek.THU.minusDays(700));
		assertEquals(DayOfWeek.SHABBAT, DayOfWeek.TUE.minusDays(3));
	}
	
	@Test
	void betweenTest() {
		assertEquals(4, DayOfWeek.between(DayOfWeek.THU, DayOfWeek.MON));
		assertEquals(3, DayOfWeek.between(DayOfWeek.MON, DayOfWeek.THU));
		assertEquals(7, DayOfWeek.between(DayOfWeek.SHABBAT, DayOfWeek.SHABBAT));
	}
}
