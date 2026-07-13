import java.util.Scanner;

class FibonacchiNumber{
    public static int fibo(int n){
        if(n <= 1){
            return n;
        }
        int last = fibo(n-1);
        int slast= fibo(n-2);
         
        return last+slast;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = scanner.nextInt();

        int result = fibo(n);
        System.out.print("The fibonacchi of "+n+" is "+result);
    }
}