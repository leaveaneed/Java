//Ключевое слово super
//Вызов метода суперкласса, который был переопределен в подклассе:
class Parent {
    void method() {
        System.out.println("Метод суперкласса");
    }
}

class Child extends Parent {
    void method() {
        System.out.println("Метод подкласса");
        super.method(); // Вызов метода суперкласса
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.method();
    }
}
//Доступ к полям суперкласса, если имя поля совпадает с полем подкласса:
class Parent {
    int a = 10;
}

class Child extends Parent {
    int a = 20;

    void printValues() {
        System.out.println("Поле подкласса: " + a);
        System.out.println("Поле суперкласса: " + super.a);
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
        obj.printValues();
    }
}
//Вызов конструктора суперкласса:
class Parent {
    Parent() {
        System.out.println("Конструктор суперкласса");
    }
}

class Child extends Parent {
    Child() {
        super(); // Вызов конструктора суперкласса
        System.out.println("Конструктор подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Child obj = new Child();
    }
}
//Ключевое слово this
//Обращения к полям текущего класса:
class Example {
    int a;

    void setValue(int a) {
        this.a = a; // Указывает на поле текущего объекта
    }

    void printValue() {
        System.out.println("Значение a: " + this.a);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
        obj.setValue(5);
        obj.printValue();
    }
}
//Вызова других конструкторов текущего класса:
class Example {
    Example() {
        this(10); // Вызов конструктора с параметром
        System.out.println("Конструктор без параметров");
    }

    Example(int a) {
        System.out.println("Конструктор с параметром: " + a);
    }
}

public class Main {
    public static void main(String[] args) {
        Example obj = new Example();
    }
}
