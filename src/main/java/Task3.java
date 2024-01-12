import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (x > 60) {
            System.out.println("Скорость - " + x + " км/ч , придется заплатить штраф");
        } else {
            System.out.println("Скорость - " + x + " км/ч , можно ездить спокойно");
        }
    }
}
