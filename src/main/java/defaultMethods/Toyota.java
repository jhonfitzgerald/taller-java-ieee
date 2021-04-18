package defaultMethods;

public interface Toyota {
    public default void print(){
        System.out.println("soy marca Toyota");
    }
}
