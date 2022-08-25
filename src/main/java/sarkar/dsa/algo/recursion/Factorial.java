package sarkar.dsa.algo.recursion;

public class Factorial {
    public static int fact(int n) {
        if (n == 1) {
            return 1;
        }
        int l = n * fact(n - 1);
        System.out.println(l);
        return l;
    }


    public static void main(String[] args) {
        System.out.println(fact(5));
    }

}
