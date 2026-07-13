import java.util.Scanner; 
import java.util.Arrays;

class ReverseArrayPlacesK{
void reverseArray(int[] arr, int start, int end){
    while(start <= end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--; 
    }
}
public int[] rotateArray(int[] arr, int k , String direction){
    int n = arr.length;

    if(arr == 0 || k == 0){
        return arr;
    }
    k = k % n ;

    if(direction.equals(right)){
        reverseArray(arr, 0, n-1);
        reverseArray(arr, 0, k-1);
        reverseArray(k, n-1);
    }
    else if(direction.equals(left)){
        reverseArray(arr, 0, k-1);
        reverseArray(k, n-1);
        reverseArray(0,n-1);
    }
    return arr;
} 
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the Size of the Array : ");
    int size = scanner.nextInt();
    int[] numbers = int new[size];

    System.out.println("Enter the "+size+" Elements of the Array : ");
    for(int i = 0 ; i < size ; i++){
        numbers[i] = scanner.nextInt();
    }
    System.out.println("The User Input Array is : "+Arrays.toString(numbers));

    System.out.print("What is the Value of k : ");
    int k = scanner.nextInt();
    
    System.out.print("What is the Direction needed to rotate");
    String direction = scanner.nextString();

    int[] result = rotateArray(arr, k, direction);

    System.out.println("The "+direction+"Rotated Array by "+k+" Places is "+result);
    scanner.close();
}
}