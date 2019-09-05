package com.example.algorithm.designmode.composite;

import java.util.List;

/**
 * @author Jony-Liu
 * @date 2019/9/5 15:48
 */
public class Test {
    public static void main(String[] args) {
        Employer pm = new ProjectManager("ProjectManager");
        Employer pa = new ProjectAssistant("ProjectAssistant");
        Employer programmer1 = new Programmer("Programmer01");
        Employer programmer2 = new Programmer("Programmer02");

        pm.add(pa);
        pm.add(programmer2);

        List ems = pm.getEmployers();
        for (Object em : ems) {
            if(em instanceof Employer){
                System.out.println(((Employer)em).getName());
            }

        }
    }

}
