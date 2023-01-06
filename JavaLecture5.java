import java.util.Map;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Hashtable;

public class JavaLecture5 {
    public static void main(String[] args) {
        /*
         * Java: знакомство и как пользоваться базовым API.
         * Хранение и обработка данных ч2: множество коллекций Map.
         */

        // HashMap.
        // Map - это множество коллекций, работающих с данными
        // по принципу <Ключ / Значение>.
        // Ключевые особенности:
        // ускоренная обработка данных;
        // порядок добавления не запоминается.
        // В HashMap элементы распологаются как угодно и могут
        // менять своё положение.
        // Ключевые особенности:
        // допускаются только уникальные ключи, значения
        // могут повторятся;
        // помните про null значения*;
        // ускоренная обработка данных;
        // порядок добавления не запоминается.

        Integer a = 123;
        System.out.println(a.hashCode());
        System.out.println("z".hashCode());

        Map<Integer, String> db = new HashMap<Integer, String>();
        db.putIfAbsent(1, "один"); // положить значение с проверкой,
                                              // что такого значения нет.
        db.put(2, "два");
        db.put(null, "!null"); // можно использовать ключ null.
        System.out.println(db); // {null=!null, 1=один, 2=два}
        System.out.println(db.get(44));
        db.remove(null);
        System.out.println(db); // {1=один, 2=два}
        System.out.println(db.containsValue("один")); // true проверка
                                                             // значения.
        System.out.println(db.containsValue(1)); // false проверка ключа.
        System.out.println(db.containsKey("один")); // false
        System.out.println(db.containsKey(1)); // true
        System.out.println(db.keySet()); // коллекция всех ключей.
        System.out.println(db.values()); // коллекция всех значений.

        /*
         * Основной функционал HashMap.
         * put(K, V) - добавить пару или изменить значение, если
         * ключ имеется.
         * putIfAbsent(K, V) - произвести дибавление если ключ
         * не найден.
         * get(K) - получение значения по указанному ключу.
         * remove(K) - удаляет пару по указанному ключу.
         * containsValue(V) - проверка наличия значения.
         * containsKey(K) - проверка наличия ключа.
         * keySet() - возвращает множество ключей.
         * values() - возвращает набор значений.
         */

        Map<Integer, String> db1 = new HashMap<Integer, String>();
        db1.putIfAbsent(1, "один");
        db.put(2, "два");
        db.put(3, "три");
        System.out.println(db);
        for (var item : db.entrySet()) {
            System.out.printf(
                "[%d: %s]\n", item.getKey(), item.getValue());
        }

        Map<Integer, String> map1 = new HashMap<>(); // какое то
                                                     // знечение массива
                                                     // по умолчанию
                                                     // например 16.
        Map<Integer, String> map2 = new HashMap<>(
            9); // определит точное значение массива 9
                                // на каждом этапе увеличение будит
                                // производится на сколько то раз.
        Map<Integer, String> map3 = new HashMap<>(
            9, 1.0f); // колличество элементов и
                                                  // вторым указывается в 
                                                  // процентном отношении
                                                  // до какого предела можно
                                                  // заполнять значения для
                                                  // того чтобы произвелось
                                                  // удвоение количества 
                                                  // элементов в хранилище.
        // HashMap. Любознательным.
        // Хэш-функции и хэш-таблици.
        // Прямое связывание (хэширование с цепочками).
        // Хэширование с открытой адресацией.
        // Теория графов:
        // деревья построенные на списках
        // бинарные деревья
        // сбалансированные деревья
        // *алгоритм балансировки дерева
        // **красно-чёрные деревья, деревья поиска

        // TreeMap.
        // При дабовлении пары будут упорядочиваться по ключу.
        TreeMap<Integer, String> tMap = new TreeMap<>();
        tMap.put(1, "один");
        System.out.println(tMap); // {1=один}
        tMap.put(6, "шесть");
        System.out.println(tMap); // {1=один, 6=шесть}
        tMap.put(4, "четыре");
        System.out.println(tMap); // {1=один, 4=четыре, 6=шесть}
        tMap.put(3, "три");
        System.out.println(tMap); // {1=один, 3=три, 4=четыре, 6=шесть}
        tMap.put(2, "два");
        System.out.println(tMap); // {1=один, 2=два, 3=три, 4=четыре, 6=шесть}
        /*
         * Методы, на которые нужно обратить внимание.
         * put(K,V)
         * get(K)
         * remove(K)
         * descendingKeySet(V)
         * descendingMap()
         * tailMap()
         * headMap()
         * lastEntry()
         * firstEntry()
         */
        // В основе данной коллекции лежат красно-чёрные деревья.
        // Позволяют быстрее искать, но могут возникнуть "заминки"
        // при добавлении.

        // LinkedHashMap
        // "Старший брат" коллекции HashMap, который всё помнит...
        // Помнит порядок добавления элементов
        // Более медлительный
        Map<Integer, String> linkmap = new LinkedHashMap<>();
        linkmap.put(11, "один один");
        linkmap.put(1, "два");
        linkmap.put(2, "один");
        System.out.println(linkmap); // {11=один один, 1=два, 2=один}
        Map<Integer, String> map = new HashMap<>();
        map.put(11, "один один");
        map.put(2, "два");
        map.put(1, "один");
        System.out.println(map);  // {1=один, 2=два, 11=один один}

        // HashTable
        // "Устаревший брат" коллекции HashMap, который
        // не знает про null.
        Map<Integer, String> table = new Hashtable<>();
        table.put(1, "два");
        table.put(11, "один один");
        table.put(2, "один");
        System.out.println(table); // {2=один, 1=два, 11=один один}
        // table.put(null, "один"); // java.lang.NullPointerException
    }

    // Пример hashCode.
    // #region
    // public int hashCode1() {
    //     int result = (int) (id ^ (id >>> 32));
    //     result = 31 * result + name.hashCode();
    //     result = 31 * result + email.hashCode();
    //     return result;
    // }

    // public int hashCode2() {
    //     final int prime = 31;
    //     int result = 1;
    //     result = prime * result + ((email == null) ? 0 : email.hashCode());
    //     result = prime * result + (int) (id ^ (id >>> 32));
    //     result = prime * result + ((name == null) ? 0 : name.hashCode());
    //     return result;
    // }
    // #endregion
}
