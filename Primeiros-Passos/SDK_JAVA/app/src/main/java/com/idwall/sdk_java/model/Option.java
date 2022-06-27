package com.idwall.sdk_java.model;

public class Option {
    private final String field1;
    private final String field2;
    private final String field3;

    public Option(String field1, String field2, String field3) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
    }

    @Override
    public String toString() {
        return field1;
    }
}
