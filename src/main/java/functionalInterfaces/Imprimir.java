package functionalInterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Imprimir {
    public static void main(String[] args) {
        Imprimir manager = new Imprimir();
        manager.init();
    }

    public void init(){
        List<Integer> lista = Arrays.asList(1, 2, 3, 4,5,6,7,8,9);
        System.out.println("todos");
        evaluar(lista,n->true);

        System.out.println("pares");
        evaluar(lista,n->n%2==0);

        System.out.println("mayores que 5");
        evaluar(lista,n->n>5);
    }

    public void evaluar(List<Integer> list, Predicate<Integer> predicate){
        for (Integer number: list){
            if(predicate.test(number)){
                System.out.print(number+" - ");
            }
        }
    }
}
