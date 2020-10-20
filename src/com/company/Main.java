package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        var doubleValue = 10_000_000.53;

        var numF = NumberFormat.getNumberInstance();
        System.out.println("Number: " + numF.format(doubleValue));


        var intF = NumberFormat.getIntegerInstance();
        System.out.println("Number: " + intF.format(doubleValue));


        intF.setGroupingUsed(false);
        System.out.println("Number: " + intF.format(doubleValue));

        var locale = Locale.getDefault();
        var localFormatter = NumberFormat.getNumberInstance(locale);
        System.out.println("Number: " + localFormatter.format(doubleValue));

        var locale2 = new Locale("de", "DE");
        var localFormatter2 = NumberFormat.getNumberInstance(locale2);
        System.out.println("Number: " + localFormatter2.format(doubleValue));


        var currencyFormatter = NumberFormat.getCurrencyInstance();
        System.out.println("Number: " + currencyFormatter.format(doubleValue));


        var df = new DecimalFormat("$00.0");
        System.out.println("Number: " + df.format(doubleValue));
    }
}
