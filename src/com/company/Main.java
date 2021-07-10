package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(info(45,12));
        System.out.println(info(24,16));
        System.out.println(info(15,29));
        System.out.println(info(30,39));
        System.out.println(info(34,25));
    }
    public static String info(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять 1";
        }
        else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять 2";
        }
        else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять 3";
        }
        else {
            return "Оставайтесь дома ";
        }
    }
}
