package com.company;

public class Exercises {
    String a = "there";
    String b = "be";
    String c = "a";
    String d = "lot";
    String e = "of";
    String f = "few";
    String g = "big";
    String h = "booty";
    String i = "bitches";
    String j = "around";
    String k = "here";

    int bitches = 3;

    public void Exercise01() {

        if (bitches <= 5) {
            //this is the bit that capitalizes the first letter
            a = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
            System.out.println(a + " " + b + " " + c + " " + f + " " + g + " " + h + " " + i + " " + j + " " + k);
        } else {
            //this is the bit that capitalizes the first letter
            a = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase();
            System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + g + " " + h + " " + i + " " + j + " " + k);
        }
    }

    public void Exercise02() {
        String[] bbb = {"there", "be", "a", "lot", "of", "few", "big", "booty", "bitches", "around", "here"};
        //this is the bit that capitalizes the first letter
        bbb[0] = bbb[0].substring(0, 1).toUpperCase() + bbb[0].substring(1).toLowerCase();
        if (bitches <= 5) {
            System.out.println(bbb[0] + " " + bbb[1] + " " + bbb[2] + " " + bbb[5] + " " + bbb[6] + " " + bbb[7] + " " + bbb[8] + " " + bbb[9] + " " + bbb[10]);
        } else {
            System.out.println(bbb[0] + " " + bbb[1] + " " + bbb[2] + " " + bbb[3] + " " + bbb[4] + " " + bbb[6] + " " + bbb[7] + " " + bbb[8] + " " + bbb[9] + " " + bbb[10]);
        }
    }

    public void Exercise03a(double a, double b) {
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of a triangle with one side " + a + "cm and the other: " + b + "cm is " + hypotenuse + "cm");
    }

    public void Exercise03b(double x, String currency) {
        double bgn_to_dkk = x * 3.82;
        double dkk_to_bgn = x / 3.82;
        String bgn;
        String dkk;
        String sorm;
        String[] smterms = {"Bulgarian lev", "Bulgarian leva", "Danish krone", "Danish kroner"};

        if (x == 1) {
            bgn = smterms[0];
            dkk= smterms[2];
            sorm = " is";
        }
        else {
            bgn= smterms[1];
            dkk= smterms[3];
            sorm = " are";
        }

        //never use == to compare strings, since == only works if you've pre-defined your strings, equals() checks if every letter from string 1
        //checks out with every letter from string 2
        if (currency.equalsIgnoreCase("dkk")) {
            System.out.println(x + " " +  dkk + sorm + " equivalent to " + dkk_to_bgn + " " + bgn);
        }

        else if (currency.equalsIgnoreCase("bgn")) {
            System.out.println(x + " " +  bgn + sorm  + " equivalent to " + bgn_to_dkk + " " + dkk);
        }

        else {
            System.out.println("We do not support this currency");
        }
    }
}