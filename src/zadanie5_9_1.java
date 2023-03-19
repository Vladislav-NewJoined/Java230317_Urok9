import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// инфо по классу BufferedReader здесь: https://javarush.com/groups/posts/1919-schitihvanie-s-klaviaturih--riderih
// инфо также здесь: https://youtu.be/TR8-chtKXFQ
// и также здесь: https://youtu.be/-RiS_nFl9ok
public class zadanie5_9_1 {
    /* 5. Пользователь вводит 7 символов. Используя System.in (без сканнера), считайте целое число
    до первой нецифры.(пример: «35 руб», ответ 35.) считаем, что первым пользователь всегда вводит
    цифру. */

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите исходную строку, первым символом должна быть цифра:");
        String str = reader.readLine();
        System.out.println("Мы ввели с клавиатуры строку:");
        System.out.println(str);

        if (str == null || str.isEmpty()) {
            System.out.println("Некорректно введена исходная строка");
        }

        StringBuilder sb = new StringBuilder();
        boolean found = false;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sb.append(c);
                found = true;
            } else if (found) {
                // Если ранее уже была найдена цифра, а этот символ не является цифрой, останавливаем цикл
                break;
            }
        }
        System.out.println("Мы считали из строки первое целое число:");
        System.out.println(sb);
    }
}