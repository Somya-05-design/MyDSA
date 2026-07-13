import java.util.Scanner;
class CountDigits{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = scanner.nextInt();
        int count = 0;
        while ( n > 0){
            int lastDigit = n % 10;
            count = count + 1;
            n = n / 10;
        }
        System.out.println("The Number of Digits are : "+count);
        }
        
}