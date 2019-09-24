package test;

import static org.junit.Assert.*;
import main.LeapYear;

import org.junit.Before;
import org.junit.Test;

public class LeapYearTest {

	LeapYear lp;

	@Before
	public void initializeLeapYear()
	{
		lp=new LeapYear();
	}

	@Test
	public void testDivisibleBy4_YearsLessThan100()
	{
		assertFalse(isLeap(10));
		assertTrue(isLeap(88));
	}

	@Test
	public void testDivisibleBy4NotDivisibleby100_YearsBetween100to399()
	{
		assertFalse(isLeap(200));
		assertTrue(isLeap(248));
	}

	@Test
	public void testDivisibleBy4Divisibleby100Divisibleby400_Years400AndAbove()
	{
		assertTrue(isLeap(800));
		assertFalse(isLeap(700));
	}

	private boolean isLeap(int year)
	{
		return lp.isLeapYear(year);
	}


}
