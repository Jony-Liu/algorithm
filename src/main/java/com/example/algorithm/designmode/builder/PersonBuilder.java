package com.example.algorithm.designmode.builder;

/**
 * @author Jony-Liu
 */
public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();

}