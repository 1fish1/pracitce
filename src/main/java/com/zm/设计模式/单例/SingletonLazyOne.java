package com.zm.设计模式.单例;

public class SingletonLazyOne {
    /**
     * 懒汉模式
     */
    private static SingletonLazyOne SINGLETON_LAZY ;


    private SingletonLazyOne() {

    }
    public  static SingletonLazyOne getSingletonLazy(){

        if(SINGLETON_LAZY==null){
            SINGLETON_LAZY = new SingletonLazyOne();
        }
        return SINGLETON_LAZY;
    }

}
