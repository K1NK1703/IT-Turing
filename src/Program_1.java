import java.util.Scanner;

public class Program_1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите вашу строку: ");
        String input_string = in.nextLine();

        System.out.print("Введите натуральное число: ");
        String num = in.nextLine();
        int n;
        try {
            n = Integer.parseInt(num);
            if (n >= 1) for (int i = 0; i < n; i++) System.out.println(input_string);
            else System.out.println(input_string);
        } catch (NumberFormatException e) {
            System.out.println(input_string);
        }
    }
}