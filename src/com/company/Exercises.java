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

    public void Exercise03(double a, double b) {
        double hypotenuse = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        System.out.println("The hypotenuse of a triangle with one side " + a + "cm and the other: " + b + "cm is " + hypotenuse + "cm");
    }
}