import java.util.Set;
import java.util.HashSet;
import java.util.Arrays;

public class JavaLecture6 {
    public static void main(String[] args) {
        // Java: знакомство и как пользоваться базовым API.
        // Хранение и обработка данных ч3: множество коллекций Set.
        /*
         * Set.
         * Коллекции содержат уникальные элементы.
         * Быстрая работа с данными.
         * "Основан" на Map'ах без пары.
         * Порядок добавления не хранится.
         */

        /*
         * HashSet.
         * isEmpty() - проверка на пустоту.
         * add(V) - добавление элемента в коллекцию.
         * remove(V) - удаление элемента из коллекции.
         * contains(V) - проверка на включение элемента в коллекции.
         * clear(V) - удаление всех элементов в коллекции.
         * size() - возвращает количество элементов коллекции.
         */

        Set<Integer> set = new HashSet<>();
        set.add(1);
        set.add(12);
        set.add(123);
        set.add(1234);
        set.add(1234);
        System.out.println(set); // [1, 1234, 123, 12]
        System.out.println(set.contains(12)); // true
        set.add(null);
        System.out.println(set.size()); // 5
        System.out.println(set); // [null, 1, 1234, 123, 12]
        set.remove(12);
        System.out.println(set); // [null, 1, 1234, 123]
        for (var item : set) System.out.println(item);
        // null 1 1234 123
        set.clear();
        System.out.println(set); // []

        /*
         * HashSet как синоним множества.
         * addAll(Coll) - объединение множества.
         * retainAll(Coll) - пересечение множества.
         * removeAll(Coll) - разность множества.
         */
        var a = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7));
        var b = new HashSet<>(Arrays.asList(2,3,5,7,11,13,17));
        var u = new HashSet<Integer>(a); u.addAll(b);
        var r = new HashSet<Integer>(a); r.retainAll(b);
        var s = new HashSet<Integer>(a); s.removeAll(b);
        System.out.println(a); // [1, 2, 3, 4, 5, 6, 7]
        System.out.println(b); // [17, 2, 3, 5, 7, 11, 13]
        System.out.println(u); // [1, 17, 2, 3, 4, 5, 6, 7, 11, 13]
        System.out.println(r); // [2, 3, 5, 7]
        System.out.println(s); // [1, 4, 6]
        boolean res = a.addAll(b);
        System.out.println(res); // true

        /*
         * HashSet как синоним множества.
         * first()
         * last()
         * headSet(E)
         * tailSet(E)
         * subSet(E1, E2)
         */

        // TreeSet.
        // В основе HashMap.
        // Упорядочен по возрастанию.
        // null'ов быть не может.  

        // LinkedHashSet.
        // В основе HashMap.
        // Помнит порядок.
        // Использовать, когда нужен HashSet c запоминанием
        // порядка элемента.

        /*
         * LinkedHashSet основные операции.
         * isEmpty() - проверка на пустоту.
         * add(V) - добовление элемента в коллекцию.
         * remove(V) - удаление элемента из коллекции.
         * contains(V) - проверка на включение элемента в коллекцию.
         * clear() - удаление всех элементов коллекции.
         * size() - возвращает количество элементов коллекции.
         */

        // Введение в создание собственных типов.
    }
}