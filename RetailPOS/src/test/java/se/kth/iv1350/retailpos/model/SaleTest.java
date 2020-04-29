/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.kth.iv1350.retailpos.model;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import se.kth.iv1350.retailpos.integration.ItemDTO;

/**
 *
 * @author Viktor
 */
public class SaleTest {
    ItemDTO itemDTO;
    
    @BeforeEach
    public void setUp() {       
        String itemIdentifier = "123456";
        Amount price = new Amount(100);
        double taxRate = 1.25;
        String itemName = "IKEA Pants";
        String itemDescription = "100% Polyester, yellow and blue patented square-pattern.";
        itemDTO = new ItemDTO(itemIdentifier, price, taxRate, itemName, itemDescription);
    }
    
    @AfterEach
    public void cleanUp() {
        itemDTO = null;
    }
    
    //@Test
    public void testRegisterItemInSalet() {
        Sale instance = new Sale();
        instance.registerItemInSale(itemDTO);
        
        RunningTotalDTO expResult = null;
        RunningTotalDTO result = instance.registerItemInSale(itemDTO);
        assertEquals(expResult, result);
        fail("The test case is a prototype.");
    }
    
}
