class Wrapper<T> {
    private T item;

    public Wrapper(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public boolean isInstanceOf(Class<?> clazz) {
        return clazz.isInstance(item);
    }
}

public class Main {
    public static void main(String[] args) {
        Wrapper<String> stringWrapper = new Wrapper<>("Hello");
        Wrapper<Integer> integerWrapper = new Wrapper<>(123);

        // Проверка типа объекта внутри Wrapper
        System.out.println("Is stringWrapper a String? " + stringWrapper.isInstanceOf(String.class)); // true
        System.out.println("Is integerWrapper an Integer? " + integerWrapper.isInstanceOf(Integer.class)); // true

        // instanceof на конкретном объекте (нельзя на T)
        Object obj = stringWrapper.getItem();
        if (obj instanceof String) {
            System.out.println("The object is a String.");
        }
    }
}
