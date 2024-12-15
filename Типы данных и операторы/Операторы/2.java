package Типы данных и операторы.Операторы;

public class 2 {
    public static void main(String[] args) {
        String text = "Пример";
        Integer number = 123;

        // Проверка instanceof
        System.out.println("text instanceof String: " + (text instanceof String)); // true
        System.out.println("number instanceof Integer: " + (number instanceof Integer)); // true

        // Применение к null
        String nullString = null;
        System.out.println("null instanceof String: " + (nullString instanceof String)); // false

        // Наследование и instanceof
        Parent parent = new Child();
        System.out.println("parent instanceof Parent: " + (parent instanceof Parent)); // true
        System.out.println("parent instanceof Child: " + (parent instanceof Child)); // true
    }
}
class Parent {}

class Child extends Parent {}