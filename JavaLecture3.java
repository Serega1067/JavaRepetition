import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Iterator;

public class JavaLecture3 {
    public static void main(String[] args) {
        /*
         * Java:
         * Знакомство и как пользоваться базовыми API.
         * Коллекции Java. Введение.
         * Object.
         * Тип данных Object - "всему голова".
         * Упаковка - любой тип можно положить в переменную
         * типа Object.
         * Распаковка - преобразование Object-переменной в
         * нужный тип.
         * Иерархия типов - любой тип "ниже" Object'а.
         */

        /*
        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o);      // java.lang.Double

        System.out.println(Sum(1, 2));
        System.out.println(Sum(1.0, 2));
        System.out.println(Sum(1, 2.0));
        System.out.println(Sum(1.2, 2.1));
        System.out.println(Sum("каша", "маша"));
        // Пользоваться методом Object нужно очень осторожно.
        */

        /*
        // Массивы.
        int[] a = new int[] {1, 9};
        int[] b = new int[3];
        System.arraycopy(a, 0, b, 0, a.length);
        for (int i : a) { System.out.printf("%d ", i);} // 1 9
        for (int j : b) { System.out.printf("%d ", j);}
        // 0 9 0 0 0 0 0 0 0 0

        int[] a1 = new int[] {0, 9};
        for (int i : a) { System.out.printf("%d ", i);}
        a1 = AddItem(a, 2);
        a1 = AddItem(a, 3);
        for (int j : a) { System.out.printf("%d ", j);}
        */

        // Иерархия коллекций. ArrayList.
        // "Удобный массив."
        // Разные способы создания.
        // ArrayList list = new ArrayList();
        /*
         * Иерархия коллекций. List.
         * List - пронумерованный набор элементов.
         * Пользователь этого интерфейса имеет точный контроль
         * над тем, где в списке вставляется каждый элемент.
         * Пользователь может обращаться к элементу по их
         * целочисленному индексу (позиции в списке) и искать элемент
         * в списке.
         * ArrayList, LinkedList (Vector, Stack - устаревшие).
         */

        /*
        ArrayList list = new ArrayList(); // Не эфективно.
                                          // Переменная определяется
                                          // как Object.
                                          // Это сырой вариант.
                                          // Но сюда можно положить
                                          // не только число но и строку.
        list.add(2809);
        for (Object o : list) {
            System.out.println(o);
        }

        // Так эффективнее. Коллекции через обобщение.
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(2809);
        for (Object o : list1) {
            System.out.println(o);
        }
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>(10);
        ArrayList<Integer> list4 = new ArrayList<>(list3);
        */

        /*
         * Коллекции. Функционал.
         * add(args) - добавляет элемент в список (в т. ч. на
         * нужную позицию).
         * get(pos) - возвращает элемент из списка по указанной
         * позиции.
         * indexOf(item) - первое вхождение или -1.
         * lastIndexOf(item) - последнее вхождение или -1.
         * remove(pos) - удаление элемента на указанной позиции
         * и его возвращение.
         * set(int pos, T item) - помещает значение item, который
         * находится на позиции pos.
         * void sort(Comparator) - сортирует набор данных по правилу.
         * subList(int start, int end) - получение набора данных
         * от позиции start до end.
         */

        /*
        int day = 29;
        int month = 9;
        int year = 1990;
        Integer[] date = { day, month, year };
        List<Integer> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        */
        StringBuilder day = new StringBuilder("28");
        StringBuilder month = new StringBuilder("9");
        StringBuilder year = new StringBuilder("1990");
        StringBuilder[] date = new StringBuilder[] {day,
                                                    month,
                                                    year};
        List<StringBuilder> d = Arrays.asList(date);
        System.out.println(d); // [29, 9, 1990]
        date[1] = new StringBuilder("09");
        System.out.println(d); // [29, 09, 1990]
        
        /*
         * Коллекции. Функционал.
         * clear() - очистка списка.
         * toString() - "конвертация" списка в строку.
         * Arrays.asList - преобразует массив в список.
         * containsAll(col) - проверяет включение всех элементов
         * из col.
         * removeAll(col) - удаляет элементы, имеющиеся в col.
         * retainAll(col) - оставляем элементы, имеющиеся в col.
         * toArray() - конвертация списка в массив Object'ов.
         * toArray(type array) - конвертация списка в массив type.
         * List.copyOf(col) - возвращает копию списка на основе
         * имеющегося.
         * List.of(item1, item2, ...) - возвращает неизменяемый
         * список.
         */

        Character value = null;
        List<Character> list1 = List.of('S', 'e', 'r', 'g', 'e', 'y');
        System.out.println(list1);
        // list1.remove(1); // java.lang.UnsupportedOperationException
        List<Character> list3 = new ArrayList<Character>();
        list3.add('S');
        list3.add('e');
        list3.add('r');
        System.out.println(list3);
        list3.remove(1); // [S, r]
        System.out.println(list3);
        List<Character> list2 = List.copyOf(list1);
        System.out.println(list2);

        // Итератор.
        List<Integer> list4 = List.of(1, 12, 123, 1234, 12345);
        for (int item : list4) {
            System.out.println(item);
        }
        Iterator<Integer> col = list4.iterator();
        System.out.println();
        while (col.hasNext()) {
            System.out.println(col.next());
            // col.next();
            // col.remove();
        }
        
        // Классический итератор.
        // Можно использовать hasNext(), next(), remove().
        // Более общий функционал ListIterator<E>.
        // Можно использовать hasPrevious(), E previous(),
        // nextIndex(), previousIndex(), set(E e), add(E e)
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
    
    static Object Sum(Object a, Object b) {
        if (a instanceof Double && b instanceof Double) {
            return (Object)((Double) a + (Double) b);
        } else if (a instanceof Integer && b instanceof Integer) {
            return (Object)((Integer) a + (Integer) b);
        } else return 0;
    }

    static int[] AddItem(int[] array, int item) {
        int length = array.length;
        int[] temp = new int[length + 1];
        System.arraycopy(array, 0, temp, 0, length);
        temp[length] = item;
        return temp;
    }
}