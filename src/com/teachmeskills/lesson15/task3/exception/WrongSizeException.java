package com.teachmeskills.lesson15.task3.exception;

/**
 * This class creates an exception for the case when the user enters an incorrect size of collection
 */
public class WrongSizeException extends Exception{
    public WrongSizeException(String message) {
        super(message);
    }
}
