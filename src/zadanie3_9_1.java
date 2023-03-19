import java.io.IOException;
import java.io.*;
    // инфо здесь: https://youtu.be/TR8-chtKXFQ
public class zadanie3_9_1 {
    // 3. Используя System.in (без сканнера),считайте слово до пробела. Макс размер слова 10 символов.
    public static void main(String[] args) throws IOException {
        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку с, как минимум, одним пробелом, например 'We love java':");
        String text = buff.readLine();
        String words[] = text.split(" ");

        buff.close();
        System.out.println("Выводим (считываем) слово до пробела:");
        System.out.println(words[0]);
    }
}
