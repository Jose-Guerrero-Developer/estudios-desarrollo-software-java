/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.primitivetypeschar;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        
        /* var type char */
        System.out.println("type\t\t- charVar: " + Character.TYPE);
        System.out.println("bits\t\t- charVar: " + Character.SIZE);
        System.out.println("bytes\t\t- charVar: " + Character.BYTES);
        System.out.println("min value\t- charVar: " + Character.MIN_VALUE);
        System.out.println("max value\t- charVar: " + Character.MAX_VALUE);
        
        /* print test character unicode */
        char varCharUnicode = '\u0021';
        System.out.println("varCharUnicode\t\t=>\t" + varCharUnicode);
        
        /* print test character decimal */
        char varCharDecimal = 33;
        System.out.println("varCharDecimal\t\t=>\t" + varCharDecimal);
        
        /* print test character simbol */
        char varCharSimbol = '!';
        System.out.println("varCharSimbol\t\t=>\t" + varCharSimbol);
        
    }
}
