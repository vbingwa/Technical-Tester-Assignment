/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.testing.assignment.pkg3;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 *
 * @author vbingwa
 */
public class TestRunner {
    
    //Running my test method on this class from class JUnitTest
    public static void main(String[] args) {
      Result result = JUnitCore.runClasses(JUnitTest.class);
		
      for (Failure failure : result.getFailures()) {
         System.out.println(failure.toString());
      }
		if (result.wasSuccessful())
                {
                    System.out.println("The Test Passed - " + result.wasSuccessful());
                }
      
   }
    
}
