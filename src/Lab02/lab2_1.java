package Lab02;

import java.util.Scanner;

public class lab2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input weight in kilogram: ");
        double weight = scanner.nextDouble();
        System.out.print("\nInput height in meters: ");
        double height = scanner.nextDouble();
        double BMI = weight / (height * height);
        BMI = Math.round(BMI*10)/10;
        System.out.print("\n BMI is " + BMI + " kg/m2");
        if (BMI < 18.5) {
            System.out.print("\n Underweight");
        } else if (BMI >= 18.5 && BMI <=24.9) {
            System.out.print("\n Normal weight");
        } else if (BMI >= 25 && BMI <=29.9) {
            System.out.print("\n Overweight");
        } else {
            System.out.println("\n Obesity");
        }
    }
}

