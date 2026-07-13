public class Pattern17{
 static void print17(int n){
    for ( int i = 0 ; i < n ; i++){
        char ch = (char) ('A' + i);
        for (int j = 1 ; j <= i ; j++){
            System.out.print(ch);
        }
        System.out.println();
    }
 }   
 public static void main(String[] args) {
     print17(5);
 }
}