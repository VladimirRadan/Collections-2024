import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Maps {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Text1");//key + value = entry
        map.put(2, "Text2");
        map.put(3, "Text3");
        map.put(4, "Text4");
        map.put(5, "Text5");
        map.put(6, "Text5");

        for (Map.Entry m: map.entrySet()){
            System.out.println("Key: " + m.getKey() + " Value: " + m.getValue());
        }

        List list = new ArrayList(map.entrySet());
        System.out.println(list);


        Map<Double, Boolean> map1 = new HashMap<>();
        map1.put(1.0, true);
        map1.put(2.0, true);
        map1.put(3.0, false);

        Map<String, List<String>> map2 = new HashMap<>();

    }



}
