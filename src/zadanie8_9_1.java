import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class zadanie8_9_1 {
    /* 8. Пользователь вводит 10 строк, потом число max. Вывести в stdout те
строки, длина которых меньше max, а в stderr те, длинна которых больше,
обрезав по max. */
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        PrintStream err = System.err;
        PrintStream out = System.out;

        System.out.println("Введите десять строк: ");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        String str3 = scanner.nextLine();
        String str4 = scanner.nextLine();
        String str5 = scanner.nextLine();
        String str6 = scanner.nextLine();
        String str7 = scanner.nextLine();
        String str8 = scanner.nextLine();
        String str9 = scanner.nextLine();
        String str10 = scanner.nextLine();

        System.out.println("Введите максимальное число символов в строке, max: ");
        int max = scanner.nextInt();

        String shorten1 = str1.length() > max ? str1.substring(0, max) : str1;
        String shorten2 = str2.length() > max ? str2.substring(0, max) : str2;
        String shorten3 = str3.length() > max ? str3.substring(0, max) : str3;
        String shorten4 = str4.length() > max ? str4.substring(0, max) : str4;
        String shorten5 = str5.length() > max ? str5.substring(0, max) : str5;
        String shorten6 = str6.length() > max ? str6.substring(0, max) : str6;
        String shorten7 = str7.length() > max ? str7.substring(0, max) : str7;
        String shorten8 = str8.length() > max ? str8.substring(0, max) : str8;
        String shorten9 = str9.length() > max ? str9.substring(0, max) : str9;
        String shorten10 = str10.length() > max ? str10.substring(0, max) : str10;

        if (str1.length() > max) {
            System.err.println(shorten1);
        } else {
            System.out.println(str1);
        }
        if (str2.length() > max) {
            System.err.println(shorten2);
        } else {
            System.out.println(str2);
        }
        if (str3.length() > max) {
            System.err.println(shorten3);
        } else {
            System.out.println(str3);
        }
        if (str4.length() > max) {
            System.err.println(shorten4);
        } else {
            System.out.println(str4);
        }
        if (str5.length() > max) {
            System.err.println(shorten5);
        } else {
            System.out.println(str5);
        }
        if (str6.length() > max) {
            System.err.println(shorten6);
        } else {
            System.out.println(str6);
        }
        if (str7.length() > max) {
            System.err.println(shorten7);
        } else {
            System.out.println(str7);
        }
        if (str8.length() > max) {
            System.err.println(shorten8);
        } else {
            System.out.println(str8);
        }
        if (str9.length() > max) {
            System.err.println(shorten9);
        } else {
            System.out.println(str9);
        }
        if (str10.length() > max) {
            System.err.println(shorten10);
        } else {
            System.out.println(str10);
        }
    }
}
