package optionalClass;

import java.util.Optional;

public class optional {
    public static void main(String[] args) {
        optional _optional = new optional();
        _optional.init();
    }

    public void init(){
        Integer nullInteger = null;
        Integer nonNullInteger = 10;
        Optional<Integer> valor01 = Optional.ofNullable(nullInteger);
        Optional<Integer> valor02 = Optional.of(nonNullInteger);
        System.out.println(suma(valor01,valor02));
    }

    public int suma(Optional<Integer> valor01, Optional<Integer> valor02){
        System.out.println("valor 01"+ valor01.isPresent());
        System.out.println("valor 02"+ valor02.isPresent());
        int _valor01 = valor01.orElse(0);
        int _valor02 = valor02.get();
        return _valor01+_valor02;
    }
}
