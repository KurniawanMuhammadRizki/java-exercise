package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise6 {
    /**
     * Java Array Program to Remove All Occurrences of an Element in an Array
     *
     * Input: array = [ 1, 2, 1, 3, 5, 1 ] , key = 1
     * Output: [2, 3, 5]
     *
     * Explanation: all the occurrences of element 1 is removed from the array So, array becomes from
     * [ 1, 2, 1, 3, 5, 1 ]  to
     * Final result: [2, 3, 5]
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

    static int[] removeOccurrence(int[] numbers, int keyNumber) {
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] != keyNumber) {
                numbers[index++] = numbers[i];
            }
        }
        return Arrays.copyOf(numbers, index);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Remove All Occurrences of an Element in an Array");
            System.out.println(" ");
            System.out.println("1. Manual input");
            System.out.println("2. Test case input");
            System.out.print("Your input : ");
            int inputCases = input.nextInt();
            if(inputCases == 1){
                System.out.print("Input key : ");
                int inputKey = input.nextInt();
                System.out.println("Input few numbers :");
                int[] numbersArr = readNumber();
                System.out.println("Processing ...");
                int[] removeOccurrenceResult = removeOccurrence(numbersArr, inputKey);
                System.out.println("Result : " + Arrays.toString(removeOccurrenceResult));
            }else{
                int[] testNumbers = {1, 2, 1, 3, 5, 1};
                int key = 1;
                System.out.println("Processing ...");
                System.out.println("Input : " + Arrays.toString(testNumbers));
                System.out.println("Key : " + key);
                int[] removeOccurrenceResult = removeOccurrence(testNumbers, key);
                System.out.println("Result : " + Arrays.toString(removeOccurrenceResult));
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
