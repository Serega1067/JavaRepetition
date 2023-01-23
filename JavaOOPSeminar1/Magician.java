package JavaOOPSeminar1;

public class Magician {
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    // Конструктор
    public Magician() {
        name = "Vasya";
        attack = 17;
        protection = 12;
        shots = 0;
        damage[0] = -5; damage[1] = -5;
        health = 30;
        speed = 9;
        delivery = false;
        magic = true;
    }

    /**
     * Дополнительный конструктор с параметром имя и скорость
     * @param name
     * @param speed
     */
    public Magician(String name, int speed) {
        this();
        this.name = name;
        this.speed = speed;
    }

    /**
     * Дополнительный конструктор с параметрам имя
     * @param name
     */
    public Magician(String name) {
        this();
        this.name = name;
    }

    public String getName() {
        // return this.name;
        return String.format("Маг с именем: %s", name);
    }
}