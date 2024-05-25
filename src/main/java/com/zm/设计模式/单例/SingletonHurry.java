package com.zm.设计模式.单例;

public class SingletonHurry {
    /**
     * 饿汉模式，生怕对手不用自己的产品
     */

    private static final SingletonHurry SINGLETON = new SingletonHurry();

    private SingletonHurry() {

    }
//第一次写缺少static
    public  static  SingletonHurry getSingleton() {
        return SINGLETON;
    }


}
