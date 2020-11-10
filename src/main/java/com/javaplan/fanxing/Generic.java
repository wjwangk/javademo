package com.javaplan.fanxing;

import sun.rmi.runtime.Log;

public class Generic <T>{
    private T key;

    public Generic(T key1){
        this.key =key1;
    }

    public T getKey(){
        return key;
    }

    public static void main(String args[]) {
    Generic<Integer> intGen = new Generic<>(1100);
    Generic<String> StringGen = new Generic<>("1001");
    System.out.println("泛型测试"+"key is"+" "+intGen.getKey());
        System.out.println(StringGen.getKey());

}



}
