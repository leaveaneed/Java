import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (OutputStream outputStream = new FileOutputStream("output.txt")) {
            String data = "Привет, мир!";
            for (int i = 0; i < data.length(); i++) {
                outputStream.write(data.charAt(i)); // Запись каждого символа в поток
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
