public class Main {
    public static void main(String[] args) {
    String str = "Hello";

    // Преобразование в StringBuffer
    StringBuffer stringBuffer = new StringBuffer(str);
    System.out.println("StringBuffer: " + stringBuffer);

    // Преобразование в StringBuilder
    StringBuilder stringBuilder = new StringBuilder(str);
    System.out.println("StringBuilder: " + stringBuilder);

    // StringBuffer в String
    String bufferToString = stringBuffer.toString();
    System.out.println("String from StringBuffer: " + bufferToString);

    // StringBuilder в String
    String builderToString = stringBuilder.toString();
    System.out.println("String from StringBuilder: " + builderToString);

    // StringBuffer в StringBuilder
    StringBuilder bufferToBuilder = new StringBuilder(stringBuffer);
    System.out.println("StringBuilder from StringBuffer: " + bufferToBuilder);

    // StringBuilder в StringBuffer
    StringBuffer builderToBuffer = new StringBuffer(stringBuilder);
    System.out.println("StringBuffer from StringBuilder: " + builderToBuffer);
    }
}