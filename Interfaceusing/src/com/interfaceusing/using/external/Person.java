package com.interfaceusing.using.external;

import com.interfaceusing.using.internal.interimple.Metro;

public class Person implements Metro {
    @Override
    public void cost() {
        System.out.println("Running the cost method in Person");
    }
}
