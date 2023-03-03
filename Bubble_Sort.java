package searchingAndSorting;
import java.util.Scanner;
public class Bubble_Sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt(); // number of test cases
        while (t-- > 0) {
            int n = sc.nextInt(); // size of the array
            int[] arr = new int[n]; // create an array of size n
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt(); // input the elements of the array
            }
            bubbleSort(arr); // call the bubbleSort method to sort the array
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " "); // print the sorted array
            }
            System.out.println();
        }
        sc.close();
    }
    
    // method to perform bubble sort on an array
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
