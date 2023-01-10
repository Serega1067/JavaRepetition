package JavaOOPLecture1.Ex003_1;

/*
 * Сущность точка.
 */

// Улучшим данный метод, так как он не соответствует
// Don't Repeat Yourself.
// Коментарии
/**
 * Это точка 2D
 */
public class Point2D {
    /*
    int x, y; // поля, если в начале строкине прописон модификатор
              // доступо, то поумолчанию public
    */
    private int x, y; // если оставить так то мы не сможем
                      // в контексте конкретных экземпляров класса
                      // прописать какое то поведение или какое то
                      // значение для координаты, но и прочитать
                      // не сможем

    // Добавим новое поведение для класса.
    // Опишим некоторые конструкторы.
    /**
     * Это конструктор ...
     * @param valueX это координата X
     * @param valueY это координата Y
     */
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

    public Point2D(int value) {
        /*
        this.x = value; // оброщение к какой то отдельной единице.
                        // Это может быть конструктора или мы можем
                        // обратиться к полю x.
        this.y = value;
        */
        // или можно сделать так
        this(value, value);
    }
    // Верхняя часть это улучшение нижней части с учётом DRY.
    // Это возможно не во всех языках программирования.

    /*
    // Добавим ещё один конструктор.
    // Конструктор по умолчанию.
    public Point2D() {
        x = 0;
        y = 0;
    }
    
    // Добавим ещё один конструктор.
    // Конструктор с одним оргументом.
    public Point2D(int value) {
        x = value;
        y = value;
    }
    // Все конструкторы выше дают возможность делать перегрузку
    // этого метода.
    */

    // Разграничим прова доступа, что бы пользоваться private
    // Доступ к чтению
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    // Дополним класс новым поведением изменить координату.
    // Доступ к записи
    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    // Напишим некоторый метод, который возвращает числовые
    // значения переменных.
    private String getInfo() {
        return String.format("x: %d; y: %d", x, y);
    }
    // После переопредиления метода toString() метод getInfo()
    // ненужен.
    // Поменяем у getInfo() модификатор диступа с public на
    // private и он станет недоступным для всех кроме этого класса.

    // Переопределим метод toString().
    @Override
    public String toString() {
        return getInfo();
    }

    // Определился автоматически подсказнай VSC, чтобы в Program
    // определить distance.
    // public static void distance(Point2D a, Point2D b) {
    // }
    
    /**
     * Перенёа этот метод из Program
     * @param a
     * @param b
     * @return
     */
    public static double distance(Point2D a, Point2D b) {
        return Math.sqrt(Math.pow(a.getX() - b.getY(), 2) +
                         Math.pow(a.getX() - b.getY(), 2));
    }
}