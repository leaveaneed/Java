package Типы данных и операторы.Классы-оболочки;

public class 2 {
    public static void main(String[] args) {
        // Способ 1: valueOf(boolean)
        Boolean bool1 = Boolean.valueOf(true);
        Boolean bool2 = Boolean.valueOf(false);
        System.out.println("Boolean.valueOf(true): " + bool1);
        System.out.println("Boolean.valueOf(false): " + bool2);

        // Способ 2: valueOf(String)
        Boolean bool3 = Boolean.valueOf("true");
        Boolean bool4 = Boolean.valueOf("TRUE");
        Boolean bool5 = Boolean.valueOf("false");
        Boolean bool6 = Boolean.valueOf("hello"); // Любая строка != "true" -> false
        System.out.println("Boolean.valueOf(\"true\"): " + bool3);
        System.out.println("Boolean.valueOf(\"TRUE\"): " + bool4);
        System.out.println("Boolean.valueOf(\"false\"): " + bool5);
        System.out.println("Boolean.valueOf(\"hello\"): " + bool6);

        // Способ 3: Устаревший конструктор new Boolean(String)
        Boolean bool7 = new Boolean("true");
        Boolean bool8 = new Boolean("TrUe");
        Boolean bool9 = new Boolean("false");
        System.out.println("new Boolean(\"true\"): " + bool7);
        System.out.println("new Boolean(\"TrUe\"): " + bool8);
        System.out.println("new Boolean(\"false\"): " + bool9);
    }
}
