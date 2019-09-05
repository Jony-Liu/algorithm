package com.example.algorithm.designmode.composite;

/**
 * @author Jony-Liu
 * @date 2019/9/5 15:45
 */
public class ProjectAssistant extends Employer {
    public ProjectAssistant(String name) {
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
