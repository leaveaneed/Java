import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Создаем StringJoiner с разделителем ", "
        StringJoiner joiner = new StringJoiner(", ", "[", "]");

        // Добавляем элементы
        joiner.add("Apple");
        joiner.add("Banana");
        joiner.add("Cherry");

        // Выводим результат
        System.out.println("Joined string: " + joiner);

        // Пример объединения двух StringJoiner
        StringJoiner joiner2 = new StringJoiner(", ", "{", "}");
        joiner2.add("Orange").add("Pineapple");

        joiner.merge(joiner2);

        System.out.println("Merged string: " + joiner);
    }
}
