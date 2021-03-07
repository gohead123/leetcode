package com.li.daily.Controller;

import java.util.List;

public class testa implements  Runnable{
    private final String aa;
    private final String dd;

    public testa(String cc,String bb){
        aa=cc;
        dd=bb;
    }

    public void run() {
        synchronized (aa) {

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (dd){
                System.out.println(dd);
            }
        }
    }
}
