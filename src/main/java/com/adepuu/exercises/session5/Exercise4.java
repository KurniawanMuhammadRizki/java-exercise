package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise4 {
    /**
     * Java Array Program to Remove Duplicate Elements From an Array
     *
     * Input: [ 1, 2, 2, 3, 3, 3, 4, 5 ]
     * Output: [ 1, 2, 3, 4, 5 ]
     *
     */
    static void printMenu(){
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("EXERCISE");
        System.out.println("Choose number below : ");
        System.out.println("1. Remove duplicates in array");

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


    static ArrayList<Integer> removeDuplicate(int[] numbers) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int num : numbers) {
            if (!list.contains(num)) {
                list.add(num);
            }
        }
        return list;
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
                System.out.println("Remove duplicates in array");
                System.out.println(" ");
                System.out.println("1. Manual input");
                System.out.println("2. Test case input");
                System.out.print("Your input : ");
                int inputCases = input.nextInt();
                if(inputCases == 1){
                    System.out.println("Input few numbers :");
                    int[] numbersArr = readNumber();
                    System.out.println("Processing ...");
                    ArrayList<Integer>  removeDuplicateResult = removeDuplicate(numbersArr);
                    System.out.println("Result : " + removeDuplicateResult);
                }else{
                    int[] testNumbers = {1, 2, 2, 3, 3, 3, 4, 5};
                    System.out.println("Processing ...");
                    System.out.println("Input : " + Arrays.toString(testNumbers));
                    ArrayList<Integer>  removeDuplicateResult = removeDuplicate(testNumbers);
                    System.out.println("Result : " + removeDuplicateResult);
                }
            }else {
                System.out.println("INVALID INPUT");
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
