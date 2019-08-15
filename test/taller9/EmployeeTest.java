/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import static taller9.EmployeeType.Worker;

/**
 *
 * @author juanjimenez
 */
public class EmployeeTest {
    
    

    /**
     * Test of cs method, of class Employee.
     */
    @Test
    public void testNotNull() {
        System.out.println("NO DEBE SER NULL EL OBJETO EMPLEADO");
        Employee instance = new Employee(200F, "USD",0.5F,Worker);
        float expResult = 0.0F;
        float result = instance.cs();
        assertNotNull(instance);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }
    
     @Test
    public void testCsWorker() {
        System.out.println("TestCsWorker no debe retornar 0.0f");
        Employee instance = new Employee(200F, "USD",0.5F,Worker);
        float expResult = 0.0F;
        float result = instance.cs();
        assertNotSame(expResult,result);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
    }

    /**
     * Test of CalculateYearBonus method, of class Employee.
     */
    
//    @Test
//    public void testCalculateYearWorker() {
//        System.out.println("CalculateYearWoker");
//        Employee instance = new Employee(200F, "USD",0.5F,Worker);
//        float expResult = 0.0F;
//        float result = instance.CalculateYearBonus();
//        assertEquals(expResult, result, 0.0);
//        // TODO review the generated test code and remove the default call to fail.
//        //fail("The test case is a prototype.");
//    }
//    
    @Test
    public void testCalculateYearWorker() {        
        Employee empleado = new Employee(200F, "USD", 0.05F, Worker);
        float result = empleado.CalculateYearBonus();
        assertEquals((float) 386.0, result,0.0F);
    }
    
    @Test
    public void testCalculateYearSupervisor() {        
        Employee empleado = new Employee(100F, "USD", 0.05F, EmployeeType.Supervisor);
        float result = empleado.CalculateYearBonus();
        assertEquals(293, result,0.0F);
    }
    
     @Test
    public void testCalculateYearManager() {        
        Employee empleado = new Employee(120F, "USD", 0.05F, EmployeeType.Manager);
        float result = empleado.CalculateYearBonus();
        assertEquals(506, result,0.0F);
    }
    
    
    
}
