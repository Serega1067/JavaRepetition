import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class JavaLecture1 {
    public static void main(String[] args) throws IOException {
        System.out.println("Goodbye world");
        String s;
        s = "a";
        String str = "b";
        String s_null = null;
        short age = 10;
        int salary = 123456;
        float e = 2.7f;
        double pi = 3.1415;
        double f = 123.45D;
        char ch = '1';
        System.out.println(Character.isDigit(ch)); // true
        ch = 'a';
        System.out.println(Character.isDigit(ch)); // false
        char ch1 = '{';
        System.out.println(ch1);
        ch1 = 123; // неявное преобразование одного типа 
                   // данных в другой консоль вывидет '{'
        System.out.println(ch1);
        int a = 10;
        double d = a; // так можно потому что int 4 байта и
                      // целый тип, а double 8 байт и
                      // вещественный тип
        // a = d; // так делать нельзя в int нельзя положить double
               // нужно использовать преобразование
        boolean flag1 = 123 <= 234;
        System.out.println(flag1); // true
        boolean flag2 = 123 >= 234 || flag1;
        System.out.println(flag2); // true
        boolean flag3 = flag1 ^ flag2; // разделяющая или
                                       // разделительная дизюнкция
                                       // возвращает истину тогда
                                       // когда строго одно из
                                       // значений истенно
        System.out.println(flag3); // false
        boolean flag4 = true | false; // побитовая операция или
        boolean flag5 = true & false; // побитовая операция и
        String msg = "Hello world"; // один символ занимает в
                                    // памяти 2 байта
        System.out.println(msg); // Hello world
        var i1 = 123; // неявная типизация i примет значение int
        var a1 = 123; // 123
        var d1 = 123.456; // 123.456
        System.out.println(i1 + "\n" + a1 + "\n" + d1);
        System.out.printf("%d\n%d\n%f\n", i1, a1, d1);
        System.out.println(getType(d1)); // Double
        // Классы обёртки
        int a2 = 23_123_34; // запись для удобства чтения больших
                            // чисел
        System.out.println(a2);
        System.out.println(Integer.MAX_VALUE);
        String s1 = "qwer";
        System.out.println(s1.charAt(1)); // "w"
        int a3 = 123;
        System.out.println(a3++); // 123
        System.out.println(a3); // 124
        System.out.println(++a3); // 125
        System.out.println(--a3 - a3--); // 0
        System.out.println(a3); // 123
        // Побитовый сдвиг
        int a4 = 8; // в двоичной форме 1000
        a4 = a4 << 1; // побитовый сдвиг влево 10000
        System.out.println(a4); // 16
        int a5 = 18; // в двоичной форме 10010
        System.out.println(a5 >> 1); // побитовый сдвиг вправо
                                     // в двоичной форме 1001 или 9
        int a6 = 5; // 101
        int b = 2; // 010
        System.out.println(a6 | b); // 111 или 7
        // 101
        // 010
        // 111
        System.out.println(a6 & b); // 000 или 0
        // 101
        // 010
        // 000
        System.out.println(a6 ^ b); // 111 или 7
        // 101
        // 010
        // 111
        // Массивы
        // Одномерные
        int[] arr = new int[10];
        System.out.println(arr.length); // 10
        System.out.println(arr[3]); // 0
        arr = new int[] {1, 2, 3, 4, 5};
        System.out.println(arr.length); // 5
        // Многомерные
        int[] arr2[] = new int[3][5];
        for (int[] line : arr2) {
            for (int item : line) {
                System.out.printf("%d ", item);
            }
            System.out.println();
        }
        d = 3.1415;
        i1 = (int)d;
        System.out.println(d);
        System.out.println(i1);
        byte b1 = Byte.parseByte("123");
        System.out.println(b1); // 123
        // b1 = Byte.parseByte("1234"); // тип байт позволяет хранить
                                       // значения от 0 до 255
        // System.out.println(b1); // NumberFormatException: Value out
                                // of range
        //Изучить
        // int[] array = new int[10];
        // double[] array2 = array // изучаем ковариантность и
                                // контравариантность

        // Получение данных из терминала строки
        // Scanner iScanner = new Scanner(System.in);
        // System.out.printf("name: ");
        // String name = iScanner.nextLine();
        // System.out.printf("Hello, %s!", name);
        // iScanner.close();

        // Получение данных из терминала некоторые примитивы
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("int a: ");
        int x = iScanner.nextInt();
        System.out.printf("double a: ");
        double y = iScanner.nextDouble();
        System.out.printf("%d + %f = %f\n", x, y, x + y);

        // Проверка данных из терминала.
        // Проверка на соответствие получаемого типа.
        System.out.printf("int a: ");
        boolean frag = iScanner.hasNextInt();
        System.out.println(frag);
        int n = iScanner.nextInt();
        System.out.println(n);
        iScanner.close();

        // Форматированный вывод.
        int a7 = 1, b2 = 2;
        int c = a7 + b2;
        String res = a7 + " + " + b2 + " = " + c;
        System.out.println(res);

        String s3 = "qwe";
        int a8 = 123;
        String q = s3 + a8;
        System.out.println(q);

        String res1 = String.format("%d + %d = %d \n", a7, b2, c);
        System.out.printf("%d + %d = %d \n", a7, b2, c);
        System.out.println(res1);

        /*
         * Виды спецификаторов:
         * %d: целочисленных значений.
         * %x: для вывода шестнадцатеричных чисел.
         * %f: для вывода чисел с плавающей точкой.
         * %e: для вывода чисел в экспоненциальной форме, например 3.1415e+01.
         * %c: для вывода одиночного символа.
         * %s: для вывода строковых значений.
         */

        float pi1 = 3.1415f;
        System.out.printf("%f\n", pi1); // 3,141500
        System.out.printf("%.2f\n", pi1); // 3,14
        System.out.printf("%.3f\n", pi1); // 3,141
        System.out.printf("%e\n", pi1); // 3,141500e+00
        System.out.printf("%.2e\n", pi1); // 3,14e+00
        System.out.printf("%.3e\n", pi1); // 3,141e+00

        // Область видимости переменных.
        {
            int a9 = 222;
            System.out.println(a9);
        }
        int a9 = 123;
        System.out.println(a9);
        
        sayHi(); // hi!
        System.out.println(sum(1, 3)); // 4
        System.out.println(factor(5)); // 120.0

        // Управляющие конструкции:
        // условный оператор
        int a10 = 1;
        int b3 = 2;
        int c1;
        if (a10 > b3) {
            c1 = a10;
        } else {
            c1 = b3;
        }
        System.out.println(c1);
        if (a10 > b3) c1 = a10;
        if (b3 > a10) c1 = b3;
        System.out.println(c1);
        int min = a10 < b3 ? a10 : b3;
        System.out.println(min);
        
        // Оператор выбора.
        int mounth = 1;
        String text = "";
        switch (mounth) {
            case 1:
                text = "Autumn";
                break;
            default:
                text = "mistake";
                break;
        }
        System.out.println(text);
        
        int a11 = 5;
        switch (a11) {
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("a");
                break;
            case 10: System.out.println("b");
                break;
        }

        // Циклы.
        // while, do while
        int value = 321;
        int count = 0;

        while (value != 0) {
            value /= 10;
            count++;
        }
        System.out.println(count);
        value = 321;
        count = 0;

        do {
            value /= 10;
            count++;
        } while (value != 0);
        System.out.println(count);

        // Опураторы для управления циклами - continue и break.
        // Выполнение следующей итерации цикла - continue.
        // Прерывание текущей итерации цикла - break.
        // * ближайшего к оператору.
        for (int i = 0; i < 10; i++) {
            if (i % 2 == 0)
                continue;
            System.out.println(i);
        }

        // Вложенные циклы.
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        int[] array = new int[]{1, 2, 3, 4, 5, 77};
        for (int item : array) {
            System.out.println(item);
        }
        
        // Работа с файлами.
        // Создание и запись\ дозапись.
        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        // Чтение, вариант посимвольно.
        FileReader fr = new FileReader("file.txt");
        int c2;
        while ((c2 = fr.read()) != -1) {
            char ch2 = (char) c2;
            if (ch2 == '\n') {
                System.out.print(ch2);
            } else {
                System.out.print(ch2);
            }
        }

        // Вариант построчно.
        BufferedReader br = new BufferedReader(new FileReader("file.txt"));
        String str1;
        while ((str1 = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str1);
        }
        br.close();
    }

    static String getType(Object o) {
        return o.getClass().getSimpleName();
    }

    /**
     * Типы данных.
     * Cсылочные:
     * Массивы
     * Примитивные:
     * boolean - логический тип данных
     * int, short, long и т.д. - множество целочисленных типов
     * данных (отличаются объёмом памяти, который они занимают)
     * float, double - вещественные типы данных
     * Char - символьный тип данных (неявно является числовым)
     */
    // Футкции и методы.
    static void sayHi() {
        System.out.println("hi!");
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static double factor(int n) {
        if (n == 1) return 1;
        return n * factor(n -1);
    }
}