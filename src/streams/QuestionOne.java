package streams;

import java.util.Arrays;
import java.util.List;

public class QuestionOne {
    public static List<Integer> convertion1(List<Integer> list){
        List<Integer> ans = list.stream()
                .filter(x->x%2==0)
                .map(x->x*x)
                .toList();
        return ans;
    }

    public static List<String> stringStreams(List<String> list){
        List<String> ans = list.stream()
                .map(String::toUpperCase)
                .filter(x->x.length()>3)
                .sorted()
                .toList();
        return ans;
    }
    public static int getSum(List<Integer> list){
        return list.stream()
                .reduce(0,Integer::sum);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println(convertion1(list));
        List<String> names = Arrays.asList("java","c","python","go","spring","js");
        System.out.println(stringStreams(names));
        List<Integer> nums = Arrays.asList(2,4,6,8,10);
        System.out.println(getSum(nums));

    }
}
