import java.util.Scanner;
import java.util.Arrays;

class RecurringNumbersInArray{
    public static int NoInArr(int n , int arr[]){

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Size of an Array: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];

        System.out.print("Enter the "+size+" Elemets of the Array: ");
        for(int i=0 ; i < size ; i++){
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the Numbers to be Checked in the Array :");
        int elements = nextInt();

        
    }
}


/* Using the Iteration method

class RecurringNumbersInArray{
    public static int NoInArr(int n , int arr[]){
        if (n < 0){
            return n;
        }
        int count = 0;
        for (int i = 0 ; i < arr.length ; i++){
            if(arr[i] == n){
            count++ ;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array : ");
         
        int size = scanner.nextInt();
        int[] numbers = new int[size];


        System.out.println("Enter the "+size+" elements of the Array : ");
        for(int i = 0 ; i < size ; i ++){
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Enter the number to check the Recurrance in the Array: ");
         int n = scanner.nextInt();

        int count = NoInArr(n, numbers);
        System.out.print("the Given number "+n+" is occuring "+count+ " times in the Array");
    }
}
    */