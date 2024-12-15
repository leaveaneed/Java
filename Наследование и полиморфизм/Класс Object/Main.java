import java.util.Objects;

class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Геттеры (для доступа к полям)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Переопределение метода equals()
    @Override
    public boolean equals(Object obj) {
        // Проверка на равенство ссылок
        if (this == obj) {
            return true;
        }

        // Проверка на null и сравнение классов
        if (obj == null || this.getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа
        Person otherPerson = (Person) obj;

        // Сравнение значений полей
        return Objects.equals(this.name, otherPerson.name) && this.age == otherPerson.age;
    }

    // Переопределение метода hashCode (рекомендуется, если переопределен equals())
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Alice", 30);
        Person person2 = new Person("Alice", 30);
        Person person3 = new Person("Bob", 25);

        // Тестирование equals()
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person1.equals(person3): " + person1.equals(person3)); // false
        System.out.println("person1.equals(null): " + person1.equals(null));      // false
        System.out.println("person1.equals(\"Alice\"): " + person1.equals("Alice")); // false
    }
}

/*Соглашения для реализации метода equals():

Рефлексивность: объект должен быть равен самому себе.
x.equals(x) должно возвращать true.
Симметричность: если x.equals(y) возвращает true, то и y.equals(x) должно возвращать true.
Транзитивность: если x.equals(y) и y.equals(z) возвращают true, то и x.equals(z) должно возвращать true.
Согласованность: многократные вызовы x.equals(y) при неизменных объектах должны возвращать одинаковый результат.
Сравнение с null: вызов x.equals(null) должен возвращать false.
 */