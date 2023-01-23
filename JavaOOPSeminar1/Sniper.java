package JavaOOPSeminar1;

public class Sniper {
    private String name;
    private int attack;
    private int protection;
    private int shots;
    private int[] damage = new int[2];
    private int health;
    private int speed;
    private boolean delivery;
    private boolean magic;

    public Sniper() {
        name = "Vasya";
        attack = 12;
        protection = 10;
        shots = 32;
        damage[0] = 8; damage[1] = 10;
        health = 15;
        speed = 9;
        delivery = false;
        magic = false;
    }
}