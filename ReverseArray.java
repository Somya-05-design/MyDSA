import java.util.Scanner;
import java.util.Arrays;

class ReverseArray{
    public static void FWDArray(int arr[], int l, int r){
        if (l >= r){
            return ;
        }
        FWDArray(arr, l+1, r-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of an Array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the "+size+" of the Array: ");
        for(int i=0 ; i<size ; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("Your Original Array is : "+ Arrays.toString(numbers));

        FWDArray(numbers, 0, size-1);

        System.out.println("The Reversed Array is : "+ Arrays.toString(numbers));
    }
}



