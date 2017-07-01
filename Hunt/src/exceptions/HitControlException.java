/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Dragon
 */
public class HitControlException extends Exception {

    public HitControlException() {
    }

    public HitControlException(String message) {
        super(message);
    }

    public HitControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public HitControlException(Throwable cause) {
        super(cause);
    }

    public HitControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
    
}
