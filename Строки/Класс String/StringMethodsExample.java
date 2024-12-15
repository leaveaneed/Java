public class StringMethodsExample {
    public static void main(String[] args) {
        String str = "  Hello, Java!  ";

        // 1. trim() - удаляет пробелы в начале и конце строки
        String trimmed = str.trim();
        System.out.println("1. trim(): '" + trimmed + "'");

        // 2. length() - возвращает длину строки
        int length = str.length();
        System.out.println("2. length(): " + length);

        // 3. toUpperCase() - переводит все символы строки в верхний регистр
        String upperCase = str.toUpperCase();
        System.out.println("3. toUpperCase(): " + upperCase);

        // 4. toLowerCase() - переводит все символы строки в нижний регистр
        String lowerCase = str.toLowerCase();
        System.out.println("4. toLowerCase(): " + lowerCase);

        // 5. replace() - заменяет символ или подстроку на другую
        String replaced = str.replace("Java", "World");
        System.out.println("5. replace(): " + replaced);

        // 6. substring() - извлекает подстроку из строки
        String substring = str.substring(2, 7);
        System.out.println("6. substring(): " + substring);

        // 7. charAt() - возвращает символ по индексу
        char character = str.charAt(7);
        System.out.println("7. charAt(): " + character);

        // 8. indexOf() - находит индекс первого вхождения подстроки или символа
        int index = str.indexOf("Java");
        System.out.println("8. indexOf(): " + index);

        // 9. startsWith() - проверяет, начинается ли строка с указанного значения
        boolean startsWith = str.startsWith("  Hello");
        System.out.println("9. startsWith(): " + startsWith);

        // 10. equalsIgnoreCase() - сравнивает строки без учета регистра
        boolean isEqual = str.equalsIgnoreCase("  hello, java!  ");
        System.out.println("10. equalsIgnoreCase(): " + isEqual);
    }
}
