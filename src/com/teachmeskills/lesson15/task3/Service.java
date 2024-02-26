package com.teachmeskills.lesson15.task3;

import com.teachmeskills.lesson15.task3.exception.WrongSizeException;
import com.teachmeskills.lesson15.task3.validator.CheckingSize;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Service {
    public static int setSize(){
        int size = 0;
        System.out.print("Enter the size of the collection: ");
        Scanner scanner = new Scanner(System.in);
        try {
            size = scanner.nextInt();
            CheckingSize.checkSize(size);
        }
        catch (WrongSizeException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("You need to enter an integer");
        }
        catch (Exception e){
            System.out.println("Another error");
        }
        return size;
    }
}
