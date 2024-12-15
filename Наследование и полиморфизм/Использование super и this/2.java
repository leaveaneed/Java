class A {
    int a = 100;

    void method() {
        System.out.println("Метод из класса A");
    }
}

class B extends A {
    // Пустой класс B
}

class C extends B {
    void method() {
        System.out.println("Метод из класса C");
        int a = super.a; // Доступ к полю из класса A
        System.out.println("Значение a из суперкласса A: " + a);
        super.method(); // Вызов метода из класса A
    }
}

public class Main {
    public static void main(String[] args) {
        C obj = new C();
        obj.method();
    }
}

/*Вывод программы:

Метод из класса C
Значение a из суперкласса A: 100
Метод из класса A
Объяснение:

super.a ищет переменную a в ближайшем суперклассе (B). Поскольку в B переменная не определена, поиск продолжается в классе A, где она найдена.
super.method() аналогично вызывает метод из суперкласса A.*/