package lesson011;

/**
 * Created by Admin on 19.10.2016.
 */
public class Fibonachi {

    public static void main(String[] args) {
        System.out.println(fib(6));
    }

    private static int fib(int n) {
        return n != 0 && n != 1?fib(n - 1) + fib(n - 2):n;
    }
}


