/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args){
        /* var type byte */ 
        byte byteVar = 127;
        System.out.println("byteVar: " + byteVar);
        System.out.println("type\t\t- byteVar: " + Byte.TYPE);
        System.out.println("bits\t\t- byteVar: " + Byte.SIZE);
        System.out.println("bytes\t\t- byteVar: " + Byte.BYTES);
        System.out.println("min value\t- byteVar: " + Byte.MIN_VALUE);
        System.out.println("max value\t- byteVar: " + Byte.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");
        /* var type short */ 
        short shortVar = 32767;
        System.out.println("shortVar: " + shortVar);
        System.out.println("type\t\t- shortVar: " + Short.TYPE);
        System.out.println("bits\t\t- shortVar: " + Short.SIZE);
        System.out.println("bytes\t\t- shortVar: " + Short.BYTES);
        System.out.println("min value\t- shortVar: " + Short.MIN_VALUE);
        System.out.println("max value\t- shortVar: " + Short.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");
        /* var type int */ 
        int intVar = 2147483647;
        System.out.println("intVar: " + intVar);
        System.out.println("type\t\t- intVar: " + Integer.TYPE);
        System.out.println("bits\t\t- intVar: " + Integer.SIZE);
        System.out.println("bytes\t\t- intVar: " + Integer.BYTES);
        System.out.println("min value\t- intVar: " + Integer.MIN_VALUE);
        System.out.println("max value\t- intVar: " + Integer.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");
        /* var type long */ 
        long longVar = 9223372036854775807L;
        System.out.println("longVar: " + longVar);
        System.out.println("type\t\t- longVar: " + Long.TYPE);
        System.out.println("bits\t\t- longVar: " + Long.SIZE);
        System.out.println("bytes\t\t- longVar: " + Long.BYTES);
        System.out.println("min value\t- longVar: " + Long.MIN_VALUE);
        System.out.println("max value\t- longVar: " + Long.MAX_VALUE);
        System.out.println("------------------------------------------------------------------------");
        /* use var */
        var number = 9223372036854775807L;
        System.out.println("use var: " + number);
    }
}
