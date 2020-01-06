/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.assignmentoperator;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        
        /* variable initialization */
        int 
           a = 3,
           b = 2,
           c = a + 5 - b;
        
        /* assignment operator */
        System.out.println("assignment operator");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("(a + 5 - b) = " + c);
        
        /* composition operator */
        System.out.println("------------------------------------------------------------------------");
        System.out.println("composition operator");
        a += 1; /* => (a = a + 1) */
        System.out.println("(a += 1) = " + a);
        b -= 1;
        System.out.println("(b -= 1) = " + b);
        
    }
}
