package com.teachmeskills.lesson15.task1.service;

import java.util.ArrayList;
import java.util.Scanner;

public class CreatingCollection {
    public static ArrayList<Integer> createCollection() {
        System.out.println("Enter a number or exit: ");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            String line = scanner.nextLine();
            try {
                int num = Integer.parseInt(line);
                numbers.add(num);
            } catch (NumberFormatException e) {
                System.out.println("You only need to enter numbers or exit");
            }
            if (line.toLowerCase().equals("exit")) {
                break;
            }
        }
        System.out.println(numbers);
        return numbers;
    }
    public static void printEvenNumbers(ArrayList<Integer> numbers){
        for (Integer num : numbers){
            if (num % 2 == 0){
                System.out.print(num + " ");
            }
        }
    }
}
