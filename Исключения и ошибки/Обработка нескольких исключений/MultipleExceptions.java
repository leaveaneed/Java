//Несколько исключений обрабатываются одинаковым образом.
public class MultipleExceptions {
    public static void main(String[] args) {
        try {
            // Генерация случайного числа для выбора исключения
            int caseNumber = (int) (Math.random() * 3);

            switch (caseNumber) {
                case 0:
                    throw new ArithmeticException("Деление на ноль");
                case 1:
                    throw new ArrayIndexOutOfBoundsException("Выход за пределы массива");
                case 2:
                    throw new NullPointerException("NullPointerException");
            }

        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            // Обработка исключений одинаковым образом
            System.out.println("Перехвачено исключение: " + e.getClass().getSimpleName() + " - " + e.getMessage());
        }
    }
}
