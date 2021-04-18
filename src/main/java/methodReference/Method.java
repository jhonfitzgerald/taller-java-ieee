package methodReference;

import java.util.Arrays;
import java.util.List;

public class Method {
    public static void main(String[] args) {
        Method manager = new Method();
        manager.init();
    }

    public void init(){
        List<String> lista = Arrays.asList("uno","dos","tres","cuatro","cinco");
        lista.forEach(System.out::println);
        for (String elemento:lista){
            System.out.println(elemento);
        }
    }
}
