import java.util.Formatter;

public class FormatterExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();

        boolean boolValue = true;
        char charValue = 'A';
        int intValue = 12345;
        double doubleValue = 123.456;
        String stringValue = "Hello, Formatter!";

        // Использование спецификаторов
        formatter.format("1. Логическое значение: %b%n", boolValue);      // %b
        formatter.format("2. Символьное представление: %c%n", charValue); // %c
        formatter.format("3. Десятичное целое: %d%n", intValue);          // %d
        formatter.format("4. Десятичное число: %f%n", doubleValue);       // %f
        formatter.format("5. Строковое представление: %s%n", stringValue);// %s

        // Вывод отформатированных данных
        System.out.println(formatter);

        // Закрытие форматтера
        formatter.close();
    }
}
