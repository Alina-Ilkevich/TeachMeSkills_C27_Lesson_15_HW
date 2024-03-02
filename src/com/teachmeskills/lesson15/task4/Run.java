package com.teachmeskills.lesson15.task4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Run {
    public static void main(String[] args) {
        System.out.println("Enter the size of the collection");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++){
            int num = (int) (Math.random() * 100);
            numbers.add(num);
        }
        System.out.println(numbers);
    }
}
