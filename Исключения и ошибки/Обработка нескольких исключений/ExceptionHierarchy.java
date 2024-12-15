//Исключения образуют иерархию: Ex1 <|-- Ex2 <|-- Ex3.
class Ex1 extends Exception {
    public Ex1(String message) {
        super(message);
    }
}

class Ex2 extends Ex1 {
    public Ex2(String message) {
        super(message);
    }
}

class Ex3 extends Ex2 {
    public Ex3(String message) {
        super(message);
    }
}

public class ExceptionHierarchy {
    public static void main(String[] args) {
        try {
            // Генерация исключения Ex3
            throw new Ex3("Это Ex3");

        } catch (Ex3 e) {
            System.out.println("Перехвачено исключение Ex3: " + e.getMessage());

        } catch (Ex2 e) {
            System.out.println("Перехвачено исключение Ex2: " + e.getMessage());

        } catch (Ex1 e) {
            System.out.println("Перехвачено исключение Ex1: " + e.getMessage());
        }
    }
}
