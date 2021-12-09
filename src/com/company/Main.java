package com.company;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> hm = new HashMap<String, Integer>(3) {
            {
                this.put("Сырок", 3);
                this.put("Пряник", 5);
                this.put("Сүт", 1);
                this.put("Нан", 1);
            }
        };
        System.out.println(hm);
        hm.put("Пряник", 4); // кілт болмауы кезінде ауыстыру немесе қосу
        System.out.println(hm + "элемент ауысқаннан кейін");
        Integer a = hm.get("Нан");
        System.out.println(a + " -  'Нан кілті бойынша табылған");
// Map.Entry <K, V> интерфейсінің әдістерін пайдаланып хэш кестесін көрсету
        Set<Map.Entry<String, Integer>> setv = hm.entrySet();
        System.out.println(setv);
        Iterator<Map.Entry<String, Integer>> i = setv.iterator();
        while (i.hasNext()) {
            Map.Entry<String, Integer> me = i.next();
            System.out.println(me.getKey() + " : " + me.getValue());
        }
        Set<Integer> val = new HashSet<Integer>(hm.values());
        System.out.println(val);
    }
}

