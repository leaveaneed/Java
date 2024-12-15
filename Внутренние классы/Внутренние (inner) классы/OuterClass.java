public class OuterClass {

    // Public внутренний класс
    public class PublicInner {
        public void show() {
            System.out.println("Public inner class");
        }
    }

    // Private внутренний класс
    private class PrivateInner {
        public void show() {
            System.out.println("Private inner class");
        }
    }

    // Protected внутренний класс
    protected class ProtectedInner {
        public void show() {
            System.out.println("Protected inner class");
        }
    }

    // Package-private (default) внутренний класс
    class DefaultInner {
        public void show() {
            System.out.println("Default inner class");
        }
    }

    // Метод для создания объектов внутренних классов
    public void createInnerClasses() {
        PublicInner publicInner = new PublicInner();
        publicInner.show();

        PrivateInner privateInner = new PrivateInner();
        privateInner.show();

        ProtectedInner protectedInner = new ProtectedInner();
        protectedInner.show();

        DefaultInner defaultInner = new DefaultInner();
        defaultInner.show();
    }
}

class Test {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();

        // Доступ к public внутреннему классу
        OuterClass.PublicInner publicInner = outer.new PublicInner();
        publicInner.show();

        // Доступ к protected и default внутренним классам возможен из того же пакета
        OuterClass.ProtectedInner protectedInner = outer.new ProtectedInner();
        protectedInner.show();

        OuterClass.DefaultInner defaultInner = outer.new DefaultInner();
        defaultInner.show();

        // Доступ к private внутреннему классу невозможен из другого класса
        // OuterClass.PrivateInner privateInner = outer.new PrivateInner(); // Ошибка компиляции
    }
}
