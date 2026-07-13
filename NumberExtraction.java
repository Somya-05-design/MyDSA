import java.util.Scanner;

class NumberExtraction{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();
        while (n > 0){
            int lastDigit = n % 10;
            System.out.println(lastDigit);
            n = n / 10;
        }
    }
}