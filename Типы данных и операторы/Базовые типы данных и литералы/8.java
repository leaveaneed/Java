package Типы данных и операторы.Базовые типы данных и литералы;
import java.util.List;
public class 8 {
    public static void main(String[] args) {
        var list = List.of(1, 2, 3);
        for (var element : list) {
            System.out.print(element+" ");
        }
    }
}
