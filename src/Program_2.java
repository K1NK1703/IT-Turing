import java.util.Scanner;

public class Program_2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите колличество раз: ");
        String input_kol = in.nextLine();
        System.out.print("Введите колличество литров за раз: ");
        String input_liters = in.nextLine();

        int kol, liters;
        try {
            kol = Integer.parseInt(input_kol);
            liters = Integer.parseInt(input_liters);
            if (kol < 0 || liters < 0) {
                System.out.println("Введены некорректные данные!");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Введены некорректные данные!");
            return;
        }

        int sum = kol*liters;
        for (int i = 0; i < 16; i++) {
            System.out.println("К " + (i+1) + " неделе будет выпито " + sum + " литров жидкости");
            sum += kol*liters;
        }

        if (sum >= 120) System.out.println("Студент принят в IT-клуб!");
        else System.out.println("К сожалению, студент не принят в клуб");
    }
}