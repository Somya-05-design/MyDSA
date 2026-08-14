import java.util.Scanner;

public class Functions{
 static int sum(int num1, int num2){
    int num3 = num1 + num2;
    return num3;
 }
 public static void main(String[] args) {
     int num1, num2;
Scanner scanner = new Scanner(System.in);

System.out.print("Enter num1 : ");
num1 = scanner.nextInt();
System.out.print("Enter num2 : ");
num2 = scanner.nextInt();
int func = sum(num1, num2);

