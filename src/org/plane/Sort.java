package org.plane;

import javafx.collections.transformation.SortedList;

import java.util.*;


public class Sort {
    public static void main(String[] args) {
        Dwarf dwf1 = new Dwarf("Tory",200);
        Dwarf dwf2 = new Dwarf("Rory",180);
        Dwarf dwf3 = new Dwarf("Sara",150);

        //dwf1.say();
        //dwf2.say();
        //dwf3.say();
        //System.out.println( dwf1.compareTo(dwf2));

        // sort Dwarfs by something.
        // First is Name, Age, Name and age, age and name
        // First use comparable, then comparator

        List<Dwarf> dwl = new ArrayList<Dwarf>();
        dwl.add(dwf2);
        dwl.add(dwf1);
        dwl.add(dwf3);


        for (Dwarf dwf:dwl ) {
            System.out.println(dwf.getName()+" "+dwf.getAge());
        }

        Collections.sort(dwl);

        for (Dwarf dwf:dwl ) {
            System.out.println(dwf.getName()+" "+dwf.getAge());
        }

    }
}
