/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.primitivetypesconversion;

import java.util.Scanner;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        
        /* primitive types conversion */
        int age = Integer.parseInt("25");
        System.out.println("age = " + age);
        
        double pi = Double.parseDouble("3.1416");
        System.out.println("pi = " + pi);
        
        var scanner = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        age = Integer.parseInt(scanner.nextLine());
        System.out.println("age scanner = " + age);
        
    }
}
