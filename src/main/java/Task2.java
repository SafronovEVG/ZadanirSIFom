import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите температуру на улице");
        int x = scanner.nextInt();
        if (x > 5) {
            System.out.println("На улице " + x + " градусов, сегодня тепло, можно идти без шапки");
        } else {
            System.out.println("На улице " + x + " градусов, сегодня ходоно, надень шапку");
        }
    }
}
