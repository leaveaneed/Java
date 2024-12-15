interface MyInterface {
    // Default метод
    default void defaultMethod() {
        System.out.println("This is a default method in MyInterface");
    }

    // Static метод
    static void staticMethod() {
        System.out.println("This is a static method in MyInterface");
    }
}

// Класс, реализующий интерфейс
class MyClass implements MyInterface {
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method in MyClass");
    }

    // Дополнительный метод для демонстрации вызова интерфейсных методов
    public void callMethods() {
        // Вызов default метода через экземпляр
        defaultMethod();
        
        // Вызов static метода интерфейса через имя интерфейса
        MyInterface.staticMethod();
    }
}

public class TestInterface {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Вызов default метода через экземпляр
        obj.defaultMethod();

        // Вызов static метода интерфейса напрямую через имя интерфейса
        MyInterface.staticMethod();

        // Вызов методов через отдельный метод в классе
        obj.callMethods();
    }
}
