package com.company.design;

import com.company.design.adapter.*;
import com.company.design.aop.AopBrowser;
import com.company.design.decorator.*;
import com.company.design.facade.Ftp;
import com.company.design.facade.Reader;
import com.company.design.facade.SftpClient;
import com.company.design.facade.Writer;
import com.company.design.observer.Button;
import com.company.design.observer.IButtonListener;
import com.company.design.proxy.Browser;
import com.company.design.proxy.BrowserProxy;
import com.company.design.proxy.IBrowser;
import com.company.design.singleton.AClazz;
import com.company.design.singleton.BClazz;
import com.company.design.singleton.SocketClient;
import com.company.design.strategy.*;
import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.concurrent.atomic.AtomicLong;

public class Main {

    public static void main(String[] args) {

        Encoder encoder = new Encoder(); //기본 Encoder

        //base64
        EncodingStrategy base64 = new Base64Strategy(); // base64 전략 생성

        //normal
        EncodingStrategy normal = new NormalStrategy(); // normal 전략 생성

        String message = "hello java";

        encoder.setEncodingStrategy(base64);
        String base64Result = encoder.getMessage(message);
        System.out.println(base64Result);

        encoder.setEncodingStrategy(normal);
        String normalResult = encoder.getMessage(message);
        System.out.println(normalResult);

        encoder.setEncodingStrategy(new AppendStragegy());
        String appendResult = encoder.getMessage(message);
        System.out.println(appendResult);

    }
        //콘센트
        public static void connect (Electronic110V electronic110V){ //main 자체가 static이기 때문에 만든 method도 static 이어야 함
            electronic110V.powerOn();
        }
}
