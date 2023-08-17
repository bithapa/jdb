package week5.jdb.takeo.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class FindMaxInMap {
    public static void main(String[] args) {
        Map<String, Integer> data = new HashMap<>();

        Random random = new Random();
        for (int i =0; i <100; i++) {
            int value = random.nextInt(2001) - 1000;
            String key = "key" + i;
            data.put(key, value);
        }

        int max = Integer.MIN_VALUE;
        String keyMaxVal = "";

        for (Map.Entry<String, Integer> entry : data.entrySet()) {
            if (entry.getValue() > max){
                max = entry.getValue();
                keyMaxVal = entry.getKey();
            }
            System.out.println("(" + entry.getKey() + ", " + entry.getValue() + ")");
        }
        System.out.println("The Key of Max Val: " + keyMaxVal);
    }
}
