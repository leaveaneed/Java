import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        File file = new File("example.txt"); // Путь к файлу
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNextLine()) { // Чтение строк до конца файла
                String line = scanner.nextLine(); // Чтение одной строки
                System.out.println(line); // Вывод строки в консоль
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
