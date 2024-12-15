public class StringBufferAndBuilderExample {
    public static void main(String[] args) {
        // Использование StringBuffer
        System.out.println("=== StringBuffer Example ===");
        StringBuffer stringBuffer = new StringBuffer("Hello");

        // 1. append() - добавляет строку в конец
        stringBuffer.append(", World!");
        System.out.println("1. append(): " + stringBuffer);

        // 2. insert() - вставляет строку в указанную позицию
        stringBuffer.insert(5, " Java");
        System.out.println("2. insert(): " + stringBuffer);

        // 3. delete() - удаляет символы из строки с указанного диапазона
        stringBuffer.delete(5, 10);
        System.out.println("3. delete(): " + stringBuffer);

        // 4. deleteCharAt() - удаляет символ по указанному индексу
        stringBuffer.deleteCharAt(0);
        System.out.println("4. deleteCharAt(): " + stringBuffer);

        // 5. replace() - заменяет часть строки на другую
        stringBuffer.replace(0, 5, "Hi");
        System.out.println("5. replace(): " + stringBuffer);

        // 6. reverse() - меняет порядок символов в строке на обратный
        stringBuffer.reverse();
        System.out.println("6. reverse(): " + stringBuffer);

        // 7. length() - возвращает длину строки
        int length = stringBuffer.length();
        System.out.println("7. length(): " + length);

        // 8. capacity() - возвращает текущую емкость буфера
        int capacity = stringBuffer.capacity();
        System.out.println("8. capacity(): " + capacity);

        // 9. setCharAt() - заменяет символ по указанному индексу
        stringBuffer.setCharAt(0, 'H');
        System.out.println("9. setCharAt(): " + stringBuffer);

        // 10. substring() - возвращает подстроку, начиная с указанного индекса
        String subString = stringBuffer.substring(0, 5);
        System.out.println("10. substring(): " + subString);

        // Использование StringBuilder
        System.out.println("\n=== StringBuilder Example ===");
        StringBuilder stringBuilder = new StringBuilder("Welcome");

        // Демонстрация некоторых аналогичных методов для StringBuilder
        stringBuilder.append(" to Java");
        System.out.println("append(): " + stringBuilder);

        stringBuilder.insert(8, "World ");
        System.out.println("insert(): " + stringBuilder);

        stringBuilder.reverse();
        System.out.println("reverse(): " + stringBuilder);

        stringBuilder.reverse(); // Возвращаем к изначальному порядку
        stringBuilder.delete(8, 13);
        System.out.println("delete(): " + stringBuilder);
    }
}
