package com.example.algorithm.designmode.builder;

/**
 * @author Jony-Liu
 */
public class PersonDirector {

    public Person constructPerson(PersonBuilder pb) {
        pb.buildHead();
        pb.buildBody();
        pb.buildFoot();
        return pb.buildPerson();
    }

}