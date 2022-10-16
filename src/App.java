import java.util.Scanner; // импорт библиотеки
public class App {
    // однострочный коментарий
    /*
    многострочный комментарий
     */
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        /*ввод с клавиатуры
         Scanner input = new Scanner
         (System.in);
         int age = input.nextInt(); */

        /*
        задача 1
            1. если меньше или равен 18 - молодой
            2. если меньше 65 и больше 18 - взрослый
            3. если больше или равен 65 - пенсионер
         */
       System.out.println("введите возраст:");
       Scanner input = new Scanner(System.in);
        int age = input.nextInt();
       if (age <= 18) {
           System.out.println("молодой");
       } else if(age < 65) {
       } else {
//            System.out.println("пенсионер");
//        }
//
//        }

        System.out.println("введите число 1:");
        Scanner input = new Scanner(System.in);
        int number1  = input.nextInt();
        System.out.println("введите число 2:");
        int number2  = input.nextInt();
        if (number1 > number2) {
            System.out.println("первое число больше второго");

    } else if(number1 < number2) {
        System.out.println("первое число меньше второго");
    } else {
        System.out.println(" числа равны");
    }
    }
}



