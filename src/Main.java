
//Надо реализовать метод, который принимает на вход String, удаляет рядом стоящие парные буквы и возвращает остаток. Примеры ожидаемого поведения программы:
//"aab" -> "b", "aabb" -> "", "abfbaf" -> "abfbaf”, "abccbaf" -> "f"
//Реализовать метод и описать его алгоритмическую сложность. Напишите junit-тесты.
import java.util.Scanner;
public class Main
    {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.print("Введите строку");
            String inputStr = in.nextLine();
            String outputStr = "";
            System.out.println(inputStr);
            int outChars = 0;
            char charToDelete = '.';
            for (int i = 0; i < inputStr.length(); i++) {
                // Если исходящая строка пустая или текущий входящий не совпал с предыдущим записанным
                if ((outChars == 0) || !((outputStr.charAt(outChars - 1) == inputStr.charAt(i)))) {
                    outputStr += inputStr.charAt(i);
                    outChars++;
                    charToDelete = inputStr.charAt(i);
                } else {
                    outputStr = outputStr.substring(0, outChars - 1);
                    outChars--;
                }
            }
            System.out.println(outputStr);
        }
    }

