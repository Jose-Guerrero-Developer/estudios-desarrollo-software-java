/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericalbases;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args){
        /* base in decimal system */
        var decimalNumber = 10;
        System.out.println("base decimal\t\t=>\t" + decimalNumber);
        /* base in octal system */
        var octalNumber = 012;
        System.out.println("base octal\t\t=>\t" + octalNumber);
        /* base in hexadecimal system */
        var hexadecimalNumber = 0XA;
        System.out.println("base hexadecimal\t=>\t" + hexadecimalNumber);
        /* base in binary system */
        var binaryNumber = 0b1010;
        System.out.println("base binario\t\t=>\t" + binaryNumber);
    }
}
