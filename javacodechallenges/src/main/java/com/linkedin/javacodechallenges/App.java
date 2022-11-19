package com.linkedin.javacodechallenges;

import java.util.Scanner;

public class App {

    public static double calculateWaterBill(double gallonsUsage) {
       int minGallonUsage = 1496;
       double minCharge = 18.84;
        if(gallonsUsage <= minGallonUsage) {
        return minCharge;
       }
       return minCharge + 
                Math.ceil((gallonsUsage - minGallonUsage) / 748) * 3.9; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many gallons of water did you " +
                "use this month?");
        double usage = scanner.nextDouble();
        System.out.println("Your water bill is " +
                calculateWaterBill(usage));
        scanner.close();
    }
}
