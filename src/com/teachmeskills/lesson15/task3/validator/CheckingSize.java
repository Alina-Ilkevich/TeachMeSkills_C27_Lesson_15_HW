package com.teachmeskills.lesson15.task3.validator;

import com.teachmeskills.lesson15.task3.exception.WrongSizeException;

public class CheckingSize {
    public static boolean checkSize(int size) throws WrongSizeException {
        if (size <= 0) {
            throw new WrongSizeException("The collection size must be more than 0!");
        }
        return true;
    }
}
