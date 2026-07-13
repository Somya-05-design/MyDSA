import java.util.Scanner;

class CheckPrime{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter The Number: ");
        int n = scanner.nextInt();
        if ( n < 1 ){
            System.out.println("The number is not a Prime");
        }

        int count = 0;

        for ( int i = 1 ; i <= n ; i++){
            if ( n % i == 0 ){
                count++;
            }
        }

        if ( count == 2){
            System.out.println("The number is a Prime Number");
        }
        else {
            System.out.println("The number is not a Prime Number");
        }
    }
}