package streams;

import java.util.Arrays;
import java.util.List;

public class stream {
    public static void main(String[] args) {
        stream _stream = new stream();
        _stream.init();
    }

    public void init(){
        List<String> lista = Arrays.asList("o1","o2","o3","a4","a5","o6","a7","o8","o9","a10","o11","o12");
        lista.stream().filter(e->e.startsWith("a")).map(String::toUpperCase).sorted().forEach(System.out::println);
    }
}
