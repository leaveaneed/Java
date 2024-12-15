class A {
    int a = 10;

    // Конструктор суперкласса
    A() {
        System.out.println("Конструктор суперкласса A");
    }

    // Метод суперкласса
    void method() {
        System.out.println("Метод суперкласса A");
    }
}

class B extends A {
    int a = 20;

    B() {
        super(); // Вызов конструктора суперкласса
        System.out.println("Конструктор подкласса B");
    }

    void showValues() {
        System.out.println("Поле подкласса a: " + a);       // Поле подкласса
        System.out.println("Поле суперкласса a: " + super.a); // Поле суперкласса
    }

    void callSuperMethod() {
        super.method(); // Вызов метода суперкласса
    }
}

public class Main {
    public static void main(String[] args) {
        B obj = new B(); // Вызов конструкторов
        obj.showValues(); // Доступ к полям
        obj.callSuperMethod(); // Доступ к методу суперкласса
    }
}
