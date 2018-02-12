/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software.testing.assignment.pkg3;

import java.util.Scanner;

/**
 *
 * @author vbingwa
 */
public class IsItprime {
    
    public static void main(String [] args) 
    {
        Scanner enter = new Scanner(System.in);
        int number;
        
        System.out.println("Please enter number");
        number = enter.nextInt();
        
        primeValidation(number);
    }
        
    
    
  
    
   public static void  primeValidation(int num)
    {
        boolean prime = true;
        int n = 2;
      
        //Flow condition for values greater than 2 and if statement to composite numbers
        while(num > n) 
        {
            if (num%n==0 )
            {
                prime = false;
            }
            
        break;
        }
        if (num == 1 || num == 0)
        {
            prime = false;
        }
            if(prime)
            {
                System.out.println("It is a prime number");
            }
            else
            {
                System.out.println("That is not a prime number");
            }
           
}
    
}
