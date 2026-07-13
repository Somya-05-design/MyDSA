import java.util.Scanner;

class CheckForPalindromeString{
    public static boolean f(String str, int l, int r){
        if (l >= r){
            return true;
        }
        if (str.charAt(l) != str.charAt(r)){
            return false;
        }
        return f(str, l+1, r-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String: ");
        
        String ip =scanner.nextLine();
        if(f(ip, 0, ip.length()-1)){
            System.out.print("Given string is a palindrome");
        }
        else{
            System.out.print("Given string is not a palindrome");
        }
    }
}