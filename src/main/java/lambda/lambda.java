package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class lambda {
    public static void main(String[] args) {
        lambda manager = new lambda();
        manager.init();
    }

    public void init(){
        List<Integer> listaEnteros = Arrays.asList(5,3,1,2,4,6,9,7);
        System.out.println("lista desordenada:"+listaEnteros);

        Collections.sort(listaEnteros, (a,b)->b-a);
        System.out.println("lista ordenada"+listaEnteros);
    }
}
