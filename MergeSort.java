import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MergeSort{
    public static void merge(int[] arr, int low, int mid, int high){
        List<Integer> temp = new ArrayList<>();
        int left = low;
        int right = mid+1;

        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            }else{
                temp.add(arr[right]);
                right++;
            }
        }
        while(left <= mid){
            temp.add(arr[left]);
            left++; 
        }
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        for(int i = low ; i <= high ; i++){
            arr[i] = temp.get(i-low);
        }
    }
    public static void mergesort(int[] arr, int low, int high){
        if(low >= high){
            return;
        }
        int mid = (low+high)/2;
        mergesort(arr, low, mid);
        mergesort(arr, mid+1, high);
        merge(arr, low, mid, high);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        
        System.out.println("Enter the "+size+" elemets of the Array..");
        for(int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("The user Inputed Array is: "+Arrays.toString(numbers));

        mergesort(numbers, 0 , size-1);
        System.out.println("The user Inputed Array is: "+Arrays.toString(numbers));

    }
}