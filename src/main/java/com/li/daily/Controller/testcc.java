package com.li.daily.Controller;

import java.util.ArrayList;
import java.util.Iterator;

public class testcc {

    public static void main(String[] args){
        ArrayList<Integer> dd=new ArrayList(10);
        for(int i=0;i<1000;i++){
            dd.add(i);
        }
        Iterator<Integer> cc=dd.iterator();
        while(cc.hasNext()){
            Integer ee=cc.next();
            System.out.println(ee);
            dd.add(1);
        }
        System.out.println("11");
    }


    public static void aa() throws RuntimeException {


    }

    public static String bb(){
            aa();
            return "1";
    }

    public static void cc(){
        String cc=bb();
        System.out.println(cc);
    }
}
