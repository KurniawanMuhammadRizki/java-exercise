package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Exercise9 {
    /**
     * Java Program to get the number of days you have to wait after the i-th day to get a warmer temperature
     *
     * Example 1:
     * Input: temperatures = [73,74,75,71,69,72,76,73]
     * Output: [1,1,4,2,1,1,0,0]
     *
     * Example 2:
     * Input: temperatures = [30,40,50,60]
     * Output: [1,1,1,0]
     *
     * Example 3:
     * Input: temperatures = [30,60,90]
     * Output: [1,1,0]
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

    static int[] getDaysToWait(int[] temperatures) {
        int[] result = new int[temperatures.length];
        for (int i = 0; i < temperatures.length; i++) {
            int days = 0;
            for (int j = i + 1; j < temperatures.length; j++) {
                days++;
                if (temperatures[j] > temperatures[i]) {
                    result[i] = days;
                    break;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Find the number of days you have to wait after the i-th day to get a warmer temperature");
            System.out.println(" ");
            System.out.println("1. Manual input");
            System.out.println("2. Test case input");
            System.out.print("Your input : ");
            int inputCases = input.nextInt();
            if(inputCases == 1){
                System.out.println("Input few numbers as temperature :");
                int[] numbersArr = readNumber();
                System.out.println("Processing ...");
                int[] getDaysResult = getDaysToWait(numbersArr);
                System.out.println("Result : " + Arrays.toString(getDaysResult));
            }else{
                int[] testNumbers = {73,74,75,71,69,72,76,73};

                System.out.println("Input : " + Arrays.toString(testNumbers));

                System.out.println("Processing ...");
                int[] getDaysResult = getDaysToWait(testNumbers);
                System.out.println("Result : " + Arrays.toString(getDaysResult));
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
