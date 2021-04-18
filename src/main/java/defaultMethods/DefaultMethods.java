package defaultMethods;

public class DefaultMethods {
    public static void main(String[] args) {
        DefaultMethods _default = new DefaultMethods();
        _default.init();
    }

    public void init(){
//        Xclass objeto = new Xclass();
//        objeto.print();

        Hilux _hilux = new Hilux();
        _hilux.print();
        _hilux.imprimirMarca();
    }

    class Hilux implements Toyota{
        public void imprimirMarca(){
            System.out.println("Hola soy el modelo Hilux");
        };
    }

    class Xclass implements Toyota{
        @Override
        public void print() {
            Toyota.super.print();
//            System.out.println("soy una clase carro toyota marca xclass");
        }
    }
}
