import java.util.Arrays;
import java.util.Collection;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class DateNextDateOkTest {

	private final int year;
	private final int month;
	private final int day;
	private final int expectedYear;
	private final int expectedMonth;
	private final int expectedDay;

	public DateNextDateOkTest(int year, int month, int day, int expectedYear, int expectedMonth,
			int expectedDay) {
		this.year = year;
		this.month = month;
		this.day = day;
		this.expectedYear = expectedYear;
		this.expectedMonth = expectedMonth;
		this.expectedDay = expectedDay;
	}

	@Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{ 1700, 6, 20, 1700, 6, 21 },
			{ 2005, 4, 15, 2005, 4, 16 },
			{ 1901, 7, 20, 1901, 7, 21 },
			{ 3456, 3, 27, 3456, 3, 28 },
			{ 1500, 2, 17, 1500, 2, 18 },
			{ 1700, 6, 29, 1700, 6, 30 },
			{ 1800, 11, 29, 1800, 11, 30 },
			{ 3453, 1, 29, 3453, 1, 30 },
			{ 444, 2, 29, 444, 3, 1 },
			{ 2005, 4, 30, 2005, 5, 1 },
			{ 3453, 1, 30, 3453, 1, 31 },
			{ 3456, 3, 30, 3456, 3, 31 },
			{ 1901, 7, 31, 1901, 8, 1 },
			{ 3453, 1, 31, 3453, 2, 1 },
			{ 3456, 12, 31, 3457, 1, 1 }
		});
	}

	@Test
	public void nextDateReturnsExpectedDate() {
		Date actualDate = new Date(year, month, day);
		Date expectedDate = new Date(expectedYear, expectedMonth, expectedDay);
		Assert.assertEquals(expectedDate, actualDate.nextDate());
	}

}