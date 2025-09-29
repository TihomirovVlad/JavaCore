package com.microservice.javacore.Generics.WildCard;

public class Gen <T> {
    private T obj;

    private Gen(T obj) {
        this. obj = obj;
    }

    private static void setA(Gen<? extends A> aObj){
        System.out.println("setA");
    }
    private static void setB(Gen<? extends B> bObj){
        System.out.println("setB");
    }
}
