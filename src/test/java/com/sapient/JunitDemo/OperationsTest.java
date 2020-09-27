package com.sapient.JunitDemo;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class OperationsTest 
{
    /**
     * Rigorous Test :-)
     */
	Operations obj;
	@Before
	public void runBefore() {
		System.out.println("Before the test");
		obj = new Operations();
	}
    @Test
    public void checkAdd()
    {
        assertEquals(obj.add(5, 10),15);
    }
    
    @Test
    public void checkSub()
    {
        assertEquals(obj.sub(10, 5),5);
    }
    
	@After
	public void runAfter() {
		System.out.println("After the test");
	}
}
