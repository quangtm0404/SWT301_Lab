
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MinhQuang
 */
public class TestRunner {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(CheckDateUnitTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
            
        }
        System.out.println(result.wasSuccessful());
    }
}
