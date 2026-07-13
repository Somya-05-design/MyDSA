import java.util.Scanner;

class PalindromeNumber{
    public static void main(String[] args) {
        
    
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter the Number : ");
    int n = scanner.nextInt();
    int originalVal = n;
    int RevNum = 0;
    System.out.println("The Entered Number is : "+ n);
    while(n > 0 ){
        int lastDigit = n % 10;
        RevNum = ( RevNum*10) + lastDigit;
        n = n/10;
    }
        System.out.println("The reverse NUmber is : "+RevNum);

    if ( originalVal == RevNum){
        System.out.println("The number is a Palindrome");
    }
    else{
        System.out.println("The number is not a Palindrome");
    }
}
      
}