import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int x = scanner.nextInt();
        if (x > 2 && x < 6) {
            System.out.println("Твой возраст - " + x + " тебе нужно ходить в детский сад");
        } else if (x > 7 && x < 18) {
            System.out.println("Твой возраст - " + x + " тебе нужно ходить в школу");
        } else if (x >= 18 && x <= 24) {
            System.out.println("Твой возраст - " + x + " тебе нужно ходить в университет");
        } else if (x > 24) {
            System.out.println("Твой возраст - " + x + " тебе нужно ходить на работу");
        } else {
            System.out.println("Плач в кроватке");
        }
        System.out.println("Был бы внимательным прочитал бы что сначало ни гите создавать гужно");
    }
}
