package com.ramvarra;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addTest()
    {
        App app = new App();
        assertEquals(12, app.add(10, 2));
    }

    @Test
    public void mulTest()
    {
        App app = new App();
        assertEquals(20, app.mul(10, 2));
    }
}
