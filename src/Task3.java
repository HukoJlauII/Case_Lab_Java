import java.util.Scanner;

/**
 * Description of the class or method
 *
 * @author HukoJlauII
 */
public class Task3 {

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        if (isPalindrome(s)) {
            System.out.println("Строка - паллиндром");
        } else {
            System.out.println("Строка - не паллиндром");
        }

    }
}
