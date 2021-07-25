package com.company.design.singleton;

public class SocketClient {

    private static SocketClient socketClient = null; //싱글톤은 자기자신의 객체를 가지고 있어야 한다.(default null로 초기화)

    //public SocketClient() {} 만약 한 객체를 사용하는게 아닌(싱글톤방식) 각자의 객체를 만들어서 사용하고 싶으면 생성자를 public으로 바꿈

    private SocketClient() {//기본 생성자는 private으로 막아 기본생성자로 만들수 없도록 함.

    }

    public static SocketClient getInstance() {//static을 통해 getInstance() 메서드를 제공, 객체 자체는 자기자신을 return 할 수 있도록 SocketClient 해줌

        if(socketClient == null) { //현재 내가 가지고 있는 객체가 null인지 아닌지를 체크하고, null 이면 객체 생성

            socketClient = new SocketClient();
        }
        return socketClient; //null이 아닌 경우 자신이 가지고 있는 socketClient를 return
    }

    public void connect() {
        System.out.println("connect");
    }

}
