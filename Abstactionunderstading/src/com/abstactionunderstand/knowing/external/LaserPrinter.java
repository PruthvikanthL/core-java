package com.abstactionunderstand.knowing.external;

public class LaserPrinter implements Printer{
    @Override
    public void ink() {
        System.out.println("Running the ink method in the LaserPrinter class");
    }
}
