

public class Task2 {
    public static void swapVar(int a, int b) {
        System.out.println("До:\na = " + a + "\nb = " + b);
        a += b;
        b = a - b;
        a -= b;
        System.out.println("После:\na = " + a + "\nb = " + b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        swapVar(a, b);
    }
}