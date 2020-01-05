/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.arithmeticoperators;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        
        /* initialization of operation variables */
        int a = 5, b = 25;
        
        /* sum operator */
        System.out.println("sum (a + b) = " + (a + b));
        
        /* subtraction operator */
        System.out.println("subtraction (a - b) = " + (a - b));
        
        /* multiplication operator */
        System.out.println("multiplication operator (a * b) = " + (a * b));
        
        /* division operator */
        System.out.println("division operator (a / b) = " + ((double)a / (double)b));
        
        /* division module operator */
        System.out.println("division module operator (a % b) = " + ((double)a % (double)b));
        
    }
}
