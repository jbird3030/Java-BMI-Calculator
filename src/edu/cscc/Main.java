package edu.cscc;

import java.util.Scanner;

// Jason McGee, Sep 14, 2021, Lab 3
// BMI Calculator

public class Main {

    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        //Declare variables
        double lbs, inches, meters, kgs, bmi;
        String classification;

        //call methods
        meters = convertToMeters();
        kgs = convertToKilograms();
        bmi = calcBMI(meters, kgs);
        bmiClassification(bmi);

    }

    public static double convertToMeters (){
        System.out.print("Please enter your height in inches: ");
        double inches = input.nextDouble();
        double meters;
        meters = (inches / 39.37);
        return meters;
    }

    public static double convertToKilograms () {
        System.out.print("Please enter your weight in pounds: ");
        double lbs = input.nextDouble();
        double kgs;
        kgs = (lbs / 2.2046);
        return kgs;
    }

    public static double calcBMI (double meters, double kgs){
        double bmi;
        double metersSquared = (meters * meters);
        bmi = (kgs/metersSquared);
        return bmi;
    }
    public static void bmiClassification (double bmi){


        if (bmi < 18.5) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("Your BMI classification is Underweight");
        } else if (bmi < 25) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("Your BMI classification is Normal");
        } else if (bmi < 30) {
            System.out.println("Your BMI is " + bmi);
            System.out.println("Your BMI classification is Overweight");
        } else {
            System.out.println("Your BMI is " + bmi);
            System.out.println("Your BMI classification is Obese");
        }
    }

}












