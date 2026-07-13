import java.util.Scanner;

class ArmstrongNumber{
    public static void main(String[] args) {
        
    Scanner scanner = new Scanner (System.in);
    System.out.print("Enter the Number : ");
    int n = scanner.nextInt();
    int originalVal = n;
    int Sum = 0;
    System.out.println("The Entered Number is : "+ n);
    while(n > 0 ){
        int lastDigit = n % 10;
        Sum = Sum + (lastDigit*lastDigit*lastDigit);
        n = n/10;
    }
        System.out.println("The Sum NUmber is : "+Sum);

    if ( originalVal == Sum){
        System.out.println("The number is a ArmstrongNumber");
    }
    else{
        System.out.println("The number is not a ArmstrongNumber");
    }
}
      
}