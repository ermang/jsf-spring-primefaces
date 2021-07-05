package com.eg.jsf.spring.primefaces;

import org.springframework.stereotype.Component;

@Component
public class Compy {
    private String msg = "lolololo";

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Compy{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
