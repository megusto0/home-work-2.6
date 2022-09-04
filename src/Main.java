import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 8, 2, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("one", "two", "three", "one", "three"));
        //printOdd(nums);
        task2(nums);
        System.out.println(words);
        task3(words);
        task4(words);
    }

    private static void printOdd(List<Integer> nums) {
        for (Integer num : nums) {
            if (num % 2 == 1) {
                System.out.println(num);
            }
        }

    }

    private static void task2(List<Integer> nums) {
        Set<Integer> set = new TreeSet<>(nums);
        for (Integer num : set) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

    }

    private static void task3(List<String> words) {
        Set<String> set = new TreeSet<>(words);
        System.out.println(set);
    }

    private static void task4(List<String> words) {
        Map<String, Integer> map = new HashMap<>();
        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

            } else {
                map.put(word, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " " + entry.getValue());
            }
        }
        System.out.println();
    }
}