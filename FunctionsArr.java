import java.util.Arrays;
import java.util.Scanner;

public class FunctionsArr{
    static void Array(int n){
        int arr[] = new int[n] ;
        Scanner scanner = new Scanner (System.in);

        for (int i = 0 ; i < n ; i++){
            System.out.print("Enter the value for INDEX " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        for (int i = 0 ; i < n ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
 