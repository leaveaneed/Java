//<? extends T>
import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow!");
    }
}

public class Main {
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            animal.sound(); // Можно безопасно вызывать методы Animal
        }
    }

    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog());

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());

        printAnimals(dogs); // List<? extends Animal> принимает List<Dog>
        printAnimals(cats); // List<? extends Animal> принимает List<Cat>
    }
}

//<? super T>
import java.util.ArrayList;
import java.util.List;

class Animal {
    void sound() {
        System.out.println("Some sound...");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void addDogs(List<? super Dog> animals) {
        animals.add(new Dog());
        System.out.println("Added a Dog to the list.");
    }

    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        addDogs(animals); // List<Animal> допустим
        addDogs(objects); // List<Object> допустим

        for (Object obj : animals) {
            System.out.println(obj.getClass().getSimpleName()); // Проверка содержимого списка
        }
    }
}

/*<? extends T> (ограничение сверху):

Используется, когда нужно получать (читать) элементы из коллекции, но не добавлять.
Пример: итерация или чтение данных из коллекции объектов определенного типа или его подклассов.
<? super T> (ограничение снизу):

Используется, когда нужно добавлять элементы в коллекцию, но чтение ограничено типом Object.
Пример: добавление новых элементов в коллекцию определенного типа или его суперклассов. */