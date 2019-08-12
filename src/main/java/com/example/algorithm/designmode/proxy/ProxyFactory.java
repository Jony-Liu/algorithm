package com.example.algorithm.designmode.proxy;

public class ProxyFactory implements Factory {
    
    private Factory ft;

    public ProxyFactory(Factory ft) {
        // TODO Auto-generated constructor stub
        this.ft = ft;
    }

    @Override
    public void clothProduct() {
        // TODO Auto-generated method stub
        System.out.println("代理生产开始。。");
        ft.clothProduct();
        System.out.println("代理生产结束。。");
    }

}
