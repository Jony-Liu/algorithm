package com.example.algorithm.refactoring;

/**
 * @author Jony-Liu
 * @date 2020/6/24 22:35
 */
public class Test08 {

}
class BadExample08 {

    public int someMethod(Data data){
        int i = data.getI();
        int j = data.getJ();
        int k = data.getK();
        return i * j * k;
    }

    public static class Data{

        private int i;
        private int j;
        private int k;

        public Data(int i, int j, int k) {
            super();
            this.i = i;
            this.j = j;
            this.k = k;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public int getK() {
            return k;
        }

    }

}

/* ---------------------分割线---------------------- */

class GoodExample08 {

    public int someMethod(Data data){
        return data.getResult();
    }

    public static class Data{

        private int i;
        private int j;
        private int k;

        public Data(int i, int j, int k) {
            super();
            this.i = i;
            this.j = j;
            this.k = k;
        }

        public int getI() {
            return i;
        }

        public int getJ() {
            return j;
        }

        public int getK() {
            return k;
        }

        public int getResult(){
            return i * j * k;
        }

    }

}
