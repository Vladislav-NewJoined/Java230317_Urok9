import java.util.Scanner;

// инфо здесь: https://youtu.be/-RiS_nFl9ok
public class zadanie7_9_1 {
    // 7. Пользователь вводит 10 строк. Те из них, в которых есть восклицательный знак, выведите в stderr. Попробуйте использовать цикл.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите десять строк:");
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

        String M[] = new String[10];
        String sSymbol = "!"; // ищем воскпицательный знак

        // заполнение массива значениями
        M[0] = str1;
        M[1] = str2;
        M[2] = str3;
        M[3] = str4;
        M[4] = str5;
        M[5] = str6;
        M[6] = str7;
        M[7] = str8;
        M[8] = str9;
        M[9] = str10;

        {
            System.out.println();
            System.out.println("Выводим в stderr строки, содержащие восклицательный знак:");
            // поиск символа "!"
            //f_is = false;
            for (int i = 0; i < M.length; i++)
                if (M[i].contains(sSymbol)) {
                    System.err.println(M[i]);
                }
        }
    }
}

