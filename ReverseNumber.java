import java.util.Scanner; 

class ReverseNumber{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = scanner.nextInt();
        int RevNum = 0 ;
        while( n > 0){
            int lastDigit = n % 10;
            n = n/10;
            RevNum = ( RevNum*10) + lastDigit;
            
        }
        System.out.println(RevNum);
    }
}