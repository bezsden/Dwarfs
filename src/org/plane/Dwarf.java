package org.plane;

public class Dwarf implements Comparable<Dwarf> {
    private String name;
    private Integer age;

    public void say() {
        System.out.println("I am "+name);
    }


    public int compareTo(Dwarf o) {
        return  this.getAge().compareTo(o.getAge());
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
}
