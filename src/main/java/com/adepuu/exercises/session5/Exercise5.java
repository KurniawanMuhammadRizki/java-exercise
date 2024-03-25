package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise5 {
    /**
     * Java Array Program to sort array in increasing & decreasing order
     *
     * Example 1:
     * Input: [ 8, 7, 5, 2], direction = “asc”
     * Output: [ 2, 5, 7, 8 ]
     *
     * Example 2:
     * Input: [ 8, 7, 5, 2], direction = “desc”
     * Output: [ 8,7, 5, 2 ]
     */
    static void printMenu(){
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("EXERCISE");
        System.out.println("Choose number below : ");
        System.out.println("1. Sort array in increasing order");
        System.out.println("2. Sort array in decreasing order");

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

    static int[] sortArrayAsc(int[] numbers){
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
    }
    static int[] sortArrayDesc(int[] numbers){
        int n = numbers.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (numbers[j] < numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        return numbers;
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
                System.out.println("Sort array in increasing order");
                System.out.println(" ");
                System.out.println("1. Manual input");
                System.out.println("2. Test case input");
                System.out.print("Your input : ");
                int inputCases = input.nextInt();
                if(inputCases == 1){
                    System.out.println("Input few numbers :");
                    int[] numbersArr = readNumber();
                    System.out.println("Processing ...");
                    int[] sortArrayAscResult = sortArrayAsc(numbersArr);
                    System.out.println("Result : " + Arrays.toString(sortArrayAscResult));
                }else{
                    int[] testNumbers = {8, 7, 5, 2};
                    System.out.println("Processing ...");
                    System.out.println("Input : " + Arrays.toString(testNumbers));
                    int[] sortArrayAscResult = sortArrayAsc(testNumbers);
                    System.out.println("Result : " + Arrays.toString(sortArrayAscResult));
                }
            } else if (choose == 2) {
                System.out.println("Sort array in decreasing order");
                System.out.println(" ");
                System.out.println("1. Manual input");
                System.out.println("2. Test case input");
                System.out.print("Your input : ");
                int inputCases = input.nextInt();
                if(inputCases == 1){
                    System.out.println("Input few numbers :");
                    int[] numbersArr = readNumber();
                    System.out.println("Processing ...");
                    int[] sortArrayDescResult = sortArrayDesc(numbersArr);
                    System.out.println("Result : " + Arrays.toString(sortArrayDescResult));
                }else{
                    int[] testNumbers = {8, 7, 3, 5, 2};
                    System.out.println("Processing ...");
                    System.out.println("Input : " + Arrays.toString(testNumbers));
                    int[] sortArrayDescResult = sortArrayDesc(testNumbers);
                    System.out.println("Result : " + Arrays.toString(sortArrayDescResult));
                }
            }else {
                System.out.println("INVALID INPUT");
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
