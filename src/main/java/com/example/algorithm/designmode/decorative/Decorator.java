package com.example.algorithm.designmode.decorative;

public abstract class Decorator extends SchoolReport {
    private SchoolReport sr;
    public Decorator(SchoolReport sr) {
        // TODO Auto-generated constructor stub
        this.sr = sr;
    }
    @Override
    public void report() {
        // TODO Auto-generated method stub
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        // TODO Auto-generated method stub
        this.sr.sign(name);
    }

}
