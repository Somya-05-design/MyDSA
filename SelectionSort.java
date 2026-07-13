import java.util.Scanner;
import java.util.Arrays;

class SelectionSort{
    public static void selectSort(int n , int arr[]){

        for(int i=0 ; i < n-1 ; i++){
                    int minidx = i ;
            for(int j=i ; j < n ; j++){
                if(arr[j] < arr[minidx]){
                    minidx = j;
                }
            }
        
        if (minidx != i){
        int temp = arr[minidx];
        arr[minidx] = arr[i];
        arr[i] = temp;
        }
        else{
                    System.out.print("The Array is already Sorted");
                }
        }
    }
    public static void main(String[] args) {
        int arr[];
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the "+size+" elements of the Array: ");
        for(int i = 0 ; i < size ; i++){
            numbers[i]=scanner.nextInt();
        }
        System.out.print("The input array is : "+ Arrays.toString(numbers));
        
        selectSort(size,numbers);

        System.out.println("the selection sorted array is : "+Arrays.toString(numbers));
    }
}