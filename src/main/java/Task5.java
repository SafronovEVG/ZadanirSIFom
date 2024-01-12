import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);
        Scanner s3 = new Scanner(System.in);
        System.out.println("Ведите первое число");
        int one = s1.nextInt();
        System.out.println("Ведите второе число");
        int two = s2.nextInt();
        System.out.println("Ведите третье число");
        int three = s3.nextInt();
        if (one > two) {
            if (one > three) {
                System.out.println("самое большое чило - "+ one);
            }else{
                System.out.println("самое большое число - "+ three);
            }
        } else if (two>three) {
            System.out.println("Самое большое число - "+ two);
        }else {
            System.out.println("Самое бьльшое число - " + three);
        }
    }
    }

