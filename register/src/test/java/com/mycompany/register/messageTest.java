/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.register;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author lesed
 */
public class messageTest {
    
    public messageTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of checkMessageID method, of class message.
     */
    @Test
    public void testCheckMessageID() {
        System.out.println("checkMessageID");
        message instance = new message(1, "recipientName", "messageBody");
        boolean expResult = true;
        boolean result = instance.checkMessageID();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of checkRecipientCell method, of class message.
     */
    @Test
    public void testCheckRecipientCell() {
        System.out.println("checkRecipientCell");
        message instance = new message(1, "0654457899", "messageBody" );
        String expResult = "Cell phone number incorrectly formatted or does not contain international code.";
        String result = instance.checkRecipientCell();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of createMessageHash method, of class message.
     */
    @Test
    public void testCreateMessageHash() {
        System.out.println("createMessageHash");
        message instance = new message(1, "0654457899", "messageBody");
      
    }

    /**
     * Test of sentMessage method, of class message.
     */
    @Test
    public void testSentMessage() {
        System.out.println("sentMessage");
        message instance = new message (1, "0654457899", "messageBody");
       
    }

    /**
     * Test of printMessages method, of class message.
     */
    @Test
    public void testPrintMessages() {
        System.out.println("printMessages");
        message instance = new message(1, "0654457899", "messageBody");
        String expResult = "";
       
    }

    /**
     * Test of returnTotalMessages method, of class message.
     */
    @Test
    public void testReturnTotalMessages() {
        System.out.println("returnTotalMessages");
        int expResult = 0;
        int result = message.returnTotalMessages();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of storeMessage method, of class message.
     */
    @Test
    public void testStoreMessage() {
        System.out.println("storeMessage");
        message instance = new message (1, "0654457899", "messageBody");
        instance.storeMessage();
      
    }

    /**
     * Test of getMessageID method, of class message.
     */
    @Test
    public void testGetMessageID() {
        System.out.println("getMessageID");
        message instance = new message (1, "0654457899", "messageBody");
      
    }

    /**
     * Test of getRecipient method, of class message.
     */
    @Test
    public void testGetRecipient() {
        System.out.println("getRecipient");
        message instance = new message (1, "0654457899", "messageBody");
     
    }

    /**
     * Test of getMessage method, of class message.
     */
    @Test
    public void testGetMessage() {
        System.out.println("getMessage");
        message instance = new message (1, "0654457899", "messageBody");
      
        
    }

    /**
     * Test of getMessageHash method, of class message.
     */
    @Test
    public void testGetMessageHash() {
        System.out.println("getMessageHash");
        message instance = new message (1, "0654457899", "messageBody");
      
    }
    
}
