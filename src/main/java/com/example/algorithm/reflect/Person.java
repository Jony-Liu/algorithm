package com.example.algorithm.reflect;

/**
 * @author Jony-Liu
 */
public class Person {

    private String name;
    public int age;

    public Person() {
        name = "Jony";
        age = 23;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person){
            Person person = (Person)obj;
            if(this.age==person.age&&this.name.equals(person.name)){
                return true;
            }else {
                return false;
            }
        }else {
            return false;
        }

    }

    @Override
    public String toString() {
        return "name:" + name + "  age:" + age;
    }

    public void show() {
        System.out.println("name:" + name + "  age:" + age);
    }

    private void show(String name) {
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
