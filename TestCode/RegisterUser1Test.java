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
public class RegisterUser1Test {
    
    public RegisterUser1Test() {
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
     * Test of register1 method, of class RegisterUser1.
     */
    @Test
    public void testRegister1() {
        System.out.println("register1");
        String username = "";
        String password = "";
        String repassword = "";
        double phone = 0.0;
        String adderess = "";
        String syd = "";
        int expResult = 0;
        int result = RegisterUser1.register1(username, password, repassword, phone, adderess, syd);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
