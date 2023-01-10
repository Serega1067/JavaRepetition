package JavaOOPLecture1.Ex003_1;

public class Program {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getY(), 2) +
                         Math.pow(a.getX() - b.getY(), 2));
    }

    public static void main(String[] args) {
        // Работо с паметью.
        // a размещается в стеке всё остальное в куче.
        // Point2D a = new Point2D(); // экземпляр класса
        Point2D a = new Point2D(0, 2); // экземпляр класса
        // Доступ к записи нового значения
        a.setX(0); // значения полей
        a.setY(2);
        System.out.println(a.toString());

        Point2D b = new Point2D(0, 10); // экземпляр класса
        b.setX(0);
        b.setY(10);
        // Так как мы переопределили метод toString() его
        // поведение изменилось.
        System.out.println(b.toString());
        System.out.println(distance(a, b));
        // Мы описали некоторую сущность точка при этом можно
        //  сказать, что мы туда инкапсулировали значения x и y.

        Point2D a1 = new Point2D(0, 2);
        System.out.println(a1);
        Point2D b1 = new Point2D(0, 10);
        System.out.println(distance(a1, b1));

        Point2D b2 = new Point2D(10);
        System.out.println(b2);
        System.out.println(distance(a1, b2));

        // System.out.println(a.getInfo()); // стал недоступным,
        // так как мы поменяли его модификатор доступа в классе
        // Point2D.java с public на private.

        // Вывод изменился после переопредиления метода toString().
        System.out.println(b2);

        System.out.println(a);

        // Чтобы создать VSC подсказал создать в Point2D
        // дополнительный метод.   
        // Теперь функционам вынесен в отдельную сущьноть.
        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}