import java.util.Scanner;
import java.util.Arrays;

class QuickSort{
    public static void quicksort(int[] arr, int low, int high){
        if(low < high){
            int pivotIndex = partition(arr, low, high);

            quicksort(arr, low, pivotIndex-1);
            quicksort(arr, pivotIndex+1, high);
        }
    }

    public static int partition(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low + 1;
        int j = high;

        while(i <= j){
            while ( i <= high && arr[i]<= pivot){
                i++;
            }
            while ( j >= low && arr[j] > pivot){
                j--;
            }
            if ( i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the "+size+" Elements of the Array : ");
        for (int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The user Input Array is : "+Arrays.toString(numbers));

        quicksort(numbers, 0 , size-1);

        System.out.println("The Sorted Array is : " + Arrays.toString(numbers));
    }

}