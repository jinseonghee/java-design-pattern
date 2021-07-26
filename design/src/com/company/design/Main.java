package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        ICar audi = new Audi(1000);
        audi.showPrice();

        //a3
        ICar audi3 = new A3(audi,"A3");
        audi3.showPrice();

        //a4
        ICar audi4 = new A4(audi,"A4");
        audi4.showPrice();

        //a5
        ICar audi5 = new A5(audi,"A5");
        audi5.showPrice();
    }
        //콘센트
        public static void connect (Electronic110V electronic110V){ //main 자체가 static이기 때문에 만든 method도 static 이어야 함
            electronic110V.powerOn();
        }

}
