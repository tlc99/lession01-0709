package Lab06;

import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        public static void main (String[]args){
            String myPassword = "password123";
            Scanner sc = new Scanner(System.in);
            String inputPassword;
            int count = 1;

            System.out.print("Please enter your Password: ");

            do {
                inputPassword = sc.nextLine();
                if (inputPassword.equals(myPassword)) {
                    System.out.println("Password correct!");
                    break;
                } else {
                    count++;
                    System.out.print("Wrong Password");
                    if (count <= 3) {
                        System.out.print("Please try again: ");
                    } else {
                        System.out.println("Forgot Password ?");
                    }
                }
            } while (count <= 3);
        }
    }
}