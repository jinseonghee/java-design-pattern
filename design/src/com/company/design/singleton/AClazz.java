package com.company.design.singleton;

public class AClazz {

    private SocketClient socketClient;

    public AClazz() {//기본 생성자 초기화

        //this.socketClient = new SocketClient(); default 생성자를 private으로 막아놨기 떄문에 객체 생성 불가능해서 getInstance() 메서드를 통해 해야함.
        this.socketClient = SocketClient.getInstance();
    }

    public SocketClient getSocketClient() {
        return this.socketClient;
    }
}
