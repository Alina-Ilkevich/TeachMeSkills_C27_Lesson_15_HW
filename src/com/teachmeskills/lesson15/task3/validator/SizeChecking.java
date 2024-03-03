package com.teachmeskills.lesson15.task3.validator;

import com.teachmeskills.lesson15.task3.exception.WrongSizeException;

/**
 * This class contains a method for checking the correctness of the input data
 */
public class SizeChecking {
    public static boolean checkCollectionSize(int size) throws WrongSizeException {
        if (size <= 0){
           throw new WrongSizeException("The collection size must be greater than 0");
        }
        return true;
    }
}
