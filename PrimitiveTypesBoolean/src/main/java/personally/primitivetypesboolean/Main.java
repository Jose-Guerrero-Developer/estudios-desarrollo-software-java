/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.primitivetypesboolean;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        
        /* var type boolean */
        System.out.println("type - ture: " + Boolean.TRUE);
        System.out.println("type - false: " + Boolean.FALSE);
        boolean booleanVar = true;
        if (booleanVar) {
            System.out.println("booleanVar is true");
        } else {
            System.out.println("booleanVar is false");
        }
        var age     = 15;
        var isAdult = age >= 18;
        System.out.println("is adult => " + isAdult);
        
    }
}
