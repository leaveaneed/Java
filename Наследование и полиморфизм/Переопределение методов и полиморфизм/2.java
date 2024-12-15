class Parent {
    // Метод в суперклассе
    public void showMessage() {
        System.out.println("Метод из суперкласса");
    }
}

class Child extends Parent {
    // Переопределенный метод в подклассе
    @Override
    public void showMessage() {
        System.out.println("Метод из подкласса");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent obj1 = new Parent();
        obj1.showMessage(); // Вызов метода суперкласса

        Parent obj2 = new Child();
        obj2.showMessage(); // Вызов переопределенного метода в подклассе
    }
}
//Если у методов не совпадает тип возвращаемого значения, компилятор выдаст ошибку:

//error: showMessage() in Child cannot override showMessage() in Parent