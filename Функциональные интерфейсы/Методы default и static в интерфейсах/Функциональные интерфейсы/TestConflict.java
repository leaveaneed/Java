interface InterfaceA {
    default void display() {
        System.out.println("Default method in InterfaceA");
    }
}

interface InterfaceB {
    default void display() {
        System.out.println("Default method in InterfaceB");
    }
}

class MyClass implements InterfaceA, InterfaceB {
    // Разрешение конфликта: переопределяем метод display
    @Override
    public void display() {
        System.out.println("Resolved default method in MyClass");

        // Можно вызвать конкретный метод из интерфейса через super
        InterfaceA.super.display();
        InterfaceB.super.display();
    }
}

public class TestConflict {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display();
    }
}
/*Конфликт default методов:

Оба интерфейса InterfaceA и InterfaceB содержат метод display() с одинаковой сигнатурой.
При попытке компиляции возникнет ошибка, если метод не будет переопределён в классе.
Решение конфликта:

Метод display() переопределяется в классе MyClass.
Внутри переопределённого метода можно вызвать конкретный метод из интерфейса с помощью синтаксиса InterfaceName.super.methodName(). */