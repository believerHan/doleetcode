package leetcode.y2025.m02.d28;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeSet;

//2353 https://leetcode.cn/problems/design-a-food-rating-system/
class FoodRatingsM2 {

    private final Map<String, Pair<Integer, String>> foodMap = new HashMap<>();
    private final Map<String, TreeSet<Pair<Integer, String>>> cuisineMap = new HashMap<>();

    public FoodRatingsM2(String[] foods, String[] cuisines, int[] ratings) {
        for (int i = 0; i < foods.length; i++) {
            String food = foods[i];
            String cuisine = cuisines[i];
            int rating = ratings[i];
            foodMap.put(food, new Pair<>(rating, cuisine));
            cuisineMap.computeIfAbsent(cuisine, k -> new TreeSet<>((a, b) ->
                    !Objects.equals(a.getKey(), b.getKey()) ? b.getKey() - a.getKey() : a.getValue().compareTo(b.getValue())
            )).add(new Pair<>(rating, food));
        }
    }

    public void changeRating(String food, int newRating) {
        Pair<Integer, String> p = foodMap.get(food);
        TreeSet<Pair<Integer, String>> st = cuisineMap.get(p.getValue());
        st.remove(new Pair<>(p.getKey(), food)); // 移除旧数据
        st.add(new Pair<>(newRating, food)); // 添加新数据
        foodMap.put(food, new Pair<>(newRating, p.getValue()));
    }

    public String highestRated(String cuisine) {
        return cuisineMap.get(cuisine).first().getValue();
    }
}
