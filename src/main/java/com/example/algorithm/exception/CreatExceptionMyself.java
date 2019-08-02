package com.example.algorithm.exception;

class MyExcept extends Exception {
    static final long serialVersionUID = 1L;
    private int idnumber;

    MyExcept(String message, int id) {
        super(message);
        this.idnumber = id;
    }

    public int getId() {
        return this.idnumber;
    }
}

public class CreatExceptionMyself {
    public static void regist(int num) throws MyExcept {
        if (num < 0) {
            throw new MyExcept("注册失败！", 3);
        } else {
            System.out.println("注册成功！");
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            regist(-1);
        } catch (MyExcept e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}

