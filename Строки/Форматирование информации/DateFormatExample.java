import java.util.Calendar;
import java.util.Formatter;

public class DateFormatExample {
    public static void main(String[] args) {
        Formatter formatter = new Formatter();
        Calendar calendar = Calendar.getInstance();

        // Получаем текущую дату и время
        int hour24 = calendar.get(Calendar.HOUR_OF_DAY); // 24-часовой формат
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1; // Месяц в диапазоне [0-11]
        String dayOfWeek = String.format("%tA", calendar);

        // Использование спецификаторов
        formatter.format("1. Час (24ч): %tH%n", calendar);      // %tH
        formatter.format("2. Минуты: %tM%n", calendar);         // %tM
        formatter.format("3. Секунды: %tS%n", calendar);        // %tS
        formatter.format("4. Год (4 знака): %tY%n", calendar);  // %tY
        formatter.format("5. Полное название дня недели: %tA%n", calendar); // %tA

        // Вывод отформатированных данных
        System.out.println(formatter);

        // Закрытие форматтера
        formatter.close();
    }
}
