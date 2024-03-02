package com.teachmeskills.lesson15.task3;

import com.teachmeskills.lesson15.task3.exception.WrongSizeException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class CollectionCreating {
    public static void createCollection(){
        try {
            System.out.print("Enter the size of the collection: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            ArrayList<Integer> numbers = new ArrayList<>(size);
            for (int i = 0; i < size; i++){
                int num = (int) (Math.random() * 100);
                numbers.add(num);
            }
            System.out.println(numbers);
        } catch (InputMismatchException e){
            System.out.println("You need enter the number");
        } /*catch (IllegalArgumentException e){
            System.out.println("The collection size must be greater than 0");
        }*/
    }
}
