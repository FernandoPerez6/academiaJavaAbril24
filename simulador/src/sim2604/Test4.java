package sim2604;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListSet;

public class Test4 {
    public static void main(String[] args) {
        List<Object> list = Arrays.asList(25,"Hola", 7, 25,"hola", 67);
                
        System.out.println(list);
        System.out.println(new HashSet<>(list));
        System.out.println(new TreeSet<>(list));
        System.out.println(new HashSet<>(list));
        System.out.println(new ConcurrentSkipListSet<>(list));
    }
}