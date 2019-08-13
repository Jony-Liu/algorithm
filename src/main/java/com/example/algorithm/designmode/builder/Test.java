package com.example.algorithm.designmode.builder;

public class Test {

    public static void main(String[] args) {
        PersonDirector pd = new PersonDirector();
        Person man = pd.constructPerson(new ManBuilder());
        System.out.println(man.getBody());
        System.out.println(man.getFoot());
    }

}
