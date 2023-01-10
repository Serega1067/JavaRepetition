package JavaOOPLecture1.Ex003;

/*
 * Сущность точка.
 */
public class Point2D {
    int x, y; // поля

    // Добавим новое поведение для класса.
    // Опишим некоторые конструкторы.
    public Point2D(int valueX, int valueY) {
        x = valueX;
        y = valueY;
    }

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
}