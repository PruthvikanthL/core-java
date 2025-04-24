package com.abstactionunderstand.knowing.external;

import com.abstactionunderstand.knowing.internal.JDBC;

public class OracleJDBC implements JDBC {
    @Override
    public void save() {
        System.out.println("Running the save method in the oracleJDBC class");
    }
}
