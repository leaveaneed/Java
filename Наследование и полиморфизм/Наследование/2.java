class A {
    int a1; // Модификатор по умолчанию (package-private)
    public int a2; // public
    protected int a3; // protected
    private int a4; // private

    void method1() {
        System.out.println("Метод с доступом по умолчанию");
    }

    public void method2() {
        System.out.println("Публичный метод");
    }

    protected void method3() {
        System.out.println("Защищенный метод");
    }

    private void method4() {
        System.out.println("Приватный метод");
    }
}

class B extends A {
    void test() {
        System.out.println(a1); // Доступно (package-private)
        System.out.println(a2); // Доступно (public)
        System.out.println(a3); // Доступно (protected)
        // System.out.println(a4); // Ошибка: private недоступен
        
        method1(); // Доступно (package-private)
        method2(); // Доступно (public)
        method3(); // Доступно (protected)
        // method4(); // Ошибка: private недоступен
    }
}

class C extends B {
    void testChild() {
        System.out.println(a1); // Доступно (package-private)
        System.out.println(a2); // Доступно (public)
        System.out.println(a3); // Доступно (protected)
        // System.out.println(a4); // Ошибка: private недоступен
    }
}

public class Main {
    public static void main(String[] args) {
        B objB = new B();
        objB.test();

        C objC = new C();
        objC.testChild();
    }
}
