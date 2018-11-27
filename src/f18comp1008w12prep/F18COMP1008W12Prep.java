/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18comp1008w12prep;

/**
 *
 * @author jwright
 */
public class F18COMP1008W12Prep {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        firstMethod();
        Thread.dumpStack();
    }
    
    public static void firstMethod()
    {
        secondMethod();
        Thread.dumpStack();
    }
    
    public static void secondMethod()
    {
        Thread.dumpStack();
    }
    
}
