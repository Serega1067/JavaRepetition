package JavaOOPLecture1.Ex006;
import java.util.Random;

public class BaseHero {
    protected static int number; // ведёт подсчёт для любого
                                 // из персонажей
    protected static Random r; // генератор псевдо случайных
                               // чисел для любого из персонажей

    protected String name;
    protected int hp;
    protected int maxHp;

    // Инициализатор статических полей
    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    // Конструктор который итвечает за инициализацию
    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    // Конструктор по умолчанию
    public BaseHero() {
        this(String.format("Base_Hero #%d", ++BaseHero.number),
                           BaseHero.r.nextInt(100, 200));
    }
    
    // получение информации
    public String getInfo() {
        return String.format(
            "Name: %s Hp: %d Type: %s",
            this.name, this.hp, this.getClass().getSimpleName()
            );
    }

    // метод лечения справедлив для любого из персонажей
    public void healed(int Hp) {
        this.hp = Hp + this.hp > this.maxHp ? this.maxHp :
        Hp + this.hp;
    }

    // метод получения атаки
    public void GetDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }
}