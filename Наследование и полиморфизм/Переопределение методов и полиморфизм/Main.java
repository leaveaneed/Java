class OverloadingExample {
    // Метод без параметров
    void display() {
        System.out.println("Метод без параметров");
    }

    // Перегруженный метод с одним параметром типа int
    void display(int a) {
        System.out.println("Метод с параметром int: " + a);
    }

    // Перегруженный метод с параметром типа double
    void display(double a) {
        System.out.println("Метод с параметром double: " + a);
    }

    // Перегруженный метод с двумя параметрами
    void display(int a, String b) {
        System.out.println("Метод с параметрами int и String: " + a + ", " + b);
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();
        obj.display();
        obj.display(5);
        obj.display(3.14);
        obj.display(10, "Java");
    }
}
