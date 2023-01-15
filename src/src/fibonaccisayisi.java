package src.src;

public class fibonaccisayisi {
    public static void main(String[] args) {
        System.out.println(fibonacci(5));
    }
    public static int fibonacci(int n){
        if(n==0){
            return 1;
        }else if(n==1 || n==2){
            return 1;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
