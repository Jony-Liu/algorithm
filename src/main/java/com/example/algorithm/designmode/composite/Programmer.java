package com.example.algorithm.designmode.composite;

/**
 * @author Jony-Liu
 * @date 2019/9/5 15:44
 */
public class Programmer extends Employer {
    public Programmer(String name) {
        setName(name);
        employers = null;
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }

}
