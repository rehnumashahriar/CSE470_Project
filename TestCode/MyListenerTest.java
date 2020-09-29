/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class MyListenerTest {
    
    public MyListenerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of contextInitialized method, of class MyListener.
     */
    @Test
    public void testContextInitialized() {
        System.out.println("contextInitialized");
        ServletContextEvent arg0 = null;
        MyListener instance = new MyListener();
        instance.contextInitialized(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contextDestroyed method, of class MyListener.
     */
    @Test
    public void testContextDestroyed() {
        System.out.println("contextDestroyed");
        ServletContextEvent arg0 = null;
        MyListener instance = new MyListener();
        instance.contextDestroyed(arg0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
