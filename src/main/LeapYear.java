package main;

public class LeapYear {

	public boolean isLeapYear(int year)
	{
		if (year%4==0)
		{
			if (year%100==0)
				return false;
			else
				return true;
		}
		else
			return false;
	}

}
