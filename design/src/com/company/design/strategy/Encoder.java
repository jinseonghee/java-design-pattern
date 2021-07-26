package com.company.design.strategy;

public class Encoder { //그때 그때마다 전략을 주입받음

    private EncodingStrategy encodingStrategy;

    public String getMessage(String message) {
        return this.encodingStrategy.encode(message);
    }

    public void setEncodingStrategy(EncodingStrategy encodingStrategy) {
        this.encodingStrategy = encodingStrategy;
    }


}
