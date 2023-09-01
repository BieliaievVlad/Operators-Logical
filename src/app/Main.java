package app;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static double gain;
    static String CURRENCY = "UAH";
    static double tax;
    static Scanner sc;

    public static void main(String[] args) {

        sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);

        System.out.print("Enter amount of income, UAH:");
        gain = sc.nextDouble();

        if (gain>0 & gain<=10000.00){
            tax = gain*2.5/100;
            System.out.printf("%nThe tax amount is, %s: %.2f.", CURRENCY, tax);
        } else if (gain>=10001.00 & gain<= 25001.00) {
            tax = gain*4.3/100;
            System.out.printf("%nThe tax amount is, %s: %.2f.", CURRENCY, tax);
        } else if (gain>25001.00) {
            tax = gain*6.7/100;
            System.out.printf("%nThe tax amount is, %s: %.2f.", CURRENCY, tax);
        } else if (gain<=0) {
            System.out.printf("%nWe are very sorry.");

        }
        sc.close();


    }


}
