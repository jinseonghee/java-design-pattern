package com.company.design.decorator;

public class AudiDecorator implements ICar {

    protected ICar audi; //상속을 할때 private이라고 선언하면 외부 클래스에서 접근이 안되는데, protected는 하위클래스에서 접근 가능
    protected String modelName;
    protected int modelPrice;

    public AudiDecorator(ICar audi, String modelName, int modelPrice) {
        this.audi = audi;
        this.modelName = modelName;
        this.modelPrice = modelPrice;
    }

    @Override
    public int getPrice() {
        return audi.getPrice() + modelPrice;
    }

    @Override
    public void showPrice() {

        System.out.println(modelName + " 의 가격은 " + getPrice() + " 원 입니다.");
    }
}
