/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions;

/**
 *
 * @author Daniel Melo
 */
public class StoreControlException extends Exception{
    public StoreControlException() {
    }

    public StoreControlException(String message) {
        super(message);
    }

    public StoreControlException(String message, Throwable cause) {
        super(message, cause);
    }

    public StoreControlException(Throwable cause) {
        super(cause);
    }

    public StoreControlException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    } 
}
