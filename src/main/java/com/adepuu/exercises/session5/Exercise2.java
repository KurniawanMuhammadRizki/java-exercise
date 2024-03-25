package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercise2 {
    /**
     * Java Array Program For Array Rotation
     * Input: arr[] = {1, 2, 3, 4, 5, 6, 7},  d = 2
     * Output:  3 4 5 6 7 1 2
     * Explanation: d=2 so 2 elements are rotated to the end of the array. So, 1 2 is rotated back
     * So, Final result: 3, 4, 5, 6, 7, 1, 2
     */
    static void printMenu(){
        System.out.println(" ");
        System.out.println("=================================");
        System.out.println("EXERCISE");
        System.out.println("Choose number below : ");
        System.out.println("1. Rotate Array");

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

    static void rotateArray(int[] numbersArr, int target) {
        int n = numbersArr.length;
        for (int i = 0; i < target; i++) {
            int tempArr = numbersArr[0];
            for (int j = 0; j < n - 1; j++) {
                numbersArr[j] = numbersArr[j + 1];
            }
            numbersArr[n - 1] = tempArr;
        }
        for (int j : numbersArr) {
            System.out.print(j + " ");
        }
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
                System.out.println("Rotate array");
                System.out.println(" ");
                System.out.println("Input how much you want to rotate :");
                int rotateNumber = input.nextInt();
                System.out.println("Input few numbers :");
                int[] numbersArr = readNumber();
                System.out.println("Processing ...");
                rotateArray(numbersArr, rotateNumber);
            } else {
                System.out.println("INVALID INPUT");
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
