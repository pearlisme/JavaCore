package com.pearl.java.concurrency;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentModification {

    public static void main(String[] args) {

        Map<String,Object> foodData = new ConcurrentHashMap<>();
//       Map<String,Object> foodData = new HashMap<>();
        foodData.put("Penguin",1);
        foodData.put("Flamingo",2);

        for (Map.Entry<String, Object> entry: foodData.entrySet()){
            System.out.println(entry.getKey()+" "+entry.getValue());
            foodData.remove(entry);
            System.out.println(foodData.size());
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}
