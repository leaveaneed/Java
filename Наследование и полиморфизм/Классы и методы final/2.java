// Класс объявлен как final
final class FinalClass {
    public void display() {
        System.out.println("Это метод final-класса");
    }
}

// Попытка наследования приведет к ошибке компиляции
/*
class SubClass extends FinalClass {
    public void display() {
        System.out.println("Попытка наследования от final-класса");
    }
}
*/

public class Main {
    public static void main(String[] args) {
        FinalClass obj = new FinalClass();
        obj.display();
    }
}

//Если раскомментировать класс SubClass, компилятор выдаст ошибку:

//error: cannot inherit from final FinalClass