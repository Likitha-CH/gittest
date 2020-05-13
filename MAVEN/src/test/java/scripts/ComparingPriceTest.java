package scripts;

import org.testng.annotations.Test;

import generic.BaseTest;

public class ComparingPriceTest extends BaseTest
{
	@Test
	public void ComparePrice()
	{
		amazon.searchproduct("IPHONE XR 64GB YELLOW");
	}

}

