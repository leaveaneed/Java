public class OuterClass {
    private class InnerClass {
        private String privateField = "Private Field in InnerClass";

        private void display() {
            System.out.println("Method in InnerClass: " + privateField);
        }
    }

    public void accessInnerClass() {
        InnerClass inner = new InnerClass();
        System.out.println("Accessing private field of InnerClass: " + inner.privateField);
        inner.display();
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass();
    }
}
//Внешний класс имеет прямой доступ к полям и методам внутреннего класса, даже если они объявлены как private.