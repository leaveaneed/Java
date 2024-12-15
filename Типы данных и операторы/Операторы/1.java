package Типы данных и операторы.Операторы;

public class 1 {
    public static void main(String[] args) {
        // = и += и -= и *= и /= и %=
        int a = 10;
        a += 5; // a = a + 5
        a -= 2; // a = a - 2
        a *= 2; // a = a * 2
        a /= 3; // a = a / 3
        a %= 4; // a = a % 4
        System.out.println("Операторы присваивания: " + a);

        // Тернарный оператор ?:
        int b = 15;
        String result = (b > 10) ? "больше 10" : "не больше 10";
        System.out.println("Тернарный оператор: " + result);

        // Логические операторы || и &&
        boolean x = true, y = false;
        System.out.println("|| (или): " + (x || y));
        System.out.println("&& (и): " + (x && y));

        // Побитовый И |, ИЛИ ^, И с операторами базовых типов
        int num1 = 5, num2 = 3; // 0101 и 0011
        System.out.println("| (побитовое ИЛИ): " + (num1 | num2)); // 0111 = 7
        System.out.println("^ (побитовый XOR): " + (num1 ^ num2)); // 0110 = 6
        System.out.println("& (побитовое И): " + (num1 & num2)); // 0001 = 1

        // Операторы сравнения ==, >, >=, <, <=
        System.out.println("==: " + (num1 == num2));
        System.out.println("> : " + (num1 > num2));
        System.out.println(">=: " + (num1 >= num2));
        System.out.println("< : " + (num1 < num2));
        System.out.println("<=: " + (num1 <= num2));

        // Сдвиговые операторы >>, >>>, <<
        int c = 8; // 1000
        System.out.println(">>: " + (c >> 2)); // 0010 = 2
        System.out.println(">>>: " + (c >>> 2)); // 0010 = 2 (для положительных чисел совпадает с >>)
        System.out.println("<<: " + (c << 2)); // 100000 = 32

        // Арифметические операторы +, -, *, /, %
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("+ : " + sum + ", - : " + diff + ", * : " + mul + ", / : " + div + ", % : " + mod);

        // Операторы ++ и -- (префиксная и постфиксная форма)
        int i = 5;
        System.out.println("Постфиксный инкремент i++: " + (i++)); // выводит 5, i становится 6
        System.out.println("Префиксный инкремент ++i: " + (++i)); // i становится 7 и выводит 7
        System.out.println("Постфиксный декремент i--: " + (i--)); // выводит 7, i становится 6
        System.out.println("Префиксный декремент --i: " + (--i)); // i становится 5 и выводит 5

        // Логические операторы ~ и !
        System.out.println("~ (побитовая инверсия): " + (~num1)); // инверсия битов числа 5
        System.out.println("! (логическое НЕ): " + (!x));

        // Скобки и индексы
        int[] arr = {1, 2, 3};
        System.out.println("( ) и [ ]: " + (arr[1])); // 2

        // Сложение строк и числа с +
        String str1 = "Привет, ";
        String str2 = "Леонид!";
        String greeting = str1 + str2;
        System.out.println("Конкатенация строк: " + greeting);

        // Добавим числа в строки
        String result2 = "Результат: " + (5 + 10);
        System.out.println(result2);
    }
}
