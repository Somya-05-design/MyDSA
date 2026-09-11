import java.util.Scanner;
import java.util.Arrays;

class LargestElementInArray{

    public static int largestNo(int[] arr){
          if ( arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
          }
        int max = arr[0];

        for ( int i = 0 ; i < arr.length ; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the "+size+" Elements of the Array : ");
        for( int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.print("The user Input Array is "+ Arrays.toString(numbers));

    int largest = largestNo(numbers);

       System.out.println("The Largest Element of the Array is : " + largest );
    }
}