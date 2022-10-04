package Lab06;

import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minute, hour;
        System.out.println("Nhập vào số giờ");
        hour = sc.nextInt();
        System.out.println("Nhập vào số phút");
        minute = sc.nextInt();
        change(hour, minute);
        System.out.println("Tổng số phút là");
    }
    public static void change (int h, int m){
    int second = h * 3600 + m * 60 ;
        System.out.println("Tổng số phút là: ");
    }
}



