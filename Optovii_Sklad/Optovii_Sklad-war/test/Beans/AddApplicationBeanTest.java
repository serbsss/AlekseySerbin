/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Beans;

import Models.Application;
import org.icefaces.ace.model.table.RowStateMap;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Алексей
 */
public class AddApplicationBeanTest {
    
    public AddApplicationBeanTest() {
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
     * Test of getStateMap method, of class AddApplicationBean.
     */
    @Test
    public void testGetStateMap() {
        System.out.println("getStateMap");
        AddApplicationBean instance = null;
        RowStateMap expResult = null;
        RowStateMap result = instance.getStateMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setStateMap method, of class AddApplicationBean.
     */
    @Test
    public void testSetStateMap() {
        System.out.println("setStateMap");
        RowStateMap stateMap = null;
        AddApplicationBean instance = null;
        instance.setStateMap(stateMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Application method, of class AddApplicationBean.
     */
    @Test
    public void testApplication() {
        System.out.println("Application");
        AddApplicationBean instance = null;
        Application expResult = null;
        Application result = instance.Application();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setApplication method, of class AddApplicationBean.
     */
    @Test
    public void testSetApplication() {
        System.out.println("setApplication");
        Application app = null;
        AddApplicationBean instance = null;
        instance.setApplication(app);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addNewApp method, of class AddApplicationBean.
     */
    @Test
    public void testAddNewApp() throws Exception {
        System.out.println("addNewApp");
        AddApplicationBean instance = null;
        String expResult = "";
        String result = instance.addNewApp();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of editApp method, of class AddApplicationBean.
     */
    @Test
    public void testEditApp() throws Exception {
        System.out.println("editApp");
        int idApplication = 0;
        AddApplicationBean instance = null;
        String expResult = "";
        String result = instance.editApp(idApplication);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
