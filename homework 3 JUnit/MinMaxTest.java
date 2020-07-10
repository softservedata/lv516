package homework3;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.Assert;

public class MinMaxTest {
	
	@Test
	public void testLargest() {
		MinMax minmax = new MinMax(1, 2, 3);
		int expected = 3;
		int actual;
		
		actual = minmax.largest();
		Assert.assertEquals(expected, actual);
		
		System.out.println("Ok");
	}

	@Test
	public void testSmallest() {
		MinMax minmax = new MinMax(4, 5, 6);
		int expected = 4;
		int actual;
		
		actual = minmax.smallest();
		Assert.assertEquals(expected, actual);
		
		System.out.println("Ok");
	}

}
