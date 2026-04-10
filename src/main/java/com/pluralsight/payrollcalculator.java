package com.pluralsight;

import java.util.Scanner;

public class payrollcalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Name: ");
        String name = scanner.nextLine();

        System.out.print("Hours worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.println("Hourly Rate of Pay:");
        double payRate = scanner.nextDouble();

        double grossPay;
        if (hoursWorked <= 40) {
            // Standard pay
            grossPay = hoursWorked * payRate;
        } else {
            // Overtime: 40 hours at normal rate + extra hours at 1.5x rate
            double regularPay = 40 * payRate;
            double overtimeHours = hoursWorked - 40;
            double overtimePay = overtimeHours * (payRate * 1.5);
            grossPay = regularPay + overtimePay;
        }

        // 3. Output Result
        System.out.printf("Employee: %s", name);
        System.out.printf("Your gross pay is: $%.2f", grossPay);
    }






    }

