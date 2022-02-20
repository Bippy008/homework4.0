package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> listA = new LinkedList<>();
        LinkedList<String> listB = new LinkedList<>();
        Scanner stringScan = new Scanner(System.in);

        System.out.println("Введите 5 строк: ");
        for (int i = 0; i < 5; i++) {
            String str = stringScan.next();
            listA.add(str);
        }
        System.out.println("Полученный список A: " + listA);
        System.out.println("Введите еще 5 строк: ");
        for (int i = 0; i < 5; i++) {
            String str = stringScan.next();
            listB.add(str);
        }
        System.out.println("Полученный список B: " + listB);
        LinkedList<String> listC = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            listC.add(listA.get(i));
            listC.add(listB.get(4-i));
        }
        System.out.println("Полученный список C: " + listC);
        Collections.sort(listC, new Comparator<String>() {
            @Override
            public int compare(String element1, String element2) {
                return element1.length() - element2.length();
            }
        });
        System.out.println("Полученный список C: " + listC);
    }
}
