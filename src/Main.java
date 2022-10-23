
/*
компьютер должен загадать число от 0 до 9
пользователю нужно угодать число
в программе должен вестись подсчет количества попыток угадывания
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int userNum;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Задача: угадай число от 0 до 9");

        int num = (int)Math.floor(Math.random() * 10);

        do {
            count++;
            System.out.println("введите число");
            userNum = input.nextInt();

            if (userNum > num) {
                System.out.println(" мое число меньше");
            } else if (userNum < num) {
                System.out.println(" мое число больше");
            } else {
                System.out.println(" вы угадали мое число - " + userNum);
            }
        } while (userNum != num);

        System.out.println("число попыток " + count);
    }
 }