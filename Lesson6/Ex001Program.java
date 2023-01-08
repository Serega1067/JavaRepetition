package Lesson6;
import java.util.Arrays;
import java.util.HashSet;
import Lesson6.Worker;

public class Ex001Program {
    public static void main(String[] args) {
        //#region
        Worker w1 = new Worker();
        w1.firstName = "Name_1";
        w1.lastName = "FamilyN_1";
        w1.salary = 100;
        w1.id = 1000;

        Worker w4 = new Worker();
        w4.firstName = "Name_1";
        w4.lastName = "FamilyN_1";
        w4.salary = 100;
        w4.id = 1000;
        // Экземпляры w1 и w4 являются неодинаковыми.

        Worker w2 = new Worker();
        w1.firstName = "Name_2";
        w1.lastName = "FamilyN_2";
        w1.salary = 200;
        w1.id = 2000;

        Worker w3 = new Worker();
        w1.firstName = "Name_3";
        w1.lastName = "FamilyN_3";
        w1.salary = 300;
        w1.id = 3000;

        System.out.println(w1.toString());
        System.out.println(w2);
        System.out.println(w3);
        //#endregion

        System.out.println(w1 == w4);
        System.out.println(w1.equals(w4));
        var workers =  new HashSet<Worker>(Arrays.asList(w1, w2, w3));
        System.out.println(workers.contains(w4));
    }
}