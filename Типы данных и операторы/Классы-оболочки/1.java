package Типы данных и операторы.Классы-оболочки;

public class 1 {
    public static void main(String[] args) {
        // Десятичное число
        Integer decValue = Integer.decode("123");
        System.out.println("Десятичное число: " + decValue);

        // Восьмеричное число
        Integer octValue = Integer.decode("0123");
        System.out.println("Восьмеричное число (0123): " + octValue);

        // Шестнадцатеричное число
        Integer hexValue1 = Integer.decode("0x7B");
        Integer hexValue2 = Integer.decode("0X7B");
        System.out.println("Шестнадцатеричное число (0x7B): " + hexValue1);
        System.out.println("Шестнадцатеричное число (0X7B): " + hexValue2);

        // Знак числа
        Integer negValue = Integer.decode("-0x7B");
        System.out.println("Отрицательное шестнадцатеричное число (-0x7B): " + negValue);

        // Пример с типом Long
        Long longValue = Long.decode("0x1F4");
        System.out.println("Шестнадцатеричное значение Long (0x1F4): " + longValue);
    }
}
