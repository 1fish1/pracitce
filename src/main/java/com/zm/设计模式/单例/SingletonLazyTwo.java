package com.zm.设计模式.单例;

public class SingletonLazyTwo {

    private static SingletonLazyTwo SINGLETON_LAZY ;


    private SingletonLazyTwo() {

    }
    public static synchronized    SingletonLazyTwo getSingletonLazy(){

        if(SINGLETON_LAZY==null){
            SINGLETON_LAZY = new SingletonLazyTwo();
        }
        return SINGLETON_LAZY;
    }
}
