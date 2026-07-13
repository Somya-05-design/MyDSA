import java.util.Scanner;

class PrintNumbers2 {
    
    // Recursive method to print numbers from 0 to n
    public static void printMultipleNumber(int n) {
        if (n < 0) {
            return; // Base case: stop if n is negative
        }
        
                System.out.println(n); 
                printMultipleNumber(n-1);    // Print current number after returning
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();
        
        printMultipleNumber(n);

        scanner.close();
    }
}