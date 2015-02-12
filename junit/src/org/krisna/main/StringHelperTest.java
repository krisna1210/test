package org.krisna.main;
import static org.junit.Assert.*;
/*import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
*/
import java.util.Arrays;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class StringHelperTest {

	static StringHelper helper;
	@BeforeClass
	public static void beforeClass() {
		//System.out.println("Before Class Running");
	}
	@AfterClass
	public static void afterClass() {
		//System.out.println("After Class Running");
		helper=null;
	}
	@Before
	public void before() {
		helper = new StringHelper();
	}
	@After
	public void after() {
		System.gc();
	}
	@Test
	public void testtruncateA() {
		assertEquals("AATT", helper.truncateA("AAAATT"));
	}
	@Test
	public void testFirstAndLast() {
		assertFalse(helper.FirstAndLast("a"));
		assertTrue(helper.FirstAndLast("acac"));
		
	}
	
	@Test
	public void testArraySort() {
		int[] num = {3,2,4};
		Arrays.sort(num);
		int[] expOut = {2,3,4};
		assertArrayEquals(expOut,num);
	}
	@Test(expected=NullPointerException.class)
	public void testArraySortException() {
		int[] num = null;
		Arrays.sort(num);
		int[] expOut = {2,3,4};
		assertArrayEquals(expOut,num);
	}
	@Test(timeout=500)
	public void testArraySortPerformance() {
		for(int i=0;i<1000000;i++){
			int[] num = {i,i+1,i-1};
			Arrays.sort(num);
		}
	}
}
