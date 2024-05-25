package com.zm.设计模式.单例;

public class SingletonStatic {

    private static volatile  SingletonStatic singletonStatic;


    private SingletonStatic(){

    }
    private static class SingletonStaticInce{
        private static  final   SingletonStatic SINGLETON_STATIC=new SingletonStatic();
    }

    public  static  synchronized SingletonStatic getSingletonStatic(){
        return SingletonStaticInce.SINGLETON_STATIC;
    }
}
