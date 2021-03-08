package com.test;

//这一节用来对比类的初始化和类的实例化。
public class Initialize {
    //初始块
    {
        System.out.println("这是初始块");
    }
    //静态初始块
    static {
        System.out.println("这是静态初始块");
    }
    public Initialize(){
        System.out.println("这是构造函数");
    }
}
