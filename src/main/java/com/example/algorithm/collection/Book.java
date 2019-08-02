package com.example.algorithm.collection;


public class Book implements Comparable {
    private String state;
    private String name;
    private double rent;
    private int borrowNum;
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return this.name+" "+this.rent;
    }
    public Book(String name,double rent) {
        super();
        this.name = name;
        this.rent = rent;
    }
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getRent() {
        return rent;
    }
    public void setRent(float rent) {
        this.rent = rent;
    }
    public int getBorrowNum() {
        return borrowNum;
    }
    public void setBorrowNum() {
        this.borrowNum = borrowNum+1;
    }
    public Book(String state, String name, double rent, int borrowNum) {
        super();
        this.state = state;
        this.name = name;
        this.rent = rent;
        this.borrowNum = borrowNum;

    }
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		if(o instanceof Book){

			Book  obook = (Book)o;
			if(this.rent<obook.rent){
				return -1;
			}else if(this.rent>obook.rent){
				return 1;
			}else{
				return 0;
			}

		}else{
			throw new RuntimeException("类型不匹配");
		}
			}

}
