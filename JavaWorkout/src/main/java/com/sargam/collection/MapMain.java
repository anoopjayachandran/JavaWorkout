/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sargam.collection;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author anoop
 */
public abstract class MapMain {

//    public static void main(String... args) {
//        Map<Integer, String> color = new HashMap<>();
//
//        color.put(1, "Red");
//        color.put(4, "Green");
//        color.put(2, "Blue");
//        color.put(5, "Yelow");
//        color.put(3, "Black");
//        color.put(6, "White");
//        color.put(1, "Pink");
//        color.put(7, "Cyan");
//
//    }

    /**
     * Method to iterate map using the key set.
     *
     * Map structure modification not allowed. Will throw
     * ConcurrentModificationException
     *
     * @param colors
     */
    public static final void loopKeySet(Map<Integer, String> colors) {
        Set<Integer> keySet = colors.keySet();
        for (Integer key : keySet) {
            System.out.println("Key : " + key + " Value :" + colors.get(key));
        }
    }

    /**
     * Method to iterate map using its Entry set.
     *
     * Map structure modification not allowed. Will throw
     * ConcurrentModificationException
     *
     * @param colors
     */
    public static final void loopEntrySet(Map<Integer, String> colors) {
        Set<Entry<Integer, String>> entries = colors.entrySet();

        for (Entry entry : entries) {
            System.out.println("Key :" + entry.getKey() + " Value : " + entry.getValue());
        }
    }

    /**
     * Iterating Map using the Iterator of key Set.
     *
     * We can perform structure modification of map. For example we can remove
     * and object using the remove method of Iterator.
     *
     * @param colors
     */ 
    public static final void loopKeySetIterator(Map<Integer, String> colors) {
        Iterator<Integer> keys = colors.keySet().iterator();
        Integer key;
        while (keys.hasNext()) {
            key = keys.next();
            System.out.println("Key : " + key + " Value :" + colors.get(key));
        }
    }

    /**
     * Iterating through the Entry Set iterator.
     *
     * We can perform structure modification of map. For example we can remove
     * and object using the remove method of Iterator.
     *
     * @param colors
     */
    public static final void loopEntrySetIterator(Map<Integer, String> colors) {
        Iterator<Entry<Integer, String>> entries = colors.entrySet().iterator();
        Entry entry;
        while (entries.hasNext()) {
            entry = entries.next();
            System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue());
        }
    }

    /**
     * Method to loop through the values for map.
     *
     * @param colors
     */
    public static final void loopMapValues(Map<Integer, String> colors) {
        for (String value : colors.values()) {
            System.out.println("Values :" + value);
        }
    }

    /**
     * Method that iterates map using the forEach() of Map and
     * forEachRemaining() of Iterator action using Lambda expression.
     *
     * @param colors
     */
    public static final void loopMapForEach(Map<Integer, String> colors) {

        colors.forEach((k, v) -> System.out.println("Key : " + k + " Value : " + v));

        colors.keySet().forEach(k -> System.out.println("Key : " + k + " Value :" + colors.get(k)));

        colors.entrySet().forEach(entry -> System.out.println("Key : " + entry.getKey() + " Value :" + entry.getValue()));

        colors.keySet().iterator().forEachRemaining(item -> System.out.println("Key : " + item + " Value :" + colors.get(item)));

        colors.entrySet().iterator().forEachRemaining(entry -> System.out.println("Key :" + entry.getKey() + " Value :" + entry.getValue()));

        colors.values().forEach(v -> System.out.println("Value : " + v));
    }
}
