import java.util.HashSet;
import java.util.Set;

public class UniqueUsernameFilter {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("John");
        set.add("Hanna");
        set.add("Eswar");
        set.add("John");

        System.out.println(set.size());
        for(String s:set){
            System.out.println(s);
        }
    }
}
