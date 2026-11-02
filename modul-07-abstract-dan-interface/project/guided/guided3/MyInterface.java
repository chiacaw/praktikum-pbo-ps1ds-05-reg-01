package guided.guided3;


interface MyInterface {
    default void newMethod() {
        System.out.println("Newly added default method");
    }
    
    void existingMethod(String str);
}