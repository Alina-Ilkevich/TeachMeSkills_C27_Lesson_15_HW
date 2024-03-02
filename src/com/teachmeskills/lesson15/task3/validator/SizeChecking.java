package com.teachmeskills.lesson15.task3.validator;

import com.teachmeskills.lesson15.task3.exception.WrongSizeException;

public class SizeChecking {
    public static boolean checkCollectionSize(int size) throws WrongSizeException {
        if (size <= 0){
           throw new WrongSizeException("The collection size must be greater than 0");
        }
        return true;
    }
}
