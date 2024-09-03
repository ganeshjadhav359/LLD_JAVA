package org.ganeshjadhav;

final public class SingletonClass {
    private volatile static SingletonClass singletonClass;

    private SingletonClass(){};

    public static SingletonClass getInstance(){
        if(singletonClass == null){
            synchronized (SingletonClass.class){
                if(singletonClass == null){
                    singletonClass = new SingletonClass();
                }
            }
        }

        return  singletonClass;
    }
}
