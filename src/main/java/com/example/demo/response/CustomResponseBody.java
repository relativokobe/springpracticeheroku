package com.example.demo.response;

import java.io.Serializable;


public class CustomResponseBody implements Serializable {
    public int code;
    public Object body;

    public CustomResponseBody(final int code, final Object body) {
        this.code = code;
        this.body = body;
    }
}
