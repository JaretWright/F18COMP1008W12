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
public class JDubException extends Exception {
    
    //no argument constructor
    public JDubException()
    {
        super("Lasagna is good everyday even with wiggly noodles");
    }
    
    //constructor that accepts a message
    public JDubException(String message)
    {
        super(message);
    }
    
    //constructor accepts a "Throwable" (or another exception) as input
    public JDubException(Throwable throwable)
    {
        super(throwable);
    }
    
    //constructor that accepts a String message and a throwable
    public JDubException(String message, Throwable throwable)
    {
        super(message, throwable);
    }
    
    
}
