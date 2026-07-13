import java.util.Scanner;
import java.util.Arrays;

class BubbleSort{
    public static void BubSort(int n , int arr[]){
        for(int i = n-1 ; i >=1 ; i--){
            for(int j = 0 ; j < i ; j++){
                if(arr[j] > arr[j+1]){
                  int temp = arr[j+1];
                  arr[j+1] = arr[j];
                  arr[j] = temp;
                }else{
                    System.out.print("The Array is already Sorted");
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter the "+size+" Elements of the Array");
        for(int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("your input array is: "+Arrays.toString(numbers));

        BubSort(size,numbers);
        System.out.println("your bubble sorted array is: "+Arrays.toString(numbers));
        
            scanner.close();

    }
    
}