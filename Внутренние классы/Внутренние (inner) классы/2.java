public class OuterClass {
    private String privateField = "Private Field";
    protected String protectedField = "Protected Field";
    String defaultField = "Default Field";
    public String publicField = "Public Field";

    public class InnerClass {
        public void displayFields() {
            System.out.println("Accessing from InnerClass:");
            System.out.println("Private Field: " + privateField);
            System.out.println("Protected Field: " + protectedField);
            System.out.println("Default Field: " + defaultField);
            System.out.println("Public Field: " + publicField);
        }
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayFields();
    }
}
//Внутренний класс имеет доступ к полям и методам внешнего класса, включая private.
//Возможность доступа не зависит от спецификаторов доступа полей внешнего класса — внутренний класс имеет доступ ко всем полям.