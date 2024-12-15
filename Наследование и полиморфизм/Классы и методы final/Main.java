class Parent {
    // final-метод, который нельзя переопределить
    public final void finalMethod() {
        System.out.println("Это final-метод суперкласса");
    }
}

class Child extends Parent {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    /*
    @Override
    public void finalMethod() {
        System.out.println("Попытка переопределить final-метод");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.finalMethod();

        Child childObj = new Child();
        childObj.finalMethod(); // Наследуется из суперкласса
    }
}
/*Если раскомментировать метод finalMethod() в классе Child, компилятор выдаст ошибку:

error: finalMethod() in Child cannot override finalMethod() in Parent*/