package com.company.design;

import com.company.design.adapter.*;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;

public class Main {

    public static void main(String[] args) {

        /*
        //객체 생성
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();

        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        //SocketClient aClient = new SocketClient();
        //SocketClient bClient = new SocketClient();

        System.out.println("두 개의 객체가 동일한가?");
        System.out.println(aClient.equals(bClient)); //객체 두개가 동일한지 확인하는 메서드는 equals 메서드 사용
         */

        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);

        /*
        Cleaner cleaner = new Cleaner();
        connect(cleaner); //connect는 매개변수로 110v 받을 수 있는데, 220v 가 들어와서 error(220v를 110v로 바꿔줄 adapter가 필요)
         */

        Cleaner cleaner = new Cleaner();
        Electronic110V adapter = new SocketAdapter(cleaner); //SocketAdapter라는 객체를 통해서 220v를 110v로 변환
        connect(adapter); //자기 자신의 상태는 변환을 시키지 않고 인터페이스 형태를 맞추는 형태를 adapter 패턴

        AirConditioner airConditioner = new AirConditioner();
        Electronic110V airAdapter = new SocketAdapter(airConditioner);
        connect(airAdapter);
    }

    //콘센트
    public static void connect(Electronic110V electronic110V) { //main 자체가 static이기 때문에 만든 method도 static 이어야 함
        electronic110V.powerOn();
    }
}
