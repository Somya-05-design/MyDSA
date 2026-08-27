import java.util.Scanner;
import java.util.Arrays;

class CheckForSortedArray{

    public static boolean issorted(int[] arr){
        if(arr == null || arr.length < 1){
            return true;
        }
         for(int i = 1  ; i < arr.length ; i++){
        if ( arr[i] < arr[i-1]){
            return false;
        }
    }
    return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the "+size+" Elemets of the Array : ");

        for (int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The user Inputted Array is : " +Arrays.toString(numbers));
        boolean result = issorted(numbers);
        
   

