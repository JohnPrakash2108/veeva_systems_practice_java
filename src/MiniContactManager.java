import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MiniContactManager {
    public static void main(String[] args) {
        Map<String,String> mp = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        mp.put("Mom","9567789056");
        mp.put("Dad","9567785656");
        mp.put("Me","567789056");
        System.out.println(mp.get("Mom"));
        System.out.println("Mom is in phone book? "+mp.containsKey("Mom"));
        mp.remove("Mom");
        System.out.println("Mom is in phone book? "+mp.containsKey("Mom"));
        mp.put("Dad","9440151969");
        System.out.println("Enter key to search: ");
        String str = sc.nextLine();
        System.out.println(mp.get(str));

        System.out.println("Mobiles: ");
        for(Map.Entry<String, String> map: mp.entrySet()){
            System.out.println(map.getKey()+" "+map.getValue());
        }



    }
}
