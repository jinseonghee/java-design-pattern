package com.company.design.adapter;

public class SocketAdapter implements Electronic110V { //220v 가 들어와서 110v로 변환해 주어야 하기 때문에 기본 110v 상속

    private  Electronic220V electronic220V; //자기 자신이 연결 시켜 줘야 할 220v를 가지고 있어야 함.

    public SocketAdapter(Electronic220V electronic220V) {//default Construnctor에서 220v에 해당되는 제품을 받음

        this.electronic220V = electronic220V;  // 내가 가진 electronic220V에 220v해당하는 제품(매개변수)을 할당
    }

    @Override
    public void powerOn() {

        electronic220V.connect();//110v에 220v가 할당 되었을 떄, 실제로 220v 의 connect를 호출
    }
}
