package com.mohamedelkhazen.rest.webservices.restfulwebservices.controller;

/**
 * @author Mohamed Elkahzen
 * @25/03/2022 - 1:10 PM
 * @project restful-web-services
 */
public class HelloWorldBean {
    private String message;

    public HelloWorldBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloWorldBean{" +
                "message='" + message + '\'' +
                '}';
    }

}
