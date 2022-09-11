package Lab02;

import java.util.Scanner;

public class lab2_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int n = scanner.nextInt();
        if (n % 2 == 0){
            System.out.println("Số chẵn");
        } else {
            System.out.println(" Số lẻ");
        }
    }
}
