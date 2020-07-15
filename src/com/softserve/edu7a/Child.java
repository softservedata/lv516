package com.softserve.edu7a;

import com.softserve.edu7.Parent;

public class Child extends Parent {
    
    //@Override
    int f() {   // Architecture Error, No Override
        return 2;
    }
}