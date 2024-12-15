import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//Интерфейс AutoCloseable позволяет объектам освобождать ресурсы автоматически при использовании конструкции try-with-resources. Это минимизирует риск забыть закрыть ресурс.