/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personally.unaryoperators;

/**
 *
 * @author Jose Guerrero
 */
public class Main {
    public static void main(String[] args) {
        
        /* invert signs in numbers */
        var a = 5;
        var b = -a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        
        /* invert signs in expressions */
        var c = false;
        var d = !c;
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        
        /* increase operator */
        // pre incremen
        var e = 20;
        var f = ++e;
        System.out.println("e = " + e);
        System.out.println("f = " + f);
        // post increase
        var g = 30;
        var h = g++;
        System.out.println("g = " + g);
        System.out.println("h = " + h);
        
        /* decrement operator */
        // pre decrement
        var i = 40;
        var j = --i;
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        // post decrement
        var k = 50;
        var l = k--;
        System.out.println("k = " + k);
        System.out.println("l = " + l);
        
    }
}
