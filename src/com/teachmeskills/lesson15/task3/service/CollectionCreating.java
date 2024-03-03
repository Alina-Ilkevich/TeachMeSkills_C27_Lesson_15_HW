package com.teachmeskills.lesson15.task3.service;

import com.teachmeskills.lesson15.task3.exception.WrongSizeException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * This class contains a method for creating a collection and
 * a method for calculating the arithmetic mean of the elements of the collection
 */
public class CollectionCreating {
    public static ArrayList<Integer> createCollection(){
        ArrayList<Integer> numbers = null;
        try {
            System.out.print("Enter the size of the collection: ");
            Scanner scanner = new Scanner(System.in);
            int size = scanner.nextInt();
            numbers = new ArrayList<>(size);
            for (int i = 0; i < size; i++){
                int num = (int) (Math.random() * 100);
                numbers.add(num);
            }
            System.out.println("Collection: " + numbers);
        } catch (IllegalArgumentException e){
            System.out.println("The collection size must be greater than 0");
        }catch (InputMismatchException e) {
            System.out.println("You need enter the number");
        }
        return numbers;
    }
    public static void calculateArithmeticMean(ArrayList<Integer> numbers){
        double count = 0.0;
        for (int i = 0; i < numbers.size(); i++){
            count += numbers.get(i);
        }
        double arithmeticMean = count / numbers.size();
        System.out.println("Arithmetic mean: " + arithmeticMean);
    }
}
