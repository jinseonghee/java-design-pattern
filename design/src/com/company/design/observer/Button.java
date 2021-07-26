package com.company.design.observer;


public class Button {

    private String name;
    private IButtonListener buttonListener;

    public Button(String name) {
        this.name = name;
    }

    public void click(String message) { //메시지가 일어나면 listener를 통해 전달
        buttonListener.clickEvent(message); //buttonListener의 clickEvent에 이 message를 전달
    }

    public void addListener(IButtonListener buttonListener) {
        this.buttonListener = buttonListener;
    }
}
