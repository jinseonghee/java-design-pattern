package com.company.design.decorator;

public class A3 extends AudiDecorator {

    public A3(ICar audi, String modelName) { //A3 클래스에 default 생성자가 없으면 상위 클래스의 default 생성자가 자동으로 불리워 짐
        super(audi, modelName, 1000); //super라는 키워드를 통해 상위 클래스의 생성자를 하위클래스에서 사용하는데, 상위클래스의 default생성자에 매개변수가 있으므로 여기서 명시적으로 선언
    }
}
