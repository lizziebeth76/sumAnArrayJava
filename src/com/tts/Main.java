package com.tts;

import java.util.Scanner;

//  WRITE A PROGRAM THAT SUMS THE VALUES OF A GIVEN ARRAY IN JAVA:

public class Main {

    public static void main(String[] args) {

//        A WELCOME MESSAGE:
        System.out.println("Hey-o!");
        System.out.println("This Java program contains an array with values: 2, 4, 6, 8, and 1, jsyk.");

//        CALL THE SCANNER FROM THE IMPORTED LIBRARY ABOVE:
//        Scanner scanner = new Scanner(System.in);

//        DECLARE THE ARRAY & ASSIGN ITS CONTENTS:
        int[] intArray = {2, 4, 6, 8, 1};
//        GIVE SUM A DEFAULT VALUE:
        int sum = 0;

        for (int i : intArray)
            sum += i;
        System.out.println("The sum of this array of integers is " + sum);

    }
}

