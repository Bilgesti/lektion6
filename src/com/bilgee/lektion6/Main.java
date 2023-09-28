package com.bilgee.lektion6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //int[] numbers = {0, 100, 1000, 2000};

        // Scanner in = new Scanner(System.in);
        // System.out.println("Type something to crash the program");
        // in.nextLine();

       // for (int i = 0; i < numbers.length + 1 ; i++){
       //     System.out.println(numbers[i]);
       // }

        System.out.println("Before crash");
        try {

            // try to execute code
            System.out.println("Inside - TRY ");
            System.out.println(2/0);

        }catch (Exception error) {
            // Catch error if it FAILS
            System.out.println("Inside - CATCH ");
            error.printStackTrace();
        }


        System.out.println("After crash");



    }
}
