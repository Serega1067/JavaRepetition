public class JavaLecture3 {
    public static void main(String[] args) {
        /*
         * Java:
         * Знакомство и как пользоваться базовыми API.
         * Коллекции Java. Введение.
         * Object.
         * Тип данных Object - "всему голова".
         * Упаковка - любой тип можно положить в переменную
         * типа Object.
         * Распаковка - преобразование Object-переменной в
         * нужный тип.
         * Иерархия типов - любой тип "ниже" Object'а.
         */

        Object o = 1; GetType(o); // java.lang.Integer
        o = 1.2; GetType(o);      // java.lang.Double
    }

    static void GetType(Object obj) {
        System.out.println(obj.getClass().getName());
    }
}