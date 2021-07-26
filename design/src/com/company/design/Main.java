package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
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

        Button button = new Button("버튼");

        button.addListener(new IButtonListener() { //익명 클래스로 전달받아 사용
            @Override
            public void clickEvent(String event) { //밑에 button.click이 일어나면 내부에서 Listener를 통해 전달해서 매개변수 event에 메시지가 전달되어 출력
                System.out.println(event);
            }
        });

        button.click("메시지 전달 : click 1");
        button.click("메시지 전달 : click 2");
        button.click("메시지 전달 : click 3");
        button.click("메시지 전달 : click 4");

    }
        //콘센트
        public static void connect (Electronic110V electronic110V){ //main 자체가 static이기 때문에 만든 method도 static 이어야 함
            electronic110V.powerOn();
        }
}
