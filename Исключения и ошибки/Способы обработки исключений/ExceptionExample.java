public class ExceptionExample {
    public static void main(String[] args) {
        try {
            System.out.println("Начало программы");

            // Генерация первого исключения, которое будет перехвачено
            int result = 10 / 0; // Деление на ноль
            System.out.println("Результат: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Перехвачено исключение: " + e);
        }

        System.out.println("Продолжаем выполнение программы после первого исключения");

        // Генерация второго исключения, которое не обрабатывается
        int[] array = {1, 2, 3};
        System.out.println(array[5]); // Обращение к несуществующему элементу массива

        System.out.println("Эта строка никогда не будет выполнена");
    }
}
