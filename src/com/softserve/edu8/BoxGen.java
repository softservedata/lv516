package com.softserve.edu8;

import java.io.Serializable;

public class BoxGen<T extends Serializable> {
    private T obj;

    public T get() {
        return obj;
    }

    public void set(T obj) {
        this.obj = obj;
    }

//    public static T todo() { // Error
//    }
}
