package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest2 {
	
	@Test
	public void sum()
	{
		System.out.println("sum");
		int a=10;
		int b=20;
		Assert.assertEquals(a+b, 30);
	}
	
	@Test
	public void sub()
	{
		System.out.println("sub");
		int a=10;
		int b=20;
		Assert.assertEquals(a-b, -10);
	}
	
	@Test
	public void div()
	{
		System.out.println("div");
		int a=10;
		int b=20;
		Assert.assertEquals(b/a, 2);
	}
	
	
	
	@Test
	public void mul()
	{
		System.out.println("mul");
		int a=10;
		int b=20;
		Assert.assertEquals(a*b, 200);
	}

}
