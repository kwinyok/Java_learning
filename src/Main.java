
/*
компьютер должен загадать число от 0 до 9
пользователю нужно угодать число
в программе должен вестись подсчет количества попыток угадывания
 */

import java.util.Scanner;

public class Main {

    public static void solutionSingleNum() {
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
    public static void solutionDoubleNums() {
        int userNum1 = -1;
        int userNum2 = -1;
        int count = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("ЗАДАЧА: угадай 2 число (от 1 до 15 и от 0 до 5");
        int num1 = (int) Math.floor(Math.random() * 15 + 1);
        int num2 = (int) Math.floor(Math.random() * 6);

        do {
            count++;

            if (userNum1 != num1) {
                System.out.println("введите ваше 1 число:");
                userNum1 = input.nextInt();

                if (userNum1 < num1) {
                    System.out.println("число 1 меньше");
                } else if (userNum1 > num1) {
                    System.out.println("число 1 больше");
                } else {
                    System.out.println("первое число равно" + userNum1);
                }
            }
            if (userNum2 != num2) {
                System.out.println("введите ваше 2 число:");
                userNum2 = input.nextInt();

                if (userNum2 < num2) {
                    System.out.println("число 2 меньше");
                } else if (userNum2 > num2) {
                    System.out.println("число 2 больше");
                } else {
                    System.out.println("второе число равно" + userNum1);
                }
            }
        } while (userNum2 != num2 || userNum1 != num1);
        System.out.println("число затраченых попыток" + count);
    }

            public static void main(String[] args) {
            System.out.println("выберите вариант решения \n" +
                    " ('1' - угадывание одного числа) \n" +
                    " ('2' - угадывание двух чисел)");
            Scanner input = new Scanner(System.in);
            int solN = input.nextInt();
            if (solN == 1) {
                solutionSingleNum();
            }else if (solN == 2) {
                solutionDoubleNums();
            } else{
                System.out.println(" я хз");
            }

                solutionSingleNum();

                solutionDoubleNums();
            }

    }