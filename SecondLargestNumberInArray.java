import java.util.Scanner;
import java.util.Arrays;

class SecondLargestNumberInArray{
    public static int slargest(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Array is Empty");
        }
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;

        for (int num : arr){
            if ( largest == Integer.MIN_VALUE || num > largest){
                secondlargest = largest;
                largest = num;
            }
            else if (num > secondlargest && num != largest){
                secondlargest = num;
            }
        }
        if (secondlargest == Integer.MIN_VALUE){
            throw new IllegalArgumentException("Array dont have second Largest..");
        }
        return secondlargest;
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
        System.out.print("The user Input Array is : "+Arrays.toString(numbers));
 
        int secondlarg = slargest(numbers);

        System.out.println("The Second Largest Number is : "+secondlarg);
    
    scanner.close();
}
}

    