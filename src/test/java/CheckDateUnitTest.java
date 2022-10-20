/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import com.minhquang.lab3testing2.DateUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author MinhQuang
 */
public class CheckDateUnitTest {
    
    public CheckDateUnitTest() {
    }
    @Ignore
    @Test
    public void boundary01021000() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(1000, 2, 1);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test
    public void abnormal01020999() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(999, 2, 1);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void boundary01023000() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(3000, 2, 1);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test
    public void abnormal01023001() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(3001, 2, 1);
        assertEquals(expected, actual);
    }
    
    @Ignore
    @Test 
    public void abnormal15132020() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2020, 13, 15);
        assertEquals(expected, actual);
    }
    
    @Ignore
    @Test 
    public void abnormal1502023() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2023, 0, 15);
        assertEquals(expected, actual);
    }
    // Done 6 TC 
    @Ignore
    @Test
    public void abnormal32042020() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2020, 4, 32);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test
    public void abnormal32012020() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2020, 1, 32);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void boundary31012020() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(2020, 1, 31);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test
    public void normal15012020() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(2020, 1, 15);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void abnormal31042020() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2020, 4, 31);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void boundary30042020() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(2020, 4, 30);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void normal15042020() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(2020, 4, 15);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void normal28022023() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(2023, 2, 28);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void abnormal29022023() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2023, 2, 29);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void boundary29022020() {
        boolean expected = true;
        boolean actual = DateUtils.checkDate(2020, 2, 29);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void abnormal30022020() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2020, 2, 30);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test   
    public void abnormal15Null2023() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2023, null, 15);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test 
    public void abnormal2912Null() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(null, 12, 29);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test
    public void abnormalNull122020() {
        boolean expected = false;
        boolean actual = DateUtils.checkDate(2020, 12, null);
        assertEquals(expected, actual);
    }
    @Ignore
    @Test
    public void normal15122023() {
        boolean expected = true; 
        boolean actual = DateUtils.checkDate(2023, 12, 15);
        assertEquals(expected, actual);
    } 
    
}
