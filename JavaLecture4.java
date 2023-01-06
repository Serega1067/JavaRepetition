import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.Deque;
import java.util.ArrayDeque;

public class JavaLecture4 {
    public static void main(String[] args) {
        /*
         * Java: знакомство и как пользоваться базовым API.
         * Хранение и обработка данных ч1: приоритетные коллекции.
         * Зачем разные коллекции.
         * 1. Способ обработки данных.
         * 2. Решаемые задачи.
         */

        // LinkedList.
        // Представляем собой двусвязный список.
        // Список - гибкая структура данных, позволяющая мелко
        // менять свой.
        // Элементы доступны для вставки или удаления в любой позиции.
        LinkedList<Integer> ll = new LinkedList<Integer>();
        ll.add(1);
        ll.add(2);
        ll.add(3);
        System.out.println(ll);
        for (int i : ll) {
            System.out.println(i);
        }

        // Queue.
        // Очередь.
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println(queue); // [1, 2, 3, 4]
        queue.remove();
        System.out.println(queue); // [2, 3, 4]
        int item = queue.remove();
        System.out.println(queue); // [3, 4]
        System.out.println(item); // 2
        queue.offer(2809);
        System.out.println(queue); // [3, 4, 2809]
        item = queue.remove();
        System.out.println(queue); // [4, 2809]
        item = queue.poll();
        System.out.println(item); // 4
        System.out.println(queue); // [2809]
        // В случае если извлекается элемент из очереди в которой
        // элементов нет появится сообщение об исключении
        // java.util.NoSuchElementException.
        // Есть механизмы позволяющие получить данные без этой
        // ошибки или посмотреть, что будит извлекаться.
        Queue<Integer> queue1 = new LinkedList<Integer>();
        System.out.println(queue1); // []
        queue1.add(1);
        System.out.println(queue1); // [1]
        int item1 = queue1.remove();
        System.out.println(queue1); // []
        System.out.println(item1); // 1
        queue1.offer(2809);
        System.out.println(queue1); // [2809]
        int item3 = queue1.poll();
        System.out.println(queue1); // []
        System.out.println(item3); // 2809
        // int item2 = queue1.remove(); // java.util.NoSuchElementException
        queue1.remove(2809); // зачем очередь??
        System.out.println(queue1); // []
        queue.element();
        System.out.println(queue); // [2809]
        queue.peek();
        System.out.println(queue); // [2809]
        queue1.peek();
        System.out.println(queue1);

        // PriorityQueue.
        // Наивысший приоритет имеет "наименший" элемент.
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(123);
        pq.add(3);
        pq.add(13);
        pq.add(1);
        System.out.println(pq);        // [1, 3, 13, 123]
        System.out.println(pq.poll()); // 1
        System.out.println(pq.poll()); // 3
        System.out.println(pq.poll()); // 13
        System.out.println(pq.poll()); // 123
        System.out.println(pq);        // []
        System.out.println(pq.poll()); // null
        System.out.println(pq.poll()); // null
        
        // Deque.
        // Линейная коллекция, которая поддерживает вставку
        // и удаление элементов на обоих концах.
        /*
        Deque<Integer> deque = new ArrayDeque<>();
        deque.addFirst(1); deque.addLast(2);
        deque.removeFirst(); deque.removeLast();
        deque.offerFirst(1); deque.offerLast(2);
        deque.pollFirst(); deque.pollLast();
        deque.getFirst(); deque.getLast();
        deque.peekFirst(); deque.peekLast();
        */

        // Stack.
        // Stack представляет собой обработку данных по принципу
        // LIFO.
        // Расширяет Vector пятью операциями, которые позволяют
        // рассматривать вектор как стек.
        // push(E item)
        // pop()
        // Задача.
        // Вычислить значение выражения в постфиксной форме записи.
        // 1+2*3   (1+2)*3
        // 123*+    12+3*
        // Код написать самому.
    }
}