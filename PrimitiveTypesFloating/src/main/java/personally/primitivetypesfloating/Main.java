/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.primitivetypesfloating;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        /* var type float */
        float floatVar = 3.4028235E38F;
        System.out.println("floatVar: " + floatVar);
        System.out.println("type\t\t- floatVar: " + Float.TYPE);
        System.out.println("bits\t\t- floatVar: " + Float.SIZE);
        System.out.println("bytes\t\t- floatVar: " + Float.BYTES);
        System.out.println("min value\t- floatVar: " + Float.MIN_VALUE);
        System.out.println("max value\t- floatVar: " + Float.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");
        /* var type double */
        double doubleVar = 1.7976931348623157E308D;
        System.out.println("doubleVar: " + doubleVar);
        System.out.println("type\t\t- doubleVar: " + Double.TYPE);
        System.out.println("bits\t\t- doubleVar: " + Double.SIZE);
        System.out.println("bytes\t\t- doubleVar: " + Double.BYTES);
        System.out.println("min value\t- doubleVar: " + Double.MIN_VALUE);
        System.out.println("max value\t- doubleVar: " + Double.MAX_VALUE);
    }
}
