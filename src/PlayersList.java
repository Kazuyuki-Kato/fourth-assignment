import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class PlayersList {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("山岡", 19);
        map.put("山下", 11);
        map.put("田島", 29);
        map.put("吉田", 23);
        map.put("宮城", 13);

        List<Map.Entry<String, Integer>> entries = map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("選手名:" + entry.getKey() + "," + "背番号:" + entry.getValue());
        }
    }
}