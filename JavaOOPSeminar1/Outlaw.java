package JavaOOPSeminar1;

public class Outlaw {
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    public Outlaw() {
        name = "Vasya";
        attack = 8;
        protection = 3;
        shots = 0;
        damage[0] = 2; damage[1] = 4;
        health = 10;
        speed = 6;
        delivery = false;
        magic = false;
    }
}
