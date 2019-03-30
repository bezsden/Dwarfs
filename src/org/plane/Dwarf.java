package org.plane;

import java.util.Comparator;

public class Dwarf implements Comparable<Dwarf>  {
    private String name;
    private Integer age;

    public Dwarf() {

    }

    public void say() {
        System.out.println("I am "+name);
    }



    public int compareTo(Dwarf o) {
        return  this.getName().compareTo(o.getName());
    }

    public Dwarf(String name, Integer age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public class DwarfNameAge implements Comparator<Dwarf> {

    @Override
    public int compare(Dwarf o1, Dwarf o2) {
        if (o1.getName().compareTo(o2.getName())==0)
        {return o1.getAge().compareTo(o2.getAge());
        }
        else
            return o1.getName().compareTo(o2.getName());

    }
    }
    public class DwarfAgeName implements Comparator<Dwarf> {

        @Override
        public int compare(Dwarf o1, Dwarf o2) {
            if (o1.getAge().compareTo(o2.getAge())==0)
            {return o1.getName().compareTo(o2.getName());
            }
            else
                return o1.getAge().compareTo(o2.getAge());

        }
    }

}
