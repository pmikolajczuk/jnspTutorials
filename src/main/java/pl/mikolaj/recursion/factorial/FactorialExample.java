package pl.mikolaj.recursion.factorial;

public class FactorialExample {
    public static void main(String[] args) {
        System.out.println(factorial(10));
    }

    public static long factorial(int n) {
        if(n == 1) {
            return 1;
        }else {
            return n * factorial(n-1);
        }
    }
}
