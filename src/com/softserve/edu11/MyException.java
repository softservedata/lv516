package com.softserve.edu11;

public class MyException extends Exception {
    
    private static final long serialVersionUID = 1L;

    public MyException(String msg) {
        super(msg);
    }

    // Empty constructor
    public MyException() {
    }

}
