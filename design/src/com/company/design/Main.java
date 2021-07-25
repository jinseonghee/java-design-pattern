package com.company.design;

import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        //객체 생성
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        //SocketClient aClient = new SocketClient();
        //SocketClient bClient = new SocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient)); //객체 두개가 동일한지 확인하는 메서드는 equals 메서드 사용
    }
}
