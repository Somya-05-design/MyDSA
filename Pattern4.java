public class Pattern4{
    static void print4(int n){
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j < i ; j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        print4(5);
    }
}