import java.util.Scanner;

class PrintDivisiors{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter The Number: ");
        int n = scanner.nextInt();
        for ( int i = 0 ; i <= n ; i++){
            try {
        if (n % i == 0){
            System.out.println(i);
        }
    }catch (ArithmeticException e){
        continue;
    }
    }
    scanner.close();
    }
    
}