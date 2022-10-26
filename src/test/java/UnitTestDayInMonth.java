/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.minhquang.lab3testing2.DateUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author MinhQuang
 */
public class UnitTestDayInMonth {
    
    public UnitTestDayInMonth() {
    }
    
  
    
   
    @Test 
    public void shoudReturn29() {
        int result = DateUtils.dayInMonth(2, 2020);
        assertEquals(29, result);
    }
    
    @Test 
    public void shoudReturn28() {
        int result = DateUtils.dayInMonth(2, 2023);
        assertEquals(28, result);
    }
   
    @Test 
    public void boundaryShouldReturn30() {
        int expected = 30;
        int result = DateUtils.dayInMonth(4, 1000);
        assertEquals(expected, result);
    }
  
     @Test 
    public void boundary3000ShouldReturn30() {
        int expected = 30;
        int result = DateUtils.dayInMonth(4, 3000);
        assertEquals(expected, result);
    }
    
    @Test 
    public void normal04ShouldReturn30() {
        int result = DateUtils.dayInMonth(4, 2020);
        assertEquals(30, result);
    }
    
    @Test 
    public void normal09ShouldReturn30() {
        int result = DateUtils.dayInMonth(9, 2020);
        assertEquals(30, result);
    }
    
    @Test 
    public void normal06ShouldReturn30() {
        int result = DateUtils.dayInMonth(6, 2020);
        assertEquals(30, result);
    }
    
    @Test 
    public void normal11ShouldReturn30() {
        int result = DateUtils.dayInMonth(11, 2020);
        assertEquals(30, result);
    }
    
    @Test 
    public void should01Return31() {
        int result = DateUtils.dayInMonth(1, 2020);
        assertEquals(31, result);
    }
     
    @Test 
    public void should03Return31() {
        int result = DateUtils.dayInMonth(3, 2020);
        assertEquals(31, result);
    }
     
    @Test 
    public void should05Return31() {
        int result = DateUtils.dayInMonth(5, 2020);
        assertEquals(31, result);
    }
     
    @Test 
    public void should07Return31() {
        int result = DateUtils.dayInMonth(7, 2020);
        assertEquals(31, result);
    }
    
    @Test 
    public void should08Return31() {
        int result = DateUtils.dayInMonth(8, 2020);
        assertEquals(31, result);
    }
     
    @Test 
    public void should10Return31() {
        int result = DateUtils.dayInMonth(10, 2020);
        assertEquals(31, result);
    }
     
    @Test 
    public void should12Return31() {
        int result = DateUtils.dayInMonth(12, 2020);
        assertEquals(31, result);
    }
    
    @Test 
    public void boundary1000ShouldReturn31() {
        int expected = 31;
        int result = DateUtils.dayInMonth(1, 1000);
        assertEquals(expected, result);
    }
    
    @Test 
    public void boundary3000ShouldReturn31() {
        int expected = 31;
        int result = DateUtils.dayInMonth(1, 3000);
        assertEquals(expected, result);
    }
    
    
    @Test 
    public void year999shouldReturn0() {
        int expected = 0;     
        int result = DateUtils.dayInMonth(1, 999);
        assertEquals(expected, result);

    }
    
    @Test 
    public void year3001ShouldReturn0() {
        int expected = 0;
        int result = DateUtils.dayInMonth(1, 3001);
        assertEquals(expected, result);
    }
    
    @Test
    public void yearNullShoudReturn0() {
        int expected = 0;
        int result = DateUtils.dayInMonth(1, null);
        assertEquals(expected, result);
    }
    
    @Test
    public void monthNullShouldReturn0() {
        int expected = 0;
        int result = DateUtils.dayInMonth(null, 2020);
        assertEquals(expected, result);
    }
}
