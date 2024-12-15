public class OverloadVarargs {
    
    // Метод с одним аргументом типа int
    public void printNumbers(int a) {
        System.out.println("Один аргумент: " + a);
    }

    // Метод с переменным числом аргументов типа int (varargs)
    public void printNumbers(int... numbers) {
        System.out.print("Несколько аргументов: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Метод с одним аргументом типа String и varargs
    public void printNumbers(String message, int... numbers) {
        System.out.print(message + ": ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        OverloadVarargs obj = new OverloadVarargs();

        // Вызов метода с одним аргументом
        obj.printNumbers(5);

        // Вызов метода с переменным числом аргументов
        obj.printNumbers(1, 2, 3, 4);

        // Вызов метода с сообщением и varargs
        obj.printNumbers("Числа", 10, 20, 30);
    }
}
