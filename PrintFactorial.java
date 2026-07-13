import java.util.Scanner;

class PrintFactorial{
    public static long factNum(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n * factNum(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();
        long result = factNum(n);
        System.out.println("factorial of "+n+" is "+result);
    }
}