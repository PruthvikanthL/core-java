package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.Database;

public class MySQLDatabase implements Database {

    @Override
    public void data() {
        System.out.println("Running the data method in the MySQLDatabase class");
    }
}
