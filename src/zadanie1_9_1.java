import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class zadanie1_9_1 {
    // 1. Пользователь вводит три строки, выведите в обратном порядке
    // Инфо здесь: Урок2 Модуль1 мин 38.19
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ВНИМАНИЕ: НЕ СОВСЕМ ПОНЯТНА СУТЬ ВОПРОСА, ПОЭТОМУ ВЫВОЖУ ДВА РЕЗУЛЬТАТА,\nВ ЗАВИСИМОСТИ ОТ ПРАВИЛЬНОГО ТОЛКОВАНИЯ СУТИ ВОПРОСА.");
        System.out.println("Введите три строки:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();

        {
            System.out.println();
            System.out.println("Выводим строки в обратном порядке:");
            {
                List<String> list = Arrays.asList(str1, str2, str3);

                // используем `ListIterator` для перебора списка в обратном порядке
                ListIterator<String> itr = list.listIterator(list.size());

                // `hasPrevious()` возвращает true, если в списке есть предыдущий элемент
                while (itr.hasPrevious()) {
                    System.out.println(itr.previous());
                }
            }
        }
        {
            System.out.println();
            System.out.println("Выводим строки в обратном порядке, имеем в виду 'переставляем символы в обратном порядке':");
            {
                int i1 = str1.length() - 1;
                while (i1 >= 0) {
                    System.out.print(str1.charAt(i1));
                    i1 = i1 - 1;
                }
                System.out.print("\n");
                int i2 = str2.length() - 1;
                while (i2 >= 0) {
                    System.out.print(str2.charAt(i2));
                    i2 = i2 - 1;
                }
                System.out.print("\n");
                int i3 = str3.length() - 1;
                while (i3 >= 0) {
                    System.out.print(str3.charAt(i3));
                    i3 = i3 - 1;
                }
            }
        }
    }
}