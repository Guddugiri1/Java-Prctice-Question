import java.util.Scanner;

public class CharStringConversion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);
        String str = Character.toString(ch);
        System.out.println("Char to String: " + str);

        System.out.print("Enter a string: ");
        String s = scanner.next();
        char c = s.charAt(0);
        System.out.println("String to Char: " + c);

        scanner.close();
    }
}
