package com.example.algorithm.designmode.composite;

import java.util.ArrayList;

/**
 * @author Jony-Liu
 * @date 2019/9/5 15:46
 */
public class ProjectManager extends Employer {
    public ProjectManager(String name) {
        setName(name);
        employers = new ArrayList();
    }

    @Override
    public void add(Employer employer) {
        employers.add(employer);
    }

    @Override
    public void delete(Employer employer) {
        employers.remove(employer);
    }

}
