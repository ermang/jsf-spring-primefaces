package com.eg.jsf.spring.primefaces;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;


@ManagedBean

@RequestScoped
public class Message {
    private String message = "Hello World!";

    @ManagedProperty("#{compy}")
    private Compy compy;

    public String getMessage() {
        System.out.println("compy=" + compy);
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Compy getCompy() {
        return compy;
    }

    public void setCompy(Compy compy) {
        this.compy = compy;
    }
}