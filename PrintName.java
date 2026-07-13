import java.util.Scanner;

class PrintName{
    public static void printMultipleName(String name, int n){
        if (n <= 0){
            return;
        }
        printMultipleName(name, n - 1);
        System.out.println(n+". "+name);
        
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.print("How many times you want to print: ");
        int n = scanner.nextInt();

        printMultipleName(name,n);
    }
   
}