package defaultMethods;

public interface Carro {
    public default void print(){
        System.out.println("soy un carrito");
    }
}
