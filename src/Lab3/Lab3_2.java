package Lab3;

public class Lab3_2 {
    public static void main(String[] args) {
             int arr[] = {1, 2, 3, 4,5};
                int max = arr[0];
                int min = arr[0];
                for(int i = 1; i < arr.length; i++) {
                    if(max < arr[i]) {
                        max = arr[i];
                    } if(min > arr[i])
                        min = arr[i];
                }
                System.out.println("Maximum value from an integer array = " + max);
                System.out.println("Minimum value from an integer array = " + min);
            }
        }
