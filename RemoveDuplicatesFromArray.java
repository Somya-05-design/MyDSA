import java.util.Scanner;
import java.util.Arrays;

class RemoveDuplicatesFromArray{
    public static int fxn(int[] num){
        if(num.length == 0){
            return 0;
        }
        int i = 0 ;
        for(int j = 1 ; j < num.length ; j++){
            if(num[j] != num[i]){
                i++;
                num[i] = num[j];
            }
        }
        return i+1;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        

        System.out.print("Enter the number of elements in the Array : ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the "+size+" elements of the Array : ");
        for(int i = 0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.print("The User input Array is : "+Arrays.toString(numbers));
        
        RemoveDuplicatesFromArray sol = new RemoveDuplicatesFromArray();
        int k = sol.fxn(numbers);

        System.out.print("Unique Count : "+k);
        System.out.print("Array After Duplicates : ");
        for(int x=0 ; x < k ; x++){
            System.out.print(numbers[x]+" ");
        }
scanner.close();
    }
}