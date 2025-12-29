package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamClass {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(5,1,2,3,4,5,6,7,8,9,10);

        System.out.println("Squares of a number");
        list.stream().map(x->x*x).forEach(System.out::println);

        System.out.println("Numbers greater than 5");
        list.stream().filter((Integer i)->i>5).forEach(System.out::println);

        System.out.println("Sorted order");
        list.stream().sorted().forEach(System.out::println);

        List<Integer> cubes = list.stream().map(x->x*x*x).toList();
        System.out.println("Cubes of a number: ");
        System.out.println(cubes);

        //Strings
        List<String> s = Arrays.asList("hello","srkr","students","b","bcx");
        Stream<String> stream = s.stream();
        List<String> length =  stream.filter(x->x.length()>=4).toList();
        System.out.println(length);

    }
}
