import java.io.*;
import java.util.Scanner;

// инфо по классу BufferedReader здесь: https://javarush.com/groups/posts/1919-schitihvanie-s-klaviaturih--riderih
// инфо также здесь: https://youtu.be/TR8-chtKXFQ
// и также здесь: https://youtu.be/-RiS_nFl9ok
public class zadanie4_9_1 {
    /* 4. Используя Scanner на основе FileInputStream, прочесть из файла строку:
название другого файла. Из этого другого файла прочесть название третьего
файла, и в третий файл записать букву, которую пользователь введет через
System.in (без сканера). */

    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new FileReader("File4_9_1_num1.txt"));
        System.out.println("Из 1-го файла читаем строку с назваеием 2-го файла:");
        InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream("File4_9_1_num1.txt"));
        Scanner scan = new Scanner(inputStreamReader);
        String str_1 = scan.nextLine();
//        String str_2 = scan.nextLine();
//        String str_3 = scan.nextLine();
        System.out.println(str_1);
//        System.out.println(str_2);
//        System.out.println(str_3);

        System.out.println("Из 2-го файла читаем название 3-го файла:");
        InputStreamReader inputStreamReader2 = new InputStreamReader(new FileInputStream(str_1));
        Scanner scan2 = new Scanner(inputStreamReader2);
        String str_4 = scan2.nextLine();
        System.out.println(str_4);

        System.out.println("Вводим букву для записи в третий файл.");
        System.out.println("Введите букву:");
        BufferedReader bufferReader = new BufferedReader(new InputStreamReader(System.in));
        String letter = bufferReader.readLine();

        FileOutputStream fileOutputStream = new FileOutputStream(str_4);
        fileOutputStream.write(letter.getBytes());
        fileOutputStream.close();
        System.out.println("Буква записана в третий файл.");
    }
}