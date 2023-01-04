import java.io.File;
import java.io.IOException;
import java.util.logging.*;

public class JavaLecture2 {
    public static void main(String[] args) throws SecurityException,
                                                  IOException {
        /*
         * Java: знакомство и как пользоваться базовым API.
         */

        /*
        // Создадим строку из 1 мил. плюсиков.
        String str = "";
        for (int i = 0; i < 1_000_000; i++) {
            str += "+"; // время выполнения 41000 ms
        }
        System.out.println(str);
        */

        /*
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            sb.append("+"); // время выполнения 9 ms
        }
        System.out.println(sb);
        */

        /*
        // Измерение времени работы кода.
        var s = System.currentTimeMillis();
        // String str = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1_000_000; i++) {
            // str += "+";
            sb.append("+");
        }
        System.out.println(System.currentTimeMillis() - s);
        // System.out.println(str);
        System.out.println(sb);
        */

        /*
         * Работа со строкоми.
         * concat(): объединение строк.
         * valueOf(): преобразует Object в строковое представление
         * (завязан на toString()).
         * join(): объединяет набор строк в одну с учётом разделителя.
         * charAt(): получение символа по индексу.
         * indexOf(): первый индекс вхождения подстроки.
         * lastIndexOf(): последний индекс вхождения подстроки.
         * startsWith()/endsWith(): определяет, начинается/заканчивается
         * ли строка с подстроки.
         * replace(): замена одной подстроки на другую.
         * trim(): удаляет начальные и конечные пробелы.
         * substring(): возвращает подстроку, см.аргументы.
         * toLowerCase()/toUpperCase(): возвращает новую строку в
         * нижнем/верхнем регистре.
         * compareTo(): сравнивает две строки.
         * equals(): сравнивает строки с учётом регистра.
         * equalsIgnoreCase(): сравнивает строки без учёта регистра.
         * regionMatches(): сравнивает подстроки в строках.
         */

        /*
        String[] name = {"С", "е", "р", "г", "е", "й"};
        String sk = "СЕРГЕЙ КА.";
        System.out.println(sk.toLowerCase()); // сергей ка.
        System.out.println(String.join("", name)); // Сергей
        System.out.println(String.join("", "С", "е", "р", "г", "е", "й"));
        // С,е,р,г,е,й
        System.out.println(String.join(",", "С", "е", "р", "г", "е", "й"));
        // Сергей
        */
        
        // Много поиска - String. Если приходится много искать. Если
        // разбираете готовый полученный материал.
        // Много изменений - StringBuilder. Если приходится много
        // изменять строки. Если компонуете, то есть собираете
        // материал.
        
        // Работа с файловой системой. Файлы.
        /*
        File f1 = new File("file.txt");
        File f2 = new File("C:/Users/sereg/JavaRepetition/file.txt");
        */

        // Пример как получить путь к попке с помощью константного
        // зночения sistem.dir
        /*
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        // /Users/sereg/JavaRepetition/file.txt;
        */

        // Работа с файловой системой. Файлы. Ошибки.
        /*
        try {
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/file.txt");
            File f3 = new File(pathFile);
            System.out.println("try");
        } catch (Exception e) {
            System.out.println("catch");
        }
        finally
        {System.out.println("finally");}
        */

        /*
         * Работа с файловой системой.
         * isHidden(): возвращает истину, если каталог или файл
         * является скрытым.
         * length(): возвращает размер файла в байтах.
         * lastModified(): возвращает время последнего изменения
         * файла или каталога.
         * list(): возвращает массив файлов и подкаталогов, которые
         * находятся в каталоге.
         * listFiles(): возвращает массив файлов и подкаталогов,
         * которые находятся в определённом каталоге.
         * mkdir(): создаёт новый каталог.
         * renameTo(File dest): переименовывает файл или каталог.
         */

        // Работа с файловой системой. Каталоги.
        /*
        String pathProject = System.getProperty("user.dir");
        String pathDir = pathProject.concat("/files");
        File dir = new File(pathDir);
        System.out.println(dir.getAbsolutePath());
        if (dir.mkdir()) {
            System.out.println("+");
        } else {
            System.out.println("-");
        }
        for (String fname : dir.list()) {
            System.out.println(fname);
        }
        */
        
        // Работа с файловой системой. Бинарные файлы.

        // Логирование. Использование. Основы.
        // Использование.
        // Logger logger = Logger.getLogger();
        // Уровни важности.
        // INFO, DEBUG, ERROR, WARNING и др.
        // Вывод.
        // ConsoleHandler info = new ConsoleHandler();
        // log.addHandler(info);
        // Формат вывода: структурированный, абы как*
        // XMLFormatter, SimpleFormatter
        Logger logger = Logger.getLogger(JavaLecture2.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log.xml");

        // logger.addHandler(ch);
        logger.addHandler(fh);

        // SimpleFormatter sFormat = new SimpleFormatter();
        XMLFormatter xml = new XMLFormatter();
        // ch.setFormatter(sFormat);
        // ch.setFormatter(xml);
        fh.setFormatter(xml);
        
        // logger.setLevel(Level.INFO);
        logger.log(Level.WARNING, "Тестовое логирование 1");
        logger.info("Тестовое логирование 2");
    }
}