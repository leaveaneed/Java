// Пользовательский класс исключения
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message); // Передача сообщения в базовый класс Exception
    }
}

public class CustomExceptionExample {
    // Метод для проверки возраста
    public static void validateAge(int age) throws InvalidAgeException {
        if (age < 18 || age > 100) {
            throw new InvalidAgeException("Возраст должен быть от 18 до 100 лет. Указано: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            int age = 15; // Пример некорректного возраста
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println("Перехвачено пользовательское исключение: " + e.getMessage());
        }

        System.out.println("Программа завершена");
    }
}
