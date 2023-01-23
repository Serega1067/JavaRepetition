package JavaOOPSeminar1;

import java.util.List;
import java.util.ArrayList;

/*
 * Написать программу в которой надо определить 4 класса.
 * Создать 4 списка.
 * Добавить getName() какой персонаж, сколько жизней.
 */
class Program {
    public static void main(String[] args) {
        int a;
        List<Magician> allMagician = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            allMagician.add(new Magician("Vasya"));
        }
        System.out.println(allMagician);
        for (Magician magician : allMagician) {
            System.out.println(magician.getName());
        }

        /*
        Mag a = "ew";
        Peasant b = true;
        Mag a = new Mag();
        Peasant b = new Peasant();

        if (a instanceof Mag) {
            // Работаем как с магом
        }

        if (a instanceof Peasant) {
            // Работаем как с крестьянином
        }

        if (a instanceof Mag) {
            // Работаем как с магом
        }
        String.class.isInstance(a);
        if (a.type.equals("Маг")) {
            // Работаем как с крестьянином
        }
        */
    }
}