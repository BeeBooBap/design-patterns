package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class MapSumStrings {

    public static Map<List<Integer>, Integer> sumStrings(Map<String, List<Integer>> data) {
        return data.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.summingInt(e -> e.getKey().length())));
    }

    public static void main(String[] args) {
        Map<String, List<Integer>> data = new ConcurrentHashMap<>();
        List<Integer> coords = new ArrayList<>();
        coords.add(1);
        coords.add(3);
        data.put("a", coords);

        System.out.println(sumStrings(data));
    }

}
