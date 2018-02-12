/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.testing.assignment.pkg3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author vbingwa
 */
public class JUnitTest {
    
   @Test
	
   public void testAllan() {
     //String EpectedArr [] = new String[]{"0", "1", "2", "3", "4"};
     ArrayList<String> longList = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "1", "2", "3", "4"));
     Set<String> expectedRes = new HashSet<>(Arrays.asList("0", "1", "2", "3", "4")); 
      assertEquals("This is the expected result",findDuplicates.processList(longList),expectedRes);
   }
}
