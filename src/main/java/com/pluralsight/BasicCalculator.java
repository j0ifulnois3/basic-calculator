package com.pluralsight;

import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your first number: ");
        double firstNumber = scanner.nextDouble();

        System.out.print("Enter number 2: ");
        double secondNumber = scanner.nextDouble();


        System.out.println("Possible calculations: ");
        System.out.println(" (A)dd" );
        System.out.println(" (S)ubtract" );
        System.out.println(" (M)ultiply" );
        System.out.println(" (D)ivide" );

        System.out.println("Select calculation.");
        scanner.nextLine();

        String action = scanner.nextLine();
        System.out.println("You answer is:  "+ (firstNumber * secondNumber));


    }


}
