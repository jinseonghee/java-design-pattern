package com.company.design.strategy;

public class AppendStragegy implements EncodingStrategy {

    @Override
    public String encode(String text) {
        return "ABCD" + text;
    }
}
