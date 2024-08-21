package com.blit.day9;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapIntro {

    public static void main(String[] args) {
//        Map:
//        Has key and value combination
//        key and value can be string or integer, key can value both can be string or integer
//        Map can have duplicate value but not duplicate key

//        HashMap                        LinkedHAshMap                 TreeMap
//        can store null values          can store null values         can't store null values
//        no insertion order             follow insertion order        follow insertion order

        // HashMap does not keep insertion order
        HashMap <Integer, String> m1 = new HashMap<>();
        m1.put(5, null); // can store null value
        m1.put(11, "david"); // storing value with key number
        m1.put(20, "paul");
        m1.put(31, "chris");
        m1.put(44, "kal");
        m1.put(58, "sara");
        System.out.println(m1);
        m1.remove(11); // removing element with the key number
        System.out.println(m1);

        // LinkedHashMap keep the insertion order
        LinkedHashMap <Integer, String> m2 = new LinkedHashMap<>();
        m2.put(5, null); // can store null value
        m2.put(11, "david"); // storing value with key number
        m2.put(20, "paul");
        m2.put(31, "chris");
        m2.put(44, "kal");
        m2.put(58, "sara");
        System.out.println(m2);
        m2.replace(20, "ron"); // replace the value by giving key number
        System.out.println(m2);
        m2.remove(20); // removing element by key number
        System.out.println(m2);

        // TreeMap sort by key (not by value)
        TreeMap <Integer, String> m3 = new TreeMap<>();
        m3.put(2, "sara");
        m3.put(11, "bob");
        m3.put(5, "david");
        m3.put(20, "kal");
        m3.put(7, "john");
        System.out.println(m3);

//        for each loop for hashmap
        for(Integer key: m1.keySet()){ // Iterating through keys of hashmap
            System.out.println(key);
        }
        for(String val: m1.values()){ // Iterating through values of hashmap
            System.out.println(val);
        }

        m1.forEach((k,v) -> System.out.println("key: "+k+" value:"+v));

        for(HashMap.Entry<Integer, String> entry : m1.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: "+key+ ", Value: "+value);

        }
    }
}
