package guided.guided3;

public class Example implements MyInterface {
    
    public void existingMethod(String str) {
        System.out.println("String is: " + str);
    }
    
    public static void main(String[] args) {
        Example obj = new Example();
        obj.newMethod();
        obj.existingMethod("Java 8 is easy to learn");
    }
}