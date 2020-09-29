/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.javatpoint;

import java.rmi.RemoteException;
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
public class DetailsTest {
    
    public DetailsTest() {
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
     * Test of open method, of class Details.
     */
    @Test
    public void testOpen() throws Exception {
        System.out.println("open");
        String username = "";
        String password = "";
        double amount = 0.0;
        String adderess = "";
        double phone = 0.0;
        Details instance = new DetailsImpl();
        int expResult = 0;
        int result = instance.open(username, password, amount, adderess, phone);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of withdraw method, of class Details.
     */
    @Test
    public void testWithdraw() throws Exception {
        System.out.println("withdraw");
        int acno = 0;
        String uname = "";
        String pwd = "";
        int amt = 0;
        Details instance = new DetailsImpl();
        String expResult = "";
        String result = instance.withdraw(acno, uname, pwd, amt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of deposit method, of class Details.
     */
    @Test
    public void testDeposit() throws Exception {
        System.out.println("deposit");
        int acno = 0;
        String uname = "";
        String pwd = "";
        int amt = 0;
        Details instance = new DetailsImpl();
        String expResult = "";
        String result = instance.deposit(acno, uname, pwd, amt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of transfer method, of class Details.
     */
    @Test
    public void testTransfer() throws Exception {
        System.out.println("transfer");
        int acno = 0;
        String uname = "";
        String pwd = "";
        int tacno = 0;
        int amt = 0;
        Details instance = new DetailsImpl();
        String expResult = "";
        String result = instance.transfer(acno, uname, pwd, tacno, amt);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of close method, of class Details.
     * @throws java.lang.Exception
     */
    @Test
    public void testClose() throws Exception {
        System.out.println("close");
        int acno = 0;
        String uname = "";
        String pass = "";
        Details instance = new DetailsImpl();
        String expResult = "";
        String result = instance.close(acno, uname, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of balance method, of class Details.
     */
    @Test
    public void testBalance() throws Exception {
        System.out.println("balance");
        int acno = 0;
        String uname = "";
        String pass = "";
        Details instance = new DetailsImpl();
        String expResult = "";
        String result = instance.balance(acno, uname, pass);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DetailsImpl implements Details {

        public int open(String username, String password, double amount, String adderess, double phone) throws RemoteException {
            return 0;
        }

        public String withdraw(int acno, String uname, String pwd, int amt) throws RemoteException {
            return "";
        }

        public String deposit(int acno, String uname, String pwd, int amt) throws RemoteException {
            return "";
        }

        public String transfer(int acno, String uname, String pwd, int tacno, int amt) throws RemoteException {
            return "";
        }

        public String close(int acno, String uname, String pass) throws RemoteException {
            return "";
        }

        public String balance(int acno, String uname, String pass) throws RemoteException {
            return "";
        }
    }
    
}
