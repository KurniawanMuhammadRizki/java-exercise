package com.adepuu.exercises.session5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Exercise7 {
    /**
     * Java String Program to Check Anagram
     *
     * Example 1:
     * Input: s = "anagram", t = "nagaram"
     * Output: true
     *
     * Example 2:
     * Input: s = "rat", t = "car"
     * Output: false
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

    static boolean checkAnagram(String input1, String input2) {
        char[] charInput1 = input1.toCharArray();
        char[] charInput2 = input2.toCharArray();
        if (input1.length() != input2.length()) {
            return false;
        }
        char[] sortedInput1 = sortChar(charInput1);
        char[] sortedInput2 = sortChar(charInput2);

        for(int i = 0; i< input1.length(); i++){
            if(sortedInput1[i] != sortedInput2[i]) return false;
        }
        return true;
    }
    static char[] sortChar(char[] chars){
        int n = chars.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (chars[j] > chars[j + 1]) {
                    char temp = chars[j];
                    chars[j] = chars[j + 1];
                    chars[j + 1] = temp;
                }
            }
        }
        return chars;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        do{
            System.out.println("Check anagram in string");
            System.out.println(" ");
            System.out.println("1. Manual input");
            System.out.println("2. Test case input");
            System.out.print("Your input : ");
            int inputCases = input.nextInt();
            if(inputCases == 1){
                System.out.print("Input 1 : ");
                String input1 = input.next();

                System.out.print("Input 2 : ");
                String input2 = input.next();

                System.out.println("Processing ...");
                boolean checkAnagram = checkAnagram(input1, input2);

                if (checkAnagram) {
                    System.out.println("Both string are anagram");
                } else {
                    System.out.println("Both string are not anagram");
                }
            }else{
                String input1 = "abc";
                String input2 = "bca";
                System.out.println("Input 1 : " + input1);
                System.out.println("Input 2 : " + input2);
                System.out.println("Processing ...");
                boolean checkAnagram = checkAnagram(input1, input2);
                if (checkAnagram) {
                    System.out.println("Both string are anagram");
                } else {
                    System.out.println("Both string are not anagram");
                }
            }
        }while(isContinue().equalsIgnoreCase("y"));

        input.close();
    }
}
