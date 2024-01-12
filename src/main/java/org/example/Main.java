package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите возраст");
        int x = scanner.nextInt();
        if (x > 18) {
            System.out.println("Ты не достик совершенолетия");
        }
        if (x <= 18) {
            System.out.println("Ты достиг совершенолетия");
        }
        System.out.println("Был бы внимательным прочитал бы что сначало ни гите создавать гужно");
    }
}