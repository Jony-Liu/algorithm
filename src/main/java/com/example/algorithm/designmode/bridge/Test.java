package com.example.algorithm.designmode.bridge;

/**
 * @author Jony-Liu
 * @date 2019/9/3 15:42
 */
public class Test {
    public static void main(String[] args) {

        Person man = new Man();

        Person lady = new Lady();

        Clothing jacket = new Jacket();

        Clothing trouser = new Trouser();

        jacket.personDressCloth(man);
        trouser.personDressCloth(man);

        jacket.personDressCloth(lady);
        trouser.personDressCloth(lady);
    }
}
