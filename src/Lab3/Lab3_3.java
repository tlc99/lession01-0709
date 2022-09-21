package Lab3;

public class Lab3_3 {
    public static void sortAscending(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < (arr.length - i); j++) {
                if(arr[j-1] > arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {12, 34, 1, 16, 28};
        System.out.println("Mảng chưa sắp xếp:");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }
        sortAscending(arr);
        System.out.println();
        System.out.println("Mảng sau sắp xếp:");
        for (int i = 0; i < arr.length ; i++){
            System.out.print(arr[i]+ " ");
        }

    }
}
