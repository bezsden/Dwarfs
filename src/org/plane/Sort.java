package org.plane;

import javafx.collections.transformation.SortedList;

import java.util.*;


public class Sort {
    public static void main(String[] args) {
        Dwarf dwf1 = new Dwarf("Atrey",200);
        Dwarf dwf2 = new Dwarf("Rory",180);
        Dwarf dwf3 = new Dwarf("Bary",150);
        Dwarf dwf4 = new Dwarf("Bary",180);

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
        dwl.add(dwf4);


        for (Dwarf dwf:dwl ) {
            System.out.println(dwf.getName()+" "+dwf.getAge());
        }

        // create object so comparator could be used - had to use hardcode default constructor
        Dwarf sort = new Dwarf();
        Dwarf.DwarfNameAge dwarfsort = sort.new DwarfNameAge();
        Collections.sort(dwl,dwarfsort);

        // works too
        // Collections.sort(dwl,dwf1);


        for (Dwarf dwf:dwl ) {
            System.out.println(dwf.getName()+" "+dwf.getAge());
        }

        Dwarf.DwarfAgeName dwarfsort2 = sort.new DwarfAgeName();
        Collections.sort(dwl,dwarfsort2);

        for (Dwarf dwf:dwl ) {
            System.out.println(dwf.getName()+" "+dwf.getAge());
        }
    }
}
