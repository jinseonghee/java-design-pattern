package com.company.design.proxy;

public class BrowserProxy implements IBrowser {

    private String url;
    private Html html;

    public BrowserProxy(String url) {
        this.url = url;
    }

    @Override
    public Html show() {

        if(html == null) { //캐싱
            this.html = new Html(url); //html이 null 이면 새로운 Html(url) 넣어 줌.
            System.out.println("BrowserProxy loading html from : " + url);
        }
        System.out.println("BrowserProxy use cache html : " + url); //null이 아니면 캐싱되어 있는 html 사용
        return html; //그게 아니면 자기 자신이 가지고 있는 html return
    }
}
