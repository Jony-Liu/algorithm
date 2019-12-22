package com.example.algorithm.thread;

/**
 * @author jonyliu
 * @date 2019/12/20 9:59
 */
public class Work3_04 {

    public static void main(String[] args) {
        ALogin alogin = new ALogin();
        BLogin blogin = new BLogin();
        alogin.start();
        blogin.start();
    }

}
class ALogin extends Thread{
    @Override
    public void run(){
        LoginServlet.login("a","aa");
    }
}

class BLogin extends Thread{
    @Override
    public void run(){
        LoginServlet.login("b","bb");
    }
}

class LoginServlet {
    private static String nameRef;
    private static String passwordRef;

    synchronized public static void login(String name, String password) {
        try {
            nameRef = name;
            if ("a".equals(name)) {
                Thread.sleep(5000);
            }
            passwordRef = password;
            System.out.println("name="+nameRef+",password="+passwordRef);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
