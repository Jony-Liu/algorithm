package com.example.algorithm.designmode.composite;

import java.util.List;

/**
 * @author Jony-Liu
 * @date 2019/9/5 15:43
 */
public abstract class Employer {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List employers;

    public void printInfo() {
        System.out.println(name);
    }

    public List getEmployers() {
        return this.employers;
    }

}
