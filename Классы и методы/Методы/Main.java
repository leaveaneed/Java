class Calculator {
    // Метод для сложения двух целых чисел
    int add(int a, int b) {
        return a + b;
    }

    // Перегруженный метод для сложения трех целых чисел
    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегруженный метод для сложения двух чисел с плавающей точкой
    double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println(calc.add(2, 3));            // Вызов метода с двумя int: вывод 5
        System.out.println(calc.add(2, 3, 4));         // Вызов метода с тремя int: вывод 9
        System.out.println(calc.add(2.5, 3.5));        // Вызов метода с double: вывод 6.0
    }
}

class Animal {
    // Метод суперкласса
    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    // Переопределение метода sound() в подклассе Dog
    @Override
    void sound() {
        System.out.println("Собака лает");
    }
}

class Cat extends Animal {
    // Переопределение метода sound() в подклассе Cat
    @Override
    void sound() {
        System.out.println("Кошка мяукает");
    }
}

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Animal dog = new Dog();
        Animal cat = new Cat();

        animal.sound();  // Вывод: Животное издает звук
        dog.sound();     // Вывод: Собака лает
        cat.sound();     // Вывод: Кошка мяукает
    }
}
