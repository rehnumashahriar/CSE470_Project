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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author User
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({com.javatpoint.DBIntializerTest.class, com.javatpoint.CreateServletTest.class, com.javatpoint.verifyLogin3Test.class, com.javatpoint.verifyLogin1Test.class, com.javatpoint.RegisterUserTest.class, com.javatpoint.DetailsTest.class, com.javatpoint.verifyLogin2Test.class, com.javatpoint.verifyLoginforcustadminTest.class, com.javatpoint.RegisterUser2Test.class, com.javatpoint.MyListenerTest.class, com.javatpoint.GetConTest.class, com.javatpoint.VerifyLoginforcustadmin1Test.class, com.javatpoint.RegisterUser1Test.class})
public class JavatpointSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
