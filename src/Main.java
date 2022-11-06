import java.util.Scanner;

public class Main {

    private static final String word = "ярослав";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        System.out.println("Hello world!");
        int length = word.length();

        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < length; i++) {
            stringBuilder.append("-");

        }
        String wordMask = stringBuilder.toString();
        System.out.println(wordMask);

        do {
            System.out.println("введите букву:");
            char c = input.next().charAt(0);

            if (word.indexOf(c) >= 0) {
                System.out.println("такая буква есть в слове");

                for (int i = 0; i < word.length(); i++) {
                    if (word.charAt(i) == c) {
                        wordMask = replaceLetter(Character.toString(c), wordMask);
                    }
                }
                System.out.println(wordMask);
            } else {
                System.out.println("попробуй снова");
            }
        } while (wordMask.contains("-"));
    }

    private static String replaceLetter(String letter, String wordMask) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter.charAt(0)) {
                stringBuilder.append(letter);
            } else if (wordMask.charAt(i) != '-') {
                stringBuilder.append(wordMask.charAt(i));
            } else {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }


}