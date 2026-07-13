import java.util.Scanner;
import java.util.Arrays;

class LeftRotateArray{
    public static void leftRA(int[] arr){
        int temp = arr[0];
        
        for (int i = 1 ; i < arr.length ; i++){
            arr[i-1] = arr[i];
        }
         arr[arr.length-1] = temp;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the "+size+" Elements of the Array : ");
        for(int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.println("The User Input Array is : "+Arrays.toString(numbers));
        leftRA(numbers);
        System.out.println("Left rotated Array is : "+Arrays.toString(numbers));
 
        scanner.close();
    }
}