package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise3 {
    /**
     * Write a Java Program to Check if Array Contain Duplicates
     *
     * Example 1:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     * Example 2:
     * Input: nums = [1,2,3,4]
     * Output: false
     *
     * Example 3:
     * Input: nums = [1,1,1,3,3,4,3,2,4,2]
     * Output: true
     */
    static void printMenu(){
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("EXERCISE");
        System.out.println("Choose number below : ");
        System.out.println("1. Check duplicates in array");

    }
    static String isContinue(){
        Scanner input = new Scanner(System.in);
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("Press y to main menu");
        System.out.println("Press any to exit");
        System.out.print("Your input : ");
        return input.nextLine();
    }
    static int[] readNumber() {

        String choice;
        ArrayList<Integer> numbers = new ArrayList<>();
        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            numbers.add(num);

            System.out.print("Press 'n' to stop or any key to continue: ");
            choice = input.next();
        } while (!choice.equals("n"));

        int[] numbersArray = new int[numbers.size()];
        for (int i = 0; i < numbers.size(); i++) {
            numbersArray[i] = numbers.get(i);
        }

        return numbersArray;
    }

    static boolean checkDuplicate(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            if (list.contains(num)) {
                return true;
            }
            list.add(num);
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do{
            printMenu();
            System.out.print("Your input : ");

            int choose = input.nextInt();
            input.nextLine();
            System.out.println("=================================");

            if (choose == 1) {
                System.out.println("Check duplicates in array");
                System.out.println(" ");

                System.out.println("Input few numbers :");
                int[] numbersArr = readNumber();
                System.out.println("Processing ...");
                boolean checkDuplicateResult = checkDuplicate(numbersArr);
                System.out.println("Result : " + checkDuplicateResult);
            } else {
                System.out.println("INVALID INPUT");
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
