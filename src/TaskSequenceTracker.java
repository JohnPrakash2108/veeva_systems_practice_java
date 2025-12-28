import java.util.ArrayList;

public class TaskSequenceTracker {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<>();
        list.add("Milk");
        list.add("Egg");
        list.add("Milk");
        for(String s:list){
            System.out.println(s);
        }
    }
}
