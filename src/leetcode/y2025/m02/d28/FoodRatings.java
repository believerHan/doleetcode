package leetcode.y2025.m02.d28;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

//2353 https://leetcode.cn/problems/design-a-food-rating-system/
class FoodRatings {
    private final Map<String, Food> foods = new HashMap<>();
    private final Map<String, PriorityQueue<Food>> memo = new HashMap<>();

    public FoodRatings(String[] names, String[] cuisines, int[] ratings) {
        int len = names.length;
        for (int i = 0; i < len; i++) {
            Food food = new Food(names[i], cuisines[i], ratings[i]);
            foods.put(names[i], food);
            memo.computeIfAbsent(cuisines[i], a -> new PriorityQueue<>((o1, o2) -> {
                if (o1.rating == o2.rating) {
                    return o1.name.compareTo(o2.name);
                }
                return o2.rating - o1.rating;
            })).add(food);
        }
    }

    public void changeRating(String name, int newRating) {
        Food food = foods.get(name);
        Food newFood = new Food(name, food.cuisine, newRating);
        foods.put(name, newFood);
        memo.get(food.cuisine).offer(newFood);
    }

    public String highestRated(String cuisine) {
        PriorityQueue<Food> list = memo.get(cuisine);
        while (!list.isEmpty()) {
            Food food = list.peek();
            if (food.rating == foods.get(food.name).rating) {
                return food.name;
            }
            list.poll();
        }
        throw new IllegalArgumentException("no such cuisine");
    }

    private static class Food {
        public final String name;
        public final String cuisine;
        public int rating;

        public Food(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }
}
