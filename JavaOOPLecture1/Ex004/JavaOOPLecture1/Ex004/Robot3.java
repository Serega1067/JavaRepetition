package JavaOOPLecture1.Ex004;
import java.util.ArrayList;

/**
 * Опишим новую версию робота
 */
public class Robot3 {
    enum State {
        On, Off // Состояние робота
    }

    // Создадим поля чтобы нельзя было создать двух роботов
    // с одинаковым именем
    private static int defaultIndex; // дефолтный индекс для
                                     // нумерации
    private static ArrayList<String> names; // Коллекция имён

    /**
     * Статический инициализатор
     */
    static {
        defaultIndex = 1; // зададим начальный индекс
        names = new ArrayList<String>(); // коллекцию инициализируем
                                         // как пустую коллекцию
    }
    /**Уровень робота */
    private int level;

    /**Имя робота */
    private String name;

    // Добавляем новое поле состояние
    private State state;

    /**
     * Создание робота
     * @param name Имя робота !Не должно начинаться с цифры
     * @param level Уровень робота
     */
    // Что бы небыло возможности явного указания уровня
    // можно поменять public на private  
    private Robot3(String name, int level) {
        // если выполнится условие присвоим дефолтное имя
        if ((name.isEmpty()
                || Character.isDigit(name.charAt(0)))
                || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d",
                                      defaultIndex++);
        } else {
        this.name = name; // если условие не выполнелось
                          // присвоим имя данное пользователем
        }

        Robot3.names.add(this.name); // добавляем имя в коллекцию
        this.level = level; // производим инициализацию уровня
        this.state = State.Off; // производим инициализацию
                                // начального состояния
    }

    // #region другие конструкторы
    // конструктор имеющий только один аргумент

    /*
    public Robot3(String name) {
        if ((name.isEmpty()
        || Character.isDigit(name.charAt(0)))
        || Robot3.names.indexOf(name) != -1) {
            this.name = String.format("DefaultName_%d",
                                      defaultIndex++);
        } else {
            this.name = name;
        }

        // Остальное всё остаётся таким же кроме this.level
        Robot3.names.add(this.name);
        this.level = 1;
        this.state = State.Off;
    }
    */

    // Так же можно описать конструктор без параметров
    /*
    public Robot3() {
        this.name = String.format("DefaultName_%d",
                                  defaultIndex++);
        Robot3.names.add(this.name);
        this.level = 1;
        this.state = State.Off;
    }
    */

    // #endregion
    
    // Варианты кода выше нарушают принцип DRY
    // Как исправить
    // Нужно описать максимальный конструктор и дальше его
    // использовать в рамках более простых
    // #region правильный конструктор
    public Robot3(String name) {
        this(name, 1);
    }

    public Robot3() {
        this("");
    }

    // #endregion

    // Методы вкл\выкл подсистем

    // так же сменим public на private
    private void powerOn() {
        this.startBIOS();
        this.startOS();
        this.sayHi();
    }

    private void powerOff() {
        this.sayBye();
        this.stopOS();
        this.stopBIOS();
    }

    // Изменим систему включения
    public void power() {
        if (this.state == State.Off) {
            this.powerOn();
            this.state = State.On;
        } else {
            this.powerOff();
            this.state = State.Off;
        }
        System.out.println();
    }

    public int getLevel() {
        return this.level;
    }

    public String getName() {
        return this.name;
    }

    /**Загрузка BIOS */
    private void startBIOS() {
        System.out.println("Start BIOS...");
    }

    /**Загрузка OS */
    private void startOS() {
        System.out.println("Start OS...");
    }

    /**Приветствие */
    private void sayHi() {
        System.out.println("Hello world...");
    }

    /**Выгрузка BIOS */
    private void stopBIOS() {
        System.out.println("Stop BIOS...");
    }

    /**Выгрузка OS */
    private void stopOS() {
        System.out.println("Stop OS...");
    }

    /**Прощание */
    private void sayBye() {
        System.out.println("Bye...");
    }

    /**Работа */
    /*
    public void work() {
        System.out.println("Working...");
    }
    */
    // Изменим work()
    public void work() {
        if (this.state == State.On) {
            System.out.println("Working...");
        }
    }

    @Override
    public String toString() {
        return String.format("%s %d\n", this.name,
                                                this.level);
    }
}