package com.teachmeskills.lesson15.task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Enter the size of the collection");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        ArrayList<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < numbers.size(); i ++){
            int num = (int) (Math.random() * 10);
            numbers.add(num);
        }
        System.out.println(numbers);
    }
}
