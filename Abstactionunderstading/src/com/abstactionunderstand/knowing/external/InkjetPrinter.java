package com.abstactionunderstand.knowing.external;

public class InkjetPrinter implements Printer{

    @Override
    public void ink() {
        System.out.println("Running the ink method in the InkjetPrinter class");
    }
}
