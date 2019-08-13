package com.example.algorithm.designmode.builder;


public interface PersonBuilder {

    void buildHead();

    void buildBody();

    void buildFoot();

    Person buildPerson();

}