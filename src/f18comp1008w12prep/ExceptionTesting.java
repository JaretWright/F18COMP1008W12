/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f18comp1008w12prep;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jwright
 */
public class ExceptionTesting {
    public static void main(String[] args)
    {
        try {
            throw new JDubException("This is an exception - cool");
        } catch (JDubException ex) {
            Logger.getLogger(ExceptionTesting.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
