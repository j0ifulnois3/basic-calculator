package com.pluralsight;

import java.util.Scanner;

public class payrollcalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Name: ");
        String Name = String.valueOf(scanner.nextFloat());
        scanner.nextLine();

        System.out.print("Hours worked: ");
        float hourWorked = scanner.nextFloat();

        System.out.println("Rate of Pay:");
        float rateOfpay = scanner.nextFloat();





    }


}
