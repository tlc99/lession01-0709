package Lab05;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        do{
            System.out.println("=========MENU=========");
            System.out.println("1.Add number into ArrayList");
            System.out.println("2.Print numbers");
            System.out.println("3.Get maximum number ");
            System.out.println("4.Get minimum number ");
            System.out.println("5.Search number ");
            System.out.println("Enter your option:");
            int option = scanner.nextInt();
            switch (option){
                case 1:
                    System.out.println("Enter your number:");
                    int number = scanner.nextInt();
                    list.add(number);
                    break;
                case 2:
                    System.out.println("Array List:" + Arrays.toString(list.toArray()));
                    break;
                case 3:
                    int max = list.get(0);
                    for (int i = 1 ; i < list.size() ; i++){
                        if(max < list.get(i)){
                            max = list.get(i);
                        }
                    }
                    System.out.println("Number max: " + max);
                    break;
                case 4:
                    int min = list.get(0);
                    for (int i = 1 ; i < list.size() ; i++){
                        if(min > list.get(i)){
                            min = list.get(i);
                        }
                    }
                    System.out.println("Number min: " + min);
                    break;
                case 5:
                    System.out.println("Enter number search: ");
                    int search = scanner.nextInt();
                    if(!list.contains(search)){
                        System.out.println("Not found!");
                    }
                    for (int i = 0 ; i < list.size() ; i++){
                        if(search == list.get(i)){
                            System.out.println("Number search at: "+ i);
                        }
                    }
                    break;
                default:
                    System.exit(0);
            }
        }while(true);
    }

}
