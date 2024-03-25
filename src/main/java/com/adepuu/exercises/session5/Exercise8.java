package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise8 {
    /**
     * Java String Program to Find all Duplicates on Array
     *
     * Example 1:
     * Input: nums = [4,3,2,7,8,2,3,1]
     * Output: [2,3]
     *
     * Example 2:
     * Input: nums = [1,1,2]
     * Output: [1]
     *
     * Example 3:
     * Input: nums = [1]
     * Output: []
     */
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

    static List<Integer> findDuplicates(int[] numbers) {
        List<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j] && !duplicates.contains(numbers[i])) {
                    duplicates.add(numbers[i]);
                }
            }
        }
        return duplicates;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Find all duplicates on array");
            System.out.println(" ");
            System.out.println("1. Manual input");
            System.out.println("2. Test case input");
            System.out.print("Your input : ");
            int inputCases = input.nextInt();
            if(inputCases == 1){
                System.out.println("Input few numbers :");
                int[] numbersArr = readNumber();
                System.out.println("Processing ...");
                List<Integer> duplicateResult = findDuplicates(numbersArr);
                System.out.println("Result : " +duplicateResult);


            }else{
                int[] testNumbers = {4, 3, 2, 7, 8, 2, 3, 1};

                System.out.println("Input : " + Arrays.toString(testNumbers));

                System.out.println("Processing ...");
                List<Integer> duplicateResult = findDuplicates(testNumbers);
                System.out.println("Result :" +duplicateResult);
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
