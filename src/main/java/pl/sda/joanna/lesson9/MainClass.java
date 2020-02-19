package pl.sda.joanna.lesson9;
//wyjątki
//listy
//mapy

import java.util.*;

public class MainClass {

    public static void main(String[] args) {
        //lista Stringów
        List<String> newList = new ArrayList<>();
        //dodawanie elementów do listy
        newList.add("name");
        newList.add("age");
        newList.add("address");
        newList.add("Jola");
        newList.add("Ola");
        newList.add("Asia");
        //   newList.remove(3);//usuwanie z listy elementu
        newList.add(4, "Mariola");


        //pętla do przechodzenia po elementach kolekcji (listy)

        for (String list : newList) {
            System.out.println(list);
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(newList.get(i));
        }
        for (int i = 0; i < newList.size(); i++) {
            System.out.println(i + ": " + newList.get(i));
        }

//nowa lista z elementami poprzendiej listy
        List<String> listName = newList.subList(3, 6);
        System.out.println(listName);

        Set<String> names = new HashSet<>();
        names.add("Olaf");
        names.add("Ola");
        names.add("Jozef");
        names.add("Olaf");
        names.add("Mikolaj");


        for (String name : names) {
            System.out.println(name);
        }
        Set<String> allNames = new HashSet<>(names);
        allNames.add("mariusz");

        for (String all : allNames) {
            System.out.println(all);
        }

        //mapy

        Map<String, String> map = new HashMap<>();
        map.put("Europa", "Polska");
        map.put("Azja", "Chiny");
        map.put("Afryka", "Egipt");
        map.put("Ameryka", "USA");

        System.out.println(map.get("Europa"));

        for (String k : map.keySet()) {
            System.out.println(k);
        }

        for (String v : map.values()) {
            System.out.println(v);
        }
        //wypisanie pary
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
        Map<String, String> panstwa = new HashMap<>();
        panstwa.put("Polska", "Warszawa");
        panstwa.put("Niemcy", "Berlin");
        for (Map.Entry<String, String> slownik : panstwa.entrySet()) {
            String panstwo = slownik.getKey();
            String stolica = slownik.getValue();
            System.out.printf("%s : %s\n", panstwo, stolica);
        }
    }
}










