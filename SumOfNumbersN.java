import java.util.Scanner;

class SumOfNumbersN{
    public static int numSum(int n){
        if ( n < 0){
            return 0;
        }
        return n+ numSum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scanner.nextInt();
        int result = numSum(n);
        System.out.print("The sum of all Numbers till n is: "+result );

    }
}