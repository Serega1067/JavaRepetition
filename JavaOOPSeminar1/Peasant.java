package JavaOOPSeminar1;

class Peasant {
    /*
    int a; // Поля примитивных типов

    // Поля методов
    int dist(int x, int y) {
        return 0;
    }
    */
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    public Peasant() {
        name = "Vasya";
        attack = 1;
        protection = 1;
        shots = 0;
        damage[0] = 1; damage[1] = 1;
        health = 1;
        speed = 9;
        delivery = true;
        magic = false;
    }
}