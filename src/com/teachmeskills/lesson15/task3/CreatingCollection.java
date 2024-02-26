package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CreatingCollection {
    public static void createCollection(){
        ArrayList<Integer> numbers = new ArrayList<>(Service.setSize());
        for (int i = 0; i < numbers.size(); i ++) {
            numbers.add(i, 10);
            System.out.println(10);
        }
        //(int)(Math.random() * 10)
        System.out.println(numbers);
    }
}
