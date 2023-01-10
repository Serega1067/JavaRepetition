package JavaOOPLecture1.Ex002;

public class Program {
    static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) +
                         Math.pow(a.y - b.y, 2));
    }

    public static void main(String[] args) {
        // Работо с паметью.
        // a размещается в стеке всё остальное в куче.
        Point2D a = new Point2D(); // экземпляр класса
        a.x = 0; // значения полей
        a.y = 2;
        System.out.println(a.toString());

        Point2D b = new Point2D(); // экземпляр класса
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b));
        // Мы описали некоторую сущность точка при этом можно
        //  сказать, что мы туда инкапсулировали значения x и y.
    }
}