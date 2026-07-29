import java.util.Scanner;
import java.util.Arrays;

class RotateArrayByElementsK{
    void reverseArray(int[] arr, int start, int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public int[] rotateArray(int[] arr, int k , int direction){
        int n = arr.length;

        if(n==0 || k==0){
            return arr;
        }
        k = k % n;
        


 